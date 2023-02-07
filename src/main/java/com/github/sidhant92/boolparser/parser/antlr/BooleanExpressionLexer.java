package com.github.sidhant92.boolparser.parser.antlr;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BooleanExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, IN=2, TO=3, AND=4, OR=5, NOT=6, TRUE=7, FALSE=8, NE=9, GT=10, 
		GE=11, LT=12, LE=13, EQ=14, LPAREN=15, RPAREN=16, DECIMAL=17, INTEGER=18, 
		APP_VERSION=19, WS=20, WORD=21, ALPHANUMERIC=22, SQ=23, DQ=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "IN", "TO", "AND", "OR", "NOT", "TRUE", "FALSE", "NE", "GT", 
			"GE", "LT", "LE", "EQ", "LPAREN", "RPAREN", "DECIMAL", "INTEGER", "APP_VERSION", 
			"WS", "WORD", "ALPHANUMERIC", "SQ", "DQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, null, null, null, null, null, null, "'!='", "'>'", 
			"'>='", "'<'", "'<='", "'='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "IN", "TO", "AND", "OR", "NOT", "TRUE", "FALSE", "NE", "GT", 
			"GE", "LT", "LE", "EQ", "LPAREN", "RPAREN", "DECIMAL", "INTEGER", "APP_VERSION", 
			"WS", "WORD", "ALPHANUMERIC", "SQ", "DQ"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public BooleanExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BooleanExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0018\u00be\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002>\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003H\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004P\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005X\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006b\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007n\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0004\u0010\u0084\b\u0010\u000b\u0010\f\u0010\u0085\u0001\u0010\u0001"+
		"\u0010\u0004\u0010\u008a\b\u0010\u000b\u0010\f\u0010\u008b\u0001\u0011"+
		"\u0004\u0011\u008f\b\u0011\u000b\u0011\f\u0011\u0090\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0096\b\u0012\n\u0012\f\u0012\u0099\t\u0012"+
		"\u0001\u0013\u0004\u0013\u009c\b\u0013\u000b\u0013\f\u0013\u009d\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0004\u0014\u00a7\b\u0014\u000b\u0014\f\u0014\u00a8\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u00af\b\u0016\n\u0016"+
		"\f\u0016\u00b2\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u00b8\b\u0017\n\u0017\f\u0017\u00bb\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0002\u00b0\u00b9\u0000\u0018\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\u0004\u0001\u0000"+
		"09\u0003\u0000\t\n\f\r  \u0002\u0000-.__\u0003\u000009AZaz\u00d2\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u00037\u0001\u0000"+
		"\u0000\u0000\u0005=\u0001\u0000\u0000\u0000\u0007G\u0001\u0000\u0000\u0000"+
		"\tO\u0001\u0000\u0000\u0000\u000bW\u0001\u0000\u0000\u0000\ra\u0001\u0000"+
		"\u0000\u0000\u000fm\u0001\u0000\u0000\u0000\u0011o\u0001\u0000\u0000\u0000"+
		"\u0013r\u0001\u0000\u0000\u0000\u0015t\u0001\u0000\u0000\u0000\u0017w"+
		"\u0001\u0000\u0000\u0000\u0019y\u0001\u0000\u0000\u0000\u001b|\u0001\u0000"+
		"\u0000\u0000\u001d~\u0001\u0000\u0000\u0000\u001f\u0080\u0001\u0000\u0000"+
		"\u0000!\u0083\u0001\u0000\u0000\u0000#\u008e\u0001\u0000\u0000\u0000%"+
		"\u0092\u0001\u0000\u0000\u0000\'\u009b\u0001\u0000\u0000\u0000)\u00a6"+
		"\u0001\u0000\u0000\u0000+\u00aa\u0001\u0000\u0000\u0000-\u00ac\u0001\u0000"+
		"\u0000\u0000/\u00b5\u0001\u0000\u0000\u000012\u0005,\u0000\u00002\u0002"+
		"\u0001\u0000\u0000\u000034\u0005I\u0000\u000048\u0005N\u0000\u000056\u0005"+
		"i\u0000\u000068\u0005n\u0000\u000073\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u00008\u0004\u0001\u0000\u0000\u00009:\u0005T\u0000\u0000:>\u0005"+
		"O\u0000\u0000;<\u0005t\u0000\u0000<>\u0005o\u0000\u0000=9\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000>\u0006\u0001\u0000\u0000\u0000"+
		"?@\u0005A\u0000\u0000@A\u0005N\u0000\u0000AH\u0005D\u0000\u0000BC\u0005"+
		"a\u0000\u0000CD\u0005n\u0000\u0000DH\u0005d\u0000\u0000EF\u0005&\u0000"+
		"\u0000FH\u0005&\u0000\u0000G?\u0001\u0000\u0000\u0000GB\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000H\b\u0001\u0000\u0000\u0000IJ\u0005O\u0000"+
		"\u0000JP\u0005R\u0000\u0000KL\u0005o\u0000\u0000LP\u0005r\u0000\u0000"+
		"MN\u0005|\u0000\u0000NP\u0005|\u0000\u0000OI\u0001\u0000\u0000\u0000O"+
		"K\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000P\n\u0001\u0000\u0000"+
		"\u0000QR\u0005N\u0000\u0000RS\u0005O\u0000\u0000SX\u0005T\u0000\u0000"+
		"TU\u0005n\u0000\u0000UV\u0005o\u0000\u0000VX\u0005t\u0000\u0000WQ\u0001"+
		"\u0000\u0000\u0000WT\u0001\u0000\u0000\u0000X\f\u0001\u0000\u0000\u0000"+
		"YZ\u0005T\u0000\u0000Z[\u0005R\u0000\u0000[\\\u0005U\u0000\u0000\\b\u0005"+
		"E\u0000\u0000]^\u0005t\u0000\u0000^_\u0005r\u0000\u0000_`\u0005u\u0000"+
		"\u0000`b\u0005e\u0000\u0000aY\u0001\u0000\u0000\u0000a]\u0001\u0000\u0000"+
		"\u0000b\u000e\u0001\u0000\u0000\u0000cd\u0005F\u0000\u0000de\u0005A\u0000"+
		"\u0000ef\u0005L\u0000\u0000fg\u0005S\u0000\u0000gn\u0005E\u0000\u0000"+
		"hi\u0005f\u0000\u0000ij\u0005a\u0000\u0000jk\u0005l\u0000\u0000kl\u0005"+
		"s\u0000\u0000ln\u0005e\u0000\u0000mc\u0001\u0000\u0000\u0000mh\u0001\u0000"+
		"\u0000\u0000n\u0010\u0001\u0000\u0000\u0000op\u0005!\u0000\u0000pq\u0005"+
		"=\u0000\u0000q\u0012\u0001\u0000\u0000\u0000rs\u0005>\u0000\u0000s\u0014"+
		"\u0001\u0000\u0000\u0000tu\u0005>\u0000\u0000uv\u0005=\u0000\u0000v\u0016"+
		"\u0001\u0000\u0000\u0000wx\u0005<\u0000\u0000x\u0018\u0001\u0000\u0000"+
		"\u0000yz\u0005<\u0000\u0000z{\u0005=\u0000\u0000{\u001a\u0001\u0000\u0000"+
		"\u0000|}\u0005=\u0000\u0000}\u001c\u0001\u0000\u0000\u0000~\u007f\u0005"+
		"(\u0000\u0000\u007f\u001e\u0001\u0000\u0000\u0000\u0080\u0081\u0005)\u0000"+
		"\u0000\u0081 \u0001\u0000\u0000\u0000\u0082\u0084\u0007\u0000\u0000\u0000"+
		"\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0005.\u0000\u0000\u0088"+
		"\u008a\u0007\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\"\u0001\u0000\u0000\u0000\u008d\u008f"+
		"\u0007\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091$\u0001\u0000\u0000\u0000\u0092\u0097\u0007"+
		"\u0000\u0000\u0000\u0093\u0094\u0005.\u0000\u0000\u0094\u0096\u0007\u0000"+
		"\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098&\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u009a\u009c\u0007\u0001\u0000\u0000\u009b\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0006\u0013\u0000\u0000\u00a0(\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a7\u0003+\u0015\u0000\u00a2\u00a7\u0007\u0002\u0000\u0000\u00a3"+
		"\u00a7\u0003-\u0016\u0000\u00a4\u00a7\u0003/\u0017\u0000\u00a5\u00a7\u0003"+
		"%\u0012\u0000\u00a6\u00a1\u0001\u0000\u0000\u0000\u00a6\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a9*\u0001\u0000\u0000\u0000\u00aa\u00ab\u0007\u0003\u0000"+
		"\u0000\u00ab,\u0001\u0000\u0000\u0000\u00ac\u00b0\u0005\'\u0000\u0000"+
		"\u00ad\u00af\t\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\'\u0000\u0000\u00b4."+
		"\u0001\u0000\u0000\u0000\u00b5\u00b9\u0005\"\u0000\u0000\u00b6\u00b8\t"+
		"\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005\"\u0000\u0000\u00bd0\u0001\u0000"+
		"\u0000\u0000\u0011\u00007=GOWam\u0085\u008b\u0090\u0097\u009d\u00a6\u00a8"+
		"\u00b0\u00b9\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}