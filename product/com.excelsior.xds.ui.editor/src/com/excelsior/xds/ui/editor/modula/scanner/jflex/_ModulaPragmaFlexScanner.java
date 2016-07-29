/* The following code was generated by JFlex 1.4.3 on 3/5/14 4:52 PM */

package com.excelsior.xds.ui.editor.modula.scanner.jflex;

import com.excelsior.xds.ui.editor.modula.ModulaTokens;
import com.excelsior.xds.ui.editor.commons.scanner.jflex.IFlexScanner;
import com.excelsior.xds.ui.commons.syntaxcolor.TokenDescriptor;
import com.excelsior.xds.ui.commons.syntaxcolor.SpecialTokenDescriptors;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/5/14 4:52 PM from the specification file
 * <tt>C:/Lapukhov/MyProjects/k26/work/product/com.excelsior.xds.ui.editor/src/com/excelsior/xds/ui/editor/modula/scanner/jflex/modula2-pragmas.flex</tt>
 */
@SuppressWarnings("unused")
public class _ModulaPragmaFlexScanner implements IFlexScanner {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\2\1\1\0\2\1\22\0\1\1\17\0\12\3\7\0\1\21"+
    "\2\2\1\12\1\4\1\10\1\2\1\14\1\7\2\2\1\5\1\2"+
    "\1\11\1\17\1\16\1\2\1\22\1\6\1\13\1\20\1\2\1\15"+
    "\3\2\4\0\1\2\1\0\32\2\3\0\1\23\53\0\1\2\12\0"+
    "\1\2\4\0\1\2\5\0\27\2\1\0\37\2\1\0\u013f\2\31\0"+
    "\162\2\4\0\14\2\16\0\5\2\11\0\1\2\213\0\1\2\13\0"+
    "\1\2\1\0\3\2\1\0\1\2\1\0\24\2\1\0\54\2\1\0"+
    "\46\2\1\0\5\2\4\0\202\2\10\0\105\2\1\0\46\2\2\0"+
    "\2\2\6\0\20\2\41\0\46\2\2\0\1\2\7\0\47\2\110\0"+
    "\33\2\5\0\3\2\56\0\32\2\5\0\13\2\25\0\12\3\4\0"+
    "\2\2\1\0\143\2\1\0\1\2\17\0\2\2\7\0\2\2\12\3"+
    "\3\2\2\0\1\2\20\0\1\2\1\0\36\2\35\0\3\2\60\0"+
    "\46\2\13\0\1\2\u0152\0\66\2\3\0\1\2\22\0\1\2\7\0"+
    "\12\2\4\0\12\3\25\0\10\2\2\0\2\2\2\0\26\2\1\0"+
    "\7\2\1\0\1\2\3\0\4\2\3\0\1\2\36\0\2\2\1\0"+
    "\3\2\4\0\12\3\2\2\23\0\6\2\4\0\2\2\2\0\26\2"+
    "\1\0\7\2\1\0\2\2\1\0\2\2\1\0\2\2\37\0\4\2"+
    "\1\0\1\2\7\0\12\3\2\0\3\2\20\0\11\2\1\0\3\2"+
    "\1\0\26\2\1\0\7\2\1\0\2\2\1\0\5\2\3\0\1\2"+
    "\22\0\1\2\17\0\2\2\4\0\12\3\25\0\10\2\2\0\2\2"+
    "\2\0\26\2\1\0\7\2\1\0\2\2\1\0\5\2\3\0\1\2"+
    "\36\0\2\2\1\0\3\2\4\0\12\3\1\0\1\2\21\0\1\2"+
    "\1\0\6\2\3\0\3\2\1\0\4\2\3\0\2\2\1\0\1\2"+
    "\1\0\2\2\3\0\2\2\3\0\3\2\3\0\10\2\1\0\3\2"+
    "\55\0\11\3\25\0\10\2\1\0\3\2\1\0\27\2\1\0\12\2"+
    "\1\0\5\2\46\0\2\2\4\0\12\3\25\0\10\2\1\0\3\2"+
    "\1\0\27\2\1\0\12\2\1\0\5\2\3\0\1\2\40\0\1\2"+
    "\1\0\2\2\4\0\12\3\25\0\10\2\1\0\3\2\1\0\27\2"+
    "\1\0\20\2\46\0\2\2\4\0\12\3\25\0\22\2\3\0\30\2"+
    "\1\0\11\2\1\0\1\2\2\0\7\2\72\0\60\2\1\0\2\2"+
    "\14\0\7\2\11\0\12\3\47\0\2\2\1\0\1\2\2\0\2\2"+
    "\1\0\1\2\2\0\1\2\6\0\4\2\1\0\7\2\1\0\3\2"+
    "\1\0\1\2\1\0\1\2\2\0\2\2\1\0\4\2\1\0\2\2"+
    "\11\0\1\2\2\0\5\2\1\0\1\2\11\0\12\3\2\0\2\2"+
    "\42\0\1\2\37\0\12\3\26\0\10\2\1\0\42\2\35\0\4\2"+
    "\164\0\42\2\1\0\5\2\1\0\2\2\25\0\12\3\6\0\6\2"+
    "\112\0\46\2\12\0\51\2\7\0\132\2\5\0\104\2\5\0\122\2"+
    "\6\0\7\2\1\0\77\2\1\0\1\2\1\0\4\2\2\0\7\2"+
    "\1\0\1\2\1\0\4\2\2\0\47\2\1\0\1\2\1\0\4\2"+
    "\2\0\37\2\1\0\1\2\1\0\4\2\2\0\7\2\1\0\1\2"+
    "\1\0\4\2\2\0\7\2\1\0\7\2\1\0\27\2\1\0\37\2"+
    "\1\0\1\2\1\0\4\2\2\0\7\2\1\0\47\2\1\0\23\2"+
    "\16\0\11\3\56\0\125\2\14\0\u026c\2\2\0\10\2\12\0\32\2"+
    "\5\0\113\2\25\0\15\2\1\0\4\2\16\0\22\2\16\0\22\2"+
    "\16\0\15\2\1\0\3\2\17\0\64\2\43\0\1\2\4\0\1\2"+
    "\3\0\12\3\46\0\12\3\6\0\130\2\10\0\51\2\127\0\35\2"+
    "\51\0\12\3\36\2\2\0\5\2\u038b\0\154\2\224\0\234\2\4\0"+
    "\132\2\6\0\26\2\2\0\6\2\2\0\46\2\2\0\6\2\2\0"+
    "\10\2\1\0\1\2\1\0\1\2\1\0\1\2\1\0\37\2\2\0"+
    "\65\2\1\0\7\2\1\0\1\2\3\0\3\2\1\0\7\2\3\0"+
    "\4\2\2\0\6\2\4\0\15\2\5\0\3\2\1\0\7\2\164\0"+
    "\1\2\15\0\1\2\202\0\1\2\4\0\1\2\2\0\12\2\1\0"+
    "\1\2\3\0\5\2\6\0\1\2\1\0\1\2\1\0\1\2\1\0"+
    "\4\2\1\0\3\2\1\0\7\2\3\0\3\2\5\0\5\2\u0ebb\0"+
    "\2\2\52\0\5\2\5\0\2\2\4\0\126\2\6\0\3\2\1\0"+
    "\132\2\1\0\4\2\5\0\50\2\4\0\136\2\21\0\30\2\70\0"+
    "\20\2\u0200\0\u19b6\2\112\0\u51a6\2\132\0\u048d\2\u0773\0\u2ba4\2\u215c\0"+
    "\u012e\2\2\0\73\2\225\0\7\2\14\0\5\2\5\0\1\2\1\0"+
    "\12\2\1\0\15\2\1\0\5\2\1\0\1\2\1\0\2\2\1\0"+
    "\2\2\1\0\154\2\41\0\u016b\2\22\0\100\2\2\0\66\2\50\0"+
    "\14\2\164\0\5\2\1\0\207\2\23\0\12\3\7\0\32\2\6\0"+
    "\32\2\13\0\131\2\3\0\6\2\2\0\6\2\2\0\6\2\2\0"+
    "\3\2\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\11\1\1\3\2\1\1\3\14\1";

  private static int [] zzUnpackAction() {
    int [] result = new int[28];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\24\0\50\0\74\0\120\0\144\0\170\0\214"+
    "\0\240\0\264\0\310\0\334\0\24\0\360\0\u0104\0\74"+
    "\0\u0118\0\u012c\0\u0140\0\u0154\0\u0168\0\u017c\0\u0190\0\u01a4"+
    "\0\u01b8\0\u01cc\0\u01e0\0\u01f4";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[28];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\2\4\1\6\1\4"+
    "\1\7\1\10\1\11\2\4\1\12\1\13\1\4\1\14"+
    "\1\4\1\15\25\0\1\3\24\0\21\4\3\0\3\4"+
    "\1\16\3\4\1\17\11\4\3\0\6\4\1\20\12\4"+
    "\3\0\2\4\1\21\12\4\1\22\3\4\3\0\2\4"+
    "\1\23\16\4\3\0\12\4\1\24\6\4\3\0\15\4"+
    "\1\25\1\26\2\4\3\0\20\4\1\20\3\0\7\4"+
    "\1\17\11\4\3\0\4\4\1\27\14\4\3\0\10\4"+
    "\1\20\10\4\3\0\13\4\1\20\5\4\3\0\11\4"+
    "\1\20\7\4\3\0\6\4\1\30\12\4\3\0\2\4"+
    "\1\31\16\4\3\0\14\4\1\20\4\4\3\0\4\4"+
    "\1\32\14\4\3\0\2\4\1\20\2\4\1\6\13\4"+
    "\3\0\5\4\1\33\13\4\3\0\7\4\1\20\11\4"+
    "\3\0\12\4\1\20\6\4\3\0\7\4\1\34\11\4"+
    "\3\0\2\4\1\17\16\4\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[520];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\12\1\1\11\17\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[28];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** nesting level of rule */
  private int nestLevel = 0;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _ModulaPragmaFlexScanner() {
      this((java.io.Reader)null);
  }


  public _ModulaPragmaFlexScanner(java.io.Reader in) {
    zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _ModulaPragmaFlexScanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1244) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  private final void setTokenOffset(int offset){
    zzStartRead = offset;
  }

  public final int getTokenOffset(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenOffset() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    nestLevel = 0;
    zzBuffer  = buffer;
    zzCurrentPos  = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF   = false;
    zzAtBOL   = true;
    zzEndRead = end;
    yychar    = 0;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
        return;

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public TokenDescriptor nextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 2: 
          { return SpecialTokenDescriptors.WHITESPACE;
          }
        case 4: break;
        case 1: 
          { return ModulaTokens.Pragma.getToken();
          }
        case 5: break;
        case 3: 
          { return ModulaTokens.PragmaKeyword.getToken();
          }
        case 6: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {
                return SpecialTokenDescriptors.EOF;
              }
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
