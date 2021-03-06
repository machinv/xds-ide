package com.excelsior.xds.ui.editor.modula.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;

import com.excelsior.xds.core.search.modula.ModulaSearchInput;
import com.excelsior.xds.ui.commons.utils.WorkbenchUtils;
import com.excelsior.xds.ui.editor.internal.nls.Messages;
import com.excelsior.xds.ui.editor.modula.ModulaEditor;

public class FindDeclarationsProjectAction extends FindAction {

	public FindDeclarationsProjectAction(ModulaEditor editor) {
		super(editor, Messages.FindDeclarationsProjectAction_Project, Messages.FindDeclarationsProjectAction_SearchDeclsOfSelInPrj);
	}

	@Override
	protected int getLimitTo() {
		return ModulaSearchInput.LIMIT_TO_DECLARATIONS;
	}

	@Override
	protected IResource getSearchScope() {
		IFile activeFile = WorkbenchUtils.getActiveFile();
		if (activeFile != null) {
			return activeFile.getProject();
		}
		return null;
	}
}
