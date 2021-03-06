// Generated from C:/Users/Harry/Desktop/Lua/lua-plus-plus/src/main/java/org/luapp/language/parser\luapp.g4 by ANTLR 4.8
package org.luapp.language.generator;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class luappParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, NAME=69, NORMALSTRING=70, CHARSTRING=71, LONGSTRING=72, 
		INT=73, HEX=74, FLOAT=75, HEX_FLOAT=76, COMMENT=77, LINE_COMMENT=78, WS=79, 
		SHEBANG=80;
	public static final int
		RULE_chunk = 0, RULE_block = 1, RULE_stat = 2, RULE_retstat = 3, RULE_label = 4, 
		RULE_funcname = 5, RULE_classname = 6, RULE_abstractclassname = 7, RULE_varlist = 8, 
		RULE_namelist = 9, RULE_explist = 10, RULE_exp = 11, RULE_prefixexp = 12, 
		RULE_functioncall = 13, RULE_varOrExp = 14, RULE_var = 15, RULE_varSuffix = 16, 
		RULE_nameAndArgs = 17, RULE_args = 18, RULE_functiondef = 19, RULE_funcbody = 20, 
		RULE_parlist = 21, RULE_tableconstructor = 22, RULE_fieldlist = 23, RULE_field = 24, 
		RULE_fieldsep = 25, RULE_operatorOr = 26, RULE_operatorAnd = 27, RULE_operatorComparison = 28, 
		RULE_operatorStrcat = 29, RULE_operatorAddSub = 30, RULE_operatorMulDivMod = 31, 
		RULE_operatorBitwise = 32, RULE_operatorUnary = 33, RULE_operatorPower = 34, 
		RULE_number = 35, RULE_string = 36, RULE_newclass = 37, RULE_classdef = 38, 
		RULE_classfunction = 39, RULE_classstaticfunction = 40, RULE_classgetorset = 41, 
		RULE_classgetset = 42, RULE_constructor = 43, RULE_classmember = 44, RULE_classbody = 45, 
		RULE_addOne = 46, RULE_plusEqual = 47, RULE_multiplyEqual = 48, RULE_divEqual = 49, 
		RULE_minusEqual = 50, RULE_safeOperator = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"chunk", "block", "stat", "retstat", "label", "funcname", "classname", 
			"abstractclassname", "varlist", "namelist", "explist", "exp", "prefixexp", 
			"functioncall", "varOrExp", "var", "varSuffix", "nameAndArgs", "args", 
			"functiondef", "funcbody", "parlist", "tableconstructor", "fieldlist", 
			"field", "fieldsep", "operatorOr", "operatorAnd", "operatorComparison", 
			"operatorStrcat", "operatorAddSub", "operatorMulDivMod", "operatorBitwise", 
			"operatorUnary", "operatorPower", "number", "string", "newclass", "classdef", 
			"classfunction", "classstaticfunction", "classgetorset", "classgetset", 
			"constructor", "classmember", "classbody", "addOne", "plusEqual", "multiplyEqual", 
			"divEqual", "minusEqual", "safeOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'break'", "'goto'", "'do'", "'end'", "'while'", 
			"'repeat'", "'until'", "'if'", "'then'", "'elseif'", "'else'", "'for'", 
			"','", "'in'", "'function'", "'class'", "'extends'", "'local'", "'safe'", 
			"'return'", "'::'", "'.'", "':'", "'nil'", "'false'", "'true'", "'...'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'or'", "'and'", "'<'", "'>'", 
			"'<='", "'>='", "'~='", "'=='", "'..'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'//'", "'&'", "'|'", "'~'", "'<<'", "'>>'", "'not'", "'#'", "'^'", "'new'", 
			"'static'", "'get'", "'set'", "'constructor'", "'++'", "'+='", "'*='", 
			"'/='", "'-='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "NAME", "NORMALSTRING", 
			"CHARSTRING", "LONGSTRING", "INT", "HEX", "FLOAT", "HEX_FLOAT", "COMMENT", 
			"LINE_COMMENT", "WS", "SHEBANG"
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

	@Override
	public String getGrammarFileName() { return "luapp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public luappParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ChunkContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(luappParser.EOF, 0); }
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitChunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChunkContext chunk() throws RecognitionException {
		ChunkContext _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			block();
			setState(105);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public RetstatContext retstat() {
			return getRuleContext(RetstatContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__29))) != 0) || _la==NAME) {
				{
				{
				setState(107);
				stat();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(113);
				retstat();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode NAME() { return getToken(luappParser.NAME, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public ClassbodyContext classbody() {
			return getRuleContext(ClassbodyContext.class,0);
		}
		public AbstractclassnameContext abstractclassname() {
			return getRuleContext(AbstractclassnameContext.class,0);
		}
		public SafeOperatorContext safeOperator() {
			return getRuleContext(SafeOperatorContext.class,0);
		}
		public NewclassContext newclass() {
			return getRuleContext(NewclassContext.class,0);
		}
		public MinusEqualContext minusEqual() {
			return getRuleContext(MinusEqualContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				varlist();
				setState(118);
				match(T__1);
				setState(119);
				explist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				label();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				match(T__3);
				setState(125);
				match(NAME);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				match(T__4);
				setState(127);
				block();
				setState(128);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(130);
				match(T__6);
				setState(131);
				exp(0);
				setState(132);
				match(T__4);
				setState(133);
				block();
				setState(134);
				match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(136);
				match(T__7);
				setState(137);
				block();
				setState(138);
				match(T__8);
				setState(139);
				exp(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(141);
				match(T__9);
				setState(142);
				exp(0);
				setState(143);
				match(T__10);
				setState(144);
				block();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(145);
					match(T__11);
					setState(146);
					exp(0);
					setState(147);
					match(T__10);
					setState(148);
					block();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(155);
					match(T__12);
					setState(156);
					block();
					}
				}

				setState(159);
				match(T__5);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(161);
				match(T__13);
				setState(162);
				match(NAME);
				setState(163);
				match(T__1);
				setState(164);
				exp(0);
				setState(165);
				match(T__14);
				setState(166);
				exp(0);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(167);
					match(T__14);
					setState(168);
					exp(0);
					}
				}

				setState(171);
				match(T__4);
				setState(172);
				block();
				setState(173);
				match(T__5);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(175);
				match(T__13);
				setState(176);
				namelist();
				setState(177);
				match(T__15);
				setState(178);
				explist();
				setState(179);
				match(T__4);
				setState(180);
				block();
				setState(181);
				match(T__5);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(183);
				match(T__16);
				setState(184);
				funcname();
				setState(185);
				funcbody();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(187);
				match(T__17);
				setState(188);
				classname();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(189);
					match(T__18);
					setState(190);
					abstractclassname();
					}
				}

				setState(193);
				classbody();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(195);
				match(T__19);
				setState(196);
				match(T__17);
				setState(197);
				classname();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(198);
					match(T__18);
					setState(199);
					abstractclassname();
					}
				}

				setState(202);
				classbody();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(204);
				match(T__19);
				setState(205);
				match(T__16);
				setState(206);
				match(NAME);
				setState(207);
				funcbody();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(208);
				match(T__19);
				setState(209);
				namelist();
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(210);
					match(T__1);
					setState(211);
					explist();
					}
				}

				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(214);
				match(T__20);
				setState(215);
				safeOperator();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(216);
					match(T__19);
					}
				}

				setState(219);
				namelist();
				setState(220);
				match(T__1);
				setState(221);
				newclass();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(223);
					match(T__19);
					}
				}

				setState(226);
				match(NAME);
				setState(227);
				minusEqual();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetstatContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public RetstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterRetstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitRetstat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitRetstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetstatContext retstat() throws RecognitionException {
		RetstatContext _localctx = new RetstatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_retstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__21);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__25 - 17)) | (1L << (T__26 - 17)) | (1L << (T__27 - 17)) | (1L << (T__28 - 17)) | (1L << (T__29 - 17)) | (1L << (T__33 - 17)) | (1L << (T__45 - 17)) | (1L << (T__52 - 17)) | (1L << (T__55 - 17)) | (1L << (T__56 - 17)) | (1L << (NAME - 17)) | (1L << (NORMALSTRING - 17)) | (1L << (CHARSTRING - 17)) | (1L << (LONGSTRING - 17)) | (1L << (INT - 17)) | (1L << (HEX - 17)) | (1L << (FLOAT - 17)) | (1L << (HEX_FLOAT - 17)))) != 0)) {
				{
				setState(231);
				explist();
				}
			}

			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(234);
				match(T__0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(luappParser.NAME, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__22);
			setState(238);
			match(NAME);
			setState(239);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncnameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(luappParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(luappParser.NAME, i);
		}
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterFuncname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitFuncname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(NAME);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(242);
				match(T__23);
				setState(243);
				match(NAME);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(249);
				match(T__24);
				setState(250);
				match(NAME);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassnameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(luappParser.NAME, 0); }
		public ClassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterClassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitClassname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitClassname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractclassnameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(luappParser.NAME, 0); }
		public AbstractclassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractclassname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterAbstractclassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitAbstractclassname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitAbstractclassname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractclassnameContext abstractclassname() throws RecognitionException {
		AbstractclassnameContext _localctx = new AbstractclassnameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_abstractclassname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarlistContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			var();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(258);
				match(T__14);
				setState(259);
				var();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamelistContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(luappParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(luappParser.NAME, i);
		}
		public NamelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterNamelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitNamelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitNamelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamelistContext namelist() throws RecognitionException {
		NamelistContext _localctx = new NamelistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_namelist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(NAME);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(266);
					match(T__14);
					setState(267);
					match(NAME);
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplistContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_explist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			exp(0);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(274);
				match(T__14);
				setState(275);
				exp(0);
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public OperatorUnaryContext operatorUnary() {
			return getRuleContext(OperatorUnaryContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorPowerContext operatorPower() {
			return getRuleContext(OperatorPowerContext.class,0);
		}
		public OperatorMulDivModContext operatorMulDivMod() {
			return getRuleContext(OperatorMulDivModContext.class,0);
		}
		public OperatorAddSubContext operatorAddSub() {
			return getRuleContext(OperatorAddSubContext.class,0);
		}
		public OperatorStrcatContext operatorStrcat() {
			return getRuleContext(OperatorStrcatContext.class,0);
		}
		public OperatorComparisonContext operatorComparison() {
			return getRuleContext(OperatorComparisonContext.class,0);
		}
		public OperatorAndContext operatorAnd() {
			return getRuleContext(OperatorAndContext.class,0);
		}
		public OperatorOrContext operatorOr() {
			return getRuleContext(OperatorOrContext.class,0);
		}
		public OperatorBitwiseContext operatorBitwise() {
			return getRuleContext(OperatorBitwiseContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				{
				setState(282);
				match(T__25);
				}
				break;
			case T__26:
				{
				setState(283);
				match(T__26);
				}
				break;
			case T__27:
				{
				setState(284);
				match(T__27);
				}
				break;
			case INT:
			case HEX:
			case FLOAT:
			case HEX_FLOAT:
				{
				setState(285);
				number();
				}
				break;
			case NORMALSTRING:
			case CHARSTRING:
			case LONGSTRING:
				{
				setState(286);
				string();
				}
				break;
			case T__28:
				{
				setState(287);
				match(T__28);
				}
				break;
			case T__16:
				{
				setState(288);
				functiondef();
				}
				break;
			case T__29:
			case NAME:
				{
				setState(289);
				prefixexp();
				}
				break;
			case T__33:
				{
				setState(290);
				tableconstructor();
				}
				break;
			case T__45:
			case T__52:
			case T__55:
			case T__56:
				{
				setState(291);
				operatorUnary();
				setState(292);
				exp(8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(328);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(296);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(297);
						operatorPower();
						setState(298);
						exp(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(300);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(301);
						operatorMulDivMod();
						setState(302);
						exp(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(304);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(305);
						operatorAddSub();
						setState(306);
						exp(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(308);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(309);
						operatorStrcat();
						setState(310);
						exp(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(312);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(313);
						operatorComparison();
						setState(314);
						exp(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(316);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(317);
						operatorAnd();
						setState(318);
						exp(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(320);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(321);
						operatorOr();
						setState(322);
						exp(3);
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(324);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(325);
						operatorBitwise();
						setState(326);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrefixexpContext extends ParserRuleContext {
		public VarOrExpContext varOrExp() {
			return getRuleContext(VarOrExpContext.class,0);
		}
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public PrefixexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterPrefixexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitPrefixexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitPrefixexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixexpContext prefixexp() throws RecognitionException {
		PrefixexpContext _localctx = new PrefixexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_prefixexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			varOrExp();
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(334);
					nameAndArgs();
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctioncallContext extends ParserRuleContext {
		public VarOrExpContext varOrExp() {
			return getRuleContext(VarOrExpContext.class,0);
		}
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functioncall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			varOrExp();
			setState(342); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(341);
					nameAndArgs();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(344); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarOrExpContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterVarOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitVarOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitVarOrExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarOrExpContext varOrExp() throws RecognitionException {
		VarOrExpContext _localctx = new VarOrExpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varOrExp);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(T__29);
				setState(348);
				exp(0);
				setState(349);
				match(T__30);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(luappParser.NAME, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<VarSuffixContext> varSuffix() {
			return getRuleContexts(VarSuffixContext.class);
		}
		public VarSuffixContext varSuffix(int i) {
			return getRuleContext(VarSuffixContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(353);
				match(NAME);
				}
				break;
			case T__29:
				{
				setState(354);
				match(T__29);
				setState(355);
				exp(0);
				setState(356);
				match(T__30);
				setState(357);
				varSuffix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(361);
					varSuffix();
					}
					} 
				}
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarSuffixContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NAME() { return getToken(luappParser.NAME, 0); }
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public VarSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterVarSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitVarSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitVarSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSuffixContext varSuffix() throws RecognitionException {
		VarSuffixContext _localctx = new VarSuffixContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (T__24 - 25)) | (1L << (T__29 - 25)) | (1L << (T__33 - 25)) | (1L << (NORMALSTRING - 25)) | (1L << (CHARSTRING - 25)) | (1L << (LONGSTRING - 25)))) != 0)) {
				{
				{
				setState(367);
				nameAndArgs();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				{
				setState(373);
				match(T__31);
				setState(374);
				exp(0);
				setState(375);
				match(T__32);
				}
				break;
			case T__23:
				{
				setState(377);
				match(T__23);
				setState(378);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameAndArgsContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode NAME() { return getToken(luappParser.NAME, 0); }
		public NameAndArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameAndArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterNameAndArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitNameAndArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitNameAndArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameAndArgsContext nameAndArgs() throws RecognitionException {
		NameAndArgsContext _localctx = new NameAndArgsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nameAndArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(381);
				match(T__24);
				setState(382);
				match(NAME);
				}
			}

			setState(385);
			args();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_args);
		int _la;
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(T__29);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__25 - 17)) | (1L << (T__26 - 17)) | (1L << (T__27 - 17)) | (1L << (T__28 - 17)) | (1L << (T__29 - 17)) | (1L << (T__33 - 17)) | (1L << (T__45 - 17)) | (1L << (T__52 - 17)) | (1L << (T__55 - 17)) | (1L << (T__56 - 17)) | (1L << (NAME - 17)) | (1L << (NORMALSTRING - 17)) | (1L << (CHARSTRING - 17)) | (1L << (LONGSTRING - 17)) | (1L << (INT - 17)) | (1L << (HEX - 17)) | (1L << (FLOAT - 17)) | (1L << (HEX_FLOAT - 17)))) != 0)) {
					{
					setState(388);
					explist();
					}
				}

				setState(391);
				match(T__30);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				tableconstructor();
				}
				break;
			case NORMALSTRING:
			case CHARSTRING:
			case LONGSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiondefContext extends ParserRuleContext {
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public FunctiondefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterFunctiondef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitFunctiondef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitFunctiondef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondefContext functiondef() throws RecognitionException {
		FunctiondefContext _localctx = new FunctiondefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functiondef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__16);
			setState(397);
			funcbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncbodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParlistContext parlist() {
			return getRuleContext(ParlistContext.class,0);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterFuncbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitFuncbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitFuncbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(T__29);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28 || _la==NAME) {
				{
				setState(400);
				parlist();
				}
			}

			setState(403);
			match(T__30);
			setState(404);
			block();
			setState(405);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParlistContext extends ParserRuleContext {
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public ParlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterParlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitParlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitParlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParlistContext parlist() throws RecognitionException {
		ParlistContext _localctx = new ParlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parlist);
		int _la;
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				namelist();
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(408);
					match(T__14);
					setState(409);
					match(T__28);
					}
				}

				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(T__28);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableconstructorContext extends ParserRuleContext {
		public FieldlistContext fieldlist() {
			return getRuleContext(FieldlistContext.class,0);
		}
		public TableconstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableconstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterTableconstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitTableconstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitTableconstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableconstructorContext tableconstructor() throws RecognitionException {
		TableconstructorContext _localctx = new TableconstructorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tableconstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(T__33);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__25 - 17)) | (1L << (T__26 - 17)) | (1L << (T__27 - 17)) | (1L << (T__28 - 17)) | (1L << (T__29 - 17)) | (1L << (T__31 - 17)) | (1L << (T__33 - 17)) | (1L << (T__45 - 17)) | (1L << (T__52 - 17)) | (1L << (T__55 - 17)) | (1L << (T__56 - 17)) | (1L << (NAME - 17)) | (1L << (NORMALSTRING - 17)) | (1L << (CHARSTRING - 17)) | (1L << (LONGSTRING - 17)) | (1L << (INT - 17)) | (1L << (HEX - 17)) | (1L << (FLOAT - 17)) | (1L << (HEX_FLOAT - 17)))) != 0)) {
				{
				setState(416);
				fieldlist();
				}
			}

			setState(419);
			match(T__34);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldlistContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<FieldsepContext> fieldsep() {
			return getRuleContexts(FieldsepContext.class);
		}
		public FieldsepContext fieldsep(int i) {
			return getRuleContext(FieldsepContext.class,i);
		}
		public FieldlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterFieldlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitFieldlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitFieldlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldlistContext fieldlist() throws RecognitionException {
		FieldlistContext _localctx = new FieldlistContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fieldlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			field();
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(422);
					fieldsep();
					setState(423);
					field();
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__14) {
				{
				setState(430);
				fieldsep();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NAME() { return getToken(luappParser.NAME, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_field);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(T__31);
				setState(434);
				exp(0);
				setState(435);
				match(T__32);
				setState(436);
				match(T__1);
				setState(437);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(NAME);
				setState(440);
				match(T__1);
				setState(441);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				exp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldsepContext extends ParserRuleContext {
		public FieldsepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldsep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterFieldsep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitFieldsep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitFieldsep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsepContext fieldsep() throws RecognitionException {
		FieldsepContext _localctx = new FieldsepContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fieldsep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorOrContext extends ParserRuleContext {
		public OperatorOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterOperatorOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitOperatorOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitOperatorOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorOrContext operatorOr() throws RecognitionException {
		OperatorOrContext _localctx = new OperatorOrContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_operatorOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(T__35);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorAndContext extends ParserRuleContext {
		public OperatorAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterOperatorAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitOperatorAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitOperatorAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorAndContext operatorAnd() throws RecognitionException {
		OperatorAndContext _localctx = new OperatorAndContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operatorAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(T__36);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorComparisonContext extends ParserRuleContext {
		public OperatorComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterOperatorComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitOperatorComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitOperatorComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorComparisonContext operatorComparison() throws RecognitionException {
		OperatorComparisonContext _localctx = new OperatorComparisonContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operatorComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorStrcatContext extends ParserRuleContext {
		public OperatorStrcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorStrcat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterOperatorStrcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitOperatorStrcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitOperatorStrcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorStrcatContext operatorStrcat() throws RecognitionException {
		OperatorStrcatContext _localctx = new OperatorStrcatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operatorStrcat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(T__43);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorAddSubContext extends ParserRuleContext {
		public OperatorAddSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAddSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterOperatorAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitOperatorAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitOperatorAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorAddSubContext operatorAddSub() throws RecognitionException {
		OperatorAddSubContext _localctx = new OperatorAddSubContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operatorAddSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_la = _input.LA(1);
			if ( !(_la==T__44 || _la==T__45) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorMulDivModContext extends ParserRuleContext {
		public OperatorMulDivModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorMulDivMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterOperatorMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitOperatorMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitOperatorMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorMulDivModContext operatorMulDivMod() throws RecognitionException {
		OperatorMulDivModContext _localctx = new OperatorMulDivModContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operatorMulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorBitwiseContext extends ParserRuleContext {
		public OperatorBitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorBitwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterOperatorBitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitOperatorBitwise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitOperatorBitwise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorBitwiseContext operatorBitwise() throws RecognitionException {
		OperatorBitwiseContext _localctx = new OperatorBitwiseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operatorBitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorUnaryContext extends ParserRuleContext {
		public OperatorUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterOperatorUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitOperatorUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitOperatorUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorUnaryContext operatorUnary() throws RecognitionException {
		OperatorUnaryContext _localctx = new OperatorUnaryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operatorUnary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__52) | (1L << T__55) | (1L << T__56))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorPowerContext extends ParserRuleContext {
		public OperatorPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorPower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterOperatorPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitOperatorPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitOperatorPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorPowerContext operatorPower() throws RecognitionException {
		OperatorPowerContext _localctx = new OperatorPowerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_operatorPower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(T__57);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(luappParser.INT, 0); }
		public TerminalNode HEX() { return getToken(luappParser.HEX, 0); }
		public TerminalNode FLOAT() { return getToken(luappParser.FLOAT, 0); }
		public TerminalNode HEX_FLOAT() { return getToken(luappParser.HEX_FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (INT - 73)) | (1L << (HEX - 73)) | (1L << (FLOAT - 73)) | (1L << (HEX_FLOAT - 73)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode NORMALSTRING() { return getToken(luappParser.NORMALSTRING, 0); }
		public TerminalNode CHARSTRING() { return getToken(luappParser.CHARSTRING, 0); }
		public TerminalNode LONGSTRING() { return getToken(luappParser.LONGSTRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (NORMALSTRING - 70)) | (1L << (CHARSTRING - 70)) | (1L << (LONGSTRING - 70)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewclassContext extends ParserRuleContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public NewclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterNewclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitNewclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitNewclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewclassContext newclass() throws RecognitionException {
		NewclassContext _localctx = new NewclassContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_newclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(T__58);
			setState(470);
			funcname();
			setState(471);
			args();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassdefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(luappParser.NAME, 0); }
		public ClassbodyContext classbody() {
			return getRuleContext(ClassbodyContext.class,0);
		}
		public ClassdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterClassdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitClassdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitClassdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdefContext classdef() throws RecognitionException {
		ClassdefContext _localctx = new ClassdefContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_classdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(T__17);
			setState(474);
			match(NAME);
			setState(475);
			classbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassfunctionContext extends ParserRuleContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public ClassfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterClassfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitClassfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitClassfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassfunctionContext classfunction() throws RecognitionException {
		ClassfunctionContext _localctx = new ClassfunctionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_classfunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(T__16);
			setState(478);
			funcname();
			setState(479);
			funcbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassstaticfunctionContext extends ParserRuleContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public ClassstaticfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classstaticfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterClassstaticfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitClassstaticfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitClassstaticfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassstaticfunctionContext classstaticfunction() throws RecognitionException {
		ClassstaticfunctionContext _localctx = new ClassstaticfunctionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classstaticfunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(T__59);
			setState(482);
			match(T__16);
			setState(483);
			funcname();
			setState(484);
			funcbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassgetorsetContext extends ParserRuleContext {
		public ClassgetorsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classgetorset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterClassgetorset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitClassgetorset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitClassgetorset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassgetorsetContext classgetorset() throws RecognitionException {
		ClassgetorsetContext _localctx = new ClassgetorsetContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_classgetorset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_la = _input.LA(1);
			if ( !(_la==T__60 || _la==T__61) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassgetsetContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(luappParser.NAME, 0); }
		public List<ClassgetorsetContext> classgetorset() {
			return getRuleContexts(ClassgetorsetContext.class);
		}
		public ClassgetorsetContext classgetorset(int i) {
			return getRuleContext(ClassgetorsetContext.class,i);
		}
		public ClassgetsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classgetset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterClassgetset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitClassgetset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitClassgetset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassgetsetContext classgetset() throws RecognitionException {
		ClassgetsetContext _localctx = new ClassgetsetContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_classgetset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(NAME);
			setState(489);
			match(T__33);
			setState(491); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(490);
				classgetorset();
				}
				}
				setState(493); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__60 || _la==T__61 );
			setState(495);
			match(T__34);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParlistContext parlist() {
			return getRuleContext(ParlistContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(T__62);
			setState(498);
			match(T__29);
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28 || _la==NAME) {
				{
				setState(499);
				parlist();
				}
			}

			setState(502);
			match(T__30);
			setState(503);
			block();
			setState(504);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassmemberContext extends ParserRuleContext {
		public ClassfunctionContext classfunction() {
			return getRuleContext(ClassfunctionContext.class,0);
		}
		public ClassgetsetContext classgetset() {
			return getRuleContext(ClassgetsetContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ClassmemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classmember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterClassmember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitClassmember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitClassmember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassmemberContext classmember() throws RecognitionException {
		ClassmemberContext _localctx = new ClassmemberContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_classmember);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				classfunction();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				classgetset();
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				constructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassbodyContext extends ParserRuleContext {
		public List<ClassstaticfunctionContext> classstaticfunction() {
			return getRuleContexts(ClassstaticfunctionContext.class);
		}
		public ClassstaticfunctionContext classstaticfunction(int i) {
			return getRuleContext(ClassstaticfunctionContext.class,i);
		}
		public List<ClassfunctionContext> classfunction() {
			return getRuleContexts(ClassfunctionContext.class);
		}
		public ClassfunctionContext classfunction(int i) {
			return getRuleContext(ClassfunctionContext.class,i);
		}
		public List<ClassgetsetContext> classgetset() {
			return getRuleContexts(ClassgetsetContext.class);
		}
		public ClassgetsetContext classgetset(int i) {
			return getRuleContext(ClassgetsetContext.class,i);
		}
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
		}
		public ClassbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterClassbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitClassbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitClassbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassbodyContext classbody() throws RecognitionException {
		ClassbodyContext _localctx = new ClassbodyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_classbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__16 - 17)) | (1L << (T__59 - 17)) | (1L << (T__62 - 17)) | (1L << (NAME - 17)))) != 0)) {
				{
				setState(515);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__59:
					{
					setState(511);
					classstaticfunction();
					}
					break;
				case T__16:
					{
					setState(512);
					classfunction();
					}
					break;
				case NAME:
					{
					setState(513);
					classgetset();
					}
					break;
				case T__62:
					{
					setState(514);
					constructor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(520);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddOneContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(luappParser.NAME, 0); }
		public AddOneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterAddOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitAddOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitAddOne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOneContext addOne() throws RecognitionException {
		AddOneContext _localctx = new AddOneContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_addOne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(NAME);
			setState(523);
			match(T__63);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusEqualContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(luappParser.NAME, 0); }
		public PlusEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterPlusEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitPlusEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitPlusEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusEqualContext plusEqual() throws RecognitionException {
		PlusEqualContext _localctx = new PlusEqualContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_plusEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(NAME);
			setState(526);
			match(T__64);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplyEqualContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(luappParser.NAME, 0); }
		public MultiplyEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterMultiplyEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitMultiplyEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitMultiplyEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyEqualContext multiplyEqual() throws RecognitionException {
		MultiplyEqualContext _localctx = new MultiplyEqualContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_multiplyEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(NAME);
			setState(529);
			match(T__65);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivEqualContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(luappParser.NAME, 0); }
		public DivEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterDivEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitDivEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitDivEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivEqualContext divEqual() throws RecognitionException {
		DivEqualContext _localctx = new DivEqualContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_divEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(NAME);
			setState(532);
			match(T__66);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinusEqualContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(luappParser.NAME, 0); }
		public MinusEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterMinusEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitMinusEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitMinusEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusEqualContext minusEqual() throws RecognitionException {
		MinusEqualContext _localctx = new MinusEqualContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_minusEqual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(NAME);
			setState(535);
			match(T__67);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SafeOperatorContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public SafeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_safeOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).enterSafeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof luappListener ) ((luappListener)listener).exitSafeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof luappVisitor ) return ((luappVisitor<? extends T>)visitor).visitSafeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SafeOperatorContext safeOperator() throws RecognitionException {
		SafeOperatorContext _localctx = new SafeOperatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_safeOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u021e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\2\3\3\7\3o\n\3\f\3\16\3r\13\3\3\3\5\3u\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0099"+
		"\n\4\f\4\16\4\u009c\13\4\3\4\3\4\5\4\u00a0\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4\u00ac\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00c2\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4\u00cb\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\u00d7\n\4\3\4\3\4\3\4\5\4\u00dc\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u00e3\n\4"+
		"\3\4\3\4\5\4\u00e7\n\4\3\5\3\5\5\5\u00eb\n\5\3\5\5\5\u00ee\n\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\7\7\u00f7\n\7\f\7\16\7\u00fa\13\7\3\7\3\7\5\7\u00fe"+
		"\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\n\u0107\n\n\f\n\16\n\u010a\13\n\3\13"+
		"\3\13\3\13\7\13\u010f\n\13\f\13\16\13\u0112\13\13\3\f\3\f\3\f\7\f\u0117"+
		"\n\f\f\f\16\f\u011a\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0129\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u014b\n\r\f\r\16\r\u014e\13\r\3\16\3\16\7\16\u0152\n\16\f"+
		"\16\16\16\u0155\13\16\3\17\3\17\6\17\u0159\n\17\r\17\16\17\u015a\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0162\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u016a\n\21\3\21\7\21\u016d\n\21\f\21\16\21\u0170\13\21\3\22\7\22\u0173"+
		"\n\22\f\22\16\22\u0176\13\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u017e"+
		"\n\22\3\23\3\23\5\23\u0182\n\23\3\23\3\23\3\24\3\24\5\24\u0188\n\24\3"+
		"\24\3\24\3\24\5\24\u018d\n\24\3\25\3\25\3\25\3\26\3\26\5\26\u0194\n\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u019d\n\27\3\27\5\27\u01a0\n"+
		"\27\3\30\3\30\5\30\u01a4\n\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u01ac"+
		"\n\31\f\31\16\31\u01af\13\31\3\31\5\31\u01b2\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01be\n\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3,\3,\3"+
		",\6,\u01ee\n,\r,\16,\u01ef\3,\3,\3-\3-\3-\5-\u01f7\n-\3-\3-\3-\3-\3.\3"+
		".\3.\5.\u0200\n.\3/\3/\3/\3/\7/\u0206\n/\f/\16/\u0209\13/\3/\3/\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3"+
		"\65\3\65\3\65\2\3\30\66\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\13\4\2\3\3\21\21\3\2(-\3\2"+
		"/\60\3\2\61\64\3\2\659\5\2\60\60\67\67:;\3\2KN\3\2HJ\3\2?@\2\u0239\2j"+
		"\3\2\2\2\4p\3\2\2\2\6\u00e6\3\2\2\2\b\u00e8\3\2\2\2\n\u00ef\3\2\2\2\f"+
		"\u00f3\3\2\2\2\16\u00ff\3\2\2\2\20\u0101\3\2\2\2\22\u0103\3\2\2\2\24\u010b"+
		"\3\2\2\2\26\u0113\3\2\2\2\30\u0128\3\2\2\2\32\u014f\3\2\2\2\34\u0156\3"+
		"\2\2\2\36\u0161\3\2\2\2 \u0169\3\2\2\2\"\u0174\3\2\2\2$\u0181\3\2\2\2"+
		"&\u018c\3\2\2\2(\u018e\3\2\2\2*\u0191\3\2\2\2,\u019f\3\2\2\2.\u01a1\3"+
		"\2\2\2\60\u01a7\3\2\2\2\62\u01bd\3\2\2\2\64\u01bf\3\2\2\2\66\u01c1\3\2"+
		"\2\28\u01c3\3\2\2\2:\u01c5\3\2\2\2<\u01c7\3\2\2\2>\u01c9\3\2\2\2@\u01cb"+
		"\3\2\2\2B\u01cd\3\2\2\2D\u01cf\3\2\2\2F\u01d1\3\2\2\2H\u01d3\3\2\2\2J"+
		"\u01d5\3\2\2\2L\u01d7\3\2\2\2N\u01db\3\2\2\2P\u01df\3\2\2\2R\u01e3\3\2"+
		"\2\2T\u01e8\3\2\2\2V\u01ea\3\2\2\2X\u01f3\3\2\2\2Z\u01ff\3\2\2\2\\\u0207"+
		"\3\2\2\2^\u020c\3\2\2\2`\u020f\3\2\2\2b\u0212\3\2\2\2d\u0215\3\2\2\2f"+
		"\u0218\3\2\2\2h\u021b\3\2\2\2jk\5\4\3\2kl\7\2\2\3l\3\3\2\2\2mo\5\6\4\2"+
		"nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2su\5\b\5\2"+
		"ts\3\2\2\2tu\3\2\2\2u\5\3\2\2\2v\u00e7\7\3\2\2wx\5\22\n\2xy\7\4\2\2yz"+
		"\5\26\f\2z\u00e7\3\2\2\2{\u00e7\5\34\17\2|\u00e7\5\n\6\2}\u00e7\7\5\2"+
		"\2~\177\7\6\2\2\177\u00e7\7G\2\2\u0080\u0081\7\7\2\2\u0081\u0082\5\4\3"+
		"\2\u0082\u0083\7\b\2\2\u0083\u00e7\3\2\2\2\u0084\u0085\7\t\2\2\u0085\u0086"+
		"\5\30\r\2\u0086\u0087\7\7\2\2\u0087\u0088\5\4\3\2\u0088\u0089\7\b\2\2"+
		"\u0089\u00e7\3\2\2\2\u008a\u008b\7\n\2\2\u008b\u008c\5\4\3\2\u008c\u008d"+
		"\7\13\2\2\u008d\u008e\5\30\r\2\u008e\u00e7\3\2\2\2\u008f\u0090\7\f\2\2"+
		"\u0090\u0091\5\30\r\2\u0091\u0092\7\r\2\2\u0092\u009a\5\4\3\2\u0093\u0094"+
		"\7\16\2\2\u0094\u0095\5\30\r\2\u0095\u0096\7\r\2\2\u0096\u0097\5\4\3\2"+
		"\u0097\u0099\3\2\2\2\u0098\u0093\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009f\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\7\17\2\2\u009e\u00a0\5\4\3\2\u009f\u009d\3\2\2\2\u009f\u00a0\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\b\2\2\u00a2\u00e7\3\2\2\2\u00a3"+
		"\u00a4\7\20\2\2\u00a4\u00a5\7G\2\2\u00a5\u00a6\7\4\2\2\u00a6\u00a7\5\30"+
		"\r\2\u00a7\u00a8\7\21\2\2\u00a8\u00ab\5\30\r\2\u00a9\u00aa\7\21\2\2\u00aa"+
		"\u00ac\5\30\r\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3"+
		"\2\2\2\u00ad\u00ae\7\7\2\2\u00ae\u00af\5\4\3\2\u00af\u00b0\7\b\2\2\u00b0"+
		"\u00e7\3\2\2\2\u00b1\u00b2\7\20\2\2\u00b2\u00b3\5\24\13\2\u00b3\u00b4"+
		"\7\22\2\2\u00b4\u00b5\5\26\f\2\u00b5\u00b6\7\7\2\2\u00b6\u00b7\5\4\3\2"+
		"\u00b7\u00b8\7\b\2\2\u00b8\u00e7\3\2\2\2\u00b9\u00ba\7\23\2\2\u00ba\u00bb"+
		"\5\f\7\2\u00bb\u00bc\5*\26\2\u00bc\u00e7\3\2\2\2\u00bd\u00be\7\24\2\2"+
		"\u00be\u00c1\5\16\b\2\u00bf\u00c0\7\25\2\2\u00c0\u00c2\5\20\t\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\5\\"+
		"/\2\u00c4\u00e7\3\2\2\2\u00c5\u00c6\7\26\2\2\u00c6\u00c7\7\24\2\2\u00c7"+
		"\u00ca\5\16\b\2\u00c8\u00c9\7\25\2\2\u00c9\u00cb\5\20\t\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\5\\/\2\u00cd"+
		"\u00e7\3\2\2\2\u00ce\u00cf\7\26\2\2\u00cf\u00d0\7\23\2\2\u00d0\u00d1\7"+
		"G\2\2\u00d1\u00e7\5*\26\2\u00d2\u00d3\7\26\2\2\u00d3\u00d6\5\24\13\2\u00d4"+
		"\u00d5\7\4\2\2\u00d5\u00d7\5\26\f\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3"+
		"\2\2\2\u00d7\u00e7\3\2\2\2\u00d8\u00d9\7\27\2\2\u00d9\u00e7\5h\65\2\u00da"+
		"\u00dc\7\26\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3"+
		"\2\2\2\u00dd\u00de\5\24\13\2\u00de\u00df\7\4\2\2\u00df\u00e0\5L\'\2\u00e0"+
		"\u00e7\3\2\2\2\u00e1\u00e3\7\26\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3"+
		"\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7G\2\2\u00e5\u00e7\5f\64\2\u00e6"+
		"v\3\2\2\2\u00e6w\3\2\2\2\u00e6{\3\2\2\2\u00e6|\3\2\2\2\u00e6}\3\2\2\2"+
		"\u00e6~\3\2\2\2\u00e6\u0080\3\2\2\2\u00e6\u0084\3\2\2\2\u00e6\u008a\3"+
		"\2\2\2\u00e6\u008f\3\2\2\2\u00e6\u00a3\3\2\2\2\u00e6\u00b1\3\2\2\2\u00e6"+
		"\u00b9\3\2\2\2\u00e6\u00bd\3\2\2\2\u00e6\u00c5\3\2\2\2\u00e6\u00ce\3\2"+
		"\2\2\u00e6\u00d2\3\2\2\2\u00e6\u00d8\3\2\2\2\u00e6\u00db\3\2\2\2\u00e6"+
		"\u00e2\3\2\2\2\u00e7\7\3\2\2\2\u00e8\u00ea\7\30\2\2\u00e9\u00eb\5\26\f"+
		"\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ee"+
		"\7\3\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\t\3\2\2\2\u00ef"+
		"\u00f0\7\31\2\2\u00f0\u00f1\7G\2\2\u00f1\u00f2\7\31\2\2\u00f2\13\3\2\2"+
		"\2\u00f3\u00f8\7G\2\2\u00f4\u00f5\7\32\2\2\u00f5\u00f7\7G\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fd\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7\33\2\2\u00fc\u00fe\7"+
		"G\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\r\3\2\2\2\u00ff\u0100"+
		"\7G\2\2\u0100\17\3\2\2\2\u0101\u0102\7G\2\2\u0102\21\3\2\2\2\u0103\u0108"+
		"\5 \21\2\u0104\u0105\7\21\2\2\u0105\u0107\5 \21\2\u0106\u0104\3\2\2\2"+
		"\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\23"+
		"\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u0110\7G\2\2\u010c\u010d\7\21\2\2\u010d"+
		"\u010f\7G\2\2\u010e\u010c\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\25\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0118"+
		"\5\30\r\2\u0114\u0115\7\21\2\2\u0115\u0117\5\30\r\2\u0116\u0114\3\2\2"+
		"\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\27"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\b\r\1\2\u011c\u0129\7\34\2\2"+
		"\u011d\u0129\7\35\2\2\u011e\u0129\7\36\2\2\u011f\u0129\5H%\2\u0120\u0129"+
		"\5J&\2\u0121\u0129\7\37\2\2\u0122\u0129\5(\25\2\u0123\u0129\5\32\16\2"+
		"\u0124\u0129\5.\30\2\u0125\u0126\5D#\2\u0126\u0127\5\30\r\n\u0127\u0129"+
		"\3\2\2\2\u0128\u011b\3\2\2\2\u0128\u011d\3\2\2\2\u0128\u011e\3\2\2\2\u0128"+
		"\u011f\3\2\2\2\u0128\u0120\3\2\2\2\u0128\u0121\3\2\2\2\u0128\u0122\3\2"+
		"\2\2\u0128\u0123\3\2\2\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0129"+
		"\u014c\3\2\2\2\u012a\u012b\f\13\2\2\u012b\u012c\5F$\2\u012c\u012d\5\30"+
		"\r\13\u012d\u014b\3\2\2\2\u012e\u012f\f\t\2\2\u012f\u0130\5@!\2\u0130"+
		"\u0131\5\30\r\n\u0131\u014b\3\2\2\2\u0132\u0133\f\b\2\2\u0133\u0134\5"+
		"> \2\u0134\u0135\5\30\r\t\u0135\u014b\3\2\2\2\u0136\u0137\f\7\2\2\u0137"+
		"\u0138\5<\37\2\u0138\u0139\5\30\r\7\u0139\u014b\3\2\2\2\u013a\u013b\f"+
		"\6\2\2\u013b\u013c\5:\36\2\u013c\u013d\5\30\r\7\u013d\u014b\3\2\2\2\u013e"+
		"\u013f\f\5\2\2\u013f\u0140\58\35\2\u0140\u0141\5\30\r\6\u0141\u014b\3"+
		"\2\2\2\u0142\u0143\f\4\2\2\u0143\u0144\5\66\34\2\u0144\u0145\5\30\r\5"+
		"\u0145\u014b\3\2\2\2\u0146\u0147\f\3\2\2\u0147\u0148\5B\"\2\u0148\u0149"+
		"\5\30\r\4\u0149\u014b\3\2\2\2\u014a\u012a\3\2\2\2\u014a\u012e\3\2\2\2"+
		"\u014a\u0132\3\2\2\2\u014a\u0136\3\2\2\2\u014a\u013a\3\2\2\2\u014a\u013e"+
		"\3\2\2\2\u014a\u0142\3\2\2\2\u014a\u0146\3\2\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\31\3\2\2\2\u014e\u014c\3\2\2"+
		"\2\u014f\u0153\5\36\20\2\u0150\u0152\5$\23\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\33\3\2\2"+
		"\2\u0155\u0153\3\2\2\2\u0156\u0158\5\36\20\2\u0157\u0159\5$\23\2\u0158"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\35\3\2\2\2\u015c\u0162\5 \21\2\u015d\u015e\7 \2\2\u015e\u015f"+
		"\5\30\r\2\u015f\u0160\7!\2\2\u0160\u0162\3\2\2\2\u0161\u015c\3\2\2\2\u0161"+
		"\u015d\3\2\2\2\u0162\37\3\2\2\2\u0163\u016a\7G\2\2\u0164\u0165\7 \2\2"+
		"\u0165\u0166\5\30\r\2\u0166\u0167\7!\2\2\u0167\u0168\5\"\22\2\u0168\u016a"+
		"\3\2\2\2\u0169\u0163\3\2\2\2\u0169\u0164\3\2\2\2\u016a\u016e\3\2\2\2\u016b"+
		"\u016d\5\"\22\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3"+
		"\2\2\2\u016e\u016f\3\2\2\2\u016f!\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0173"+
		"\5$\23\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u017d\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\7\""+
		"\2\2\u0178\u0179\5\30\r\2\u0179\u017a\7#\2\2\u017a\u017e\3\2\2\2\u017b"+
		"\u017c\7\32\2\2\u017c\u017e\7G\2\2\u017d\u0177\3\2\2\2\u017d\u017b\3\2"+
		"\2\2\u017e#\3\2\2\2\u017f\u0180\7\33\2\2\u0180\u0182\7G\2\2\u0181\u017f"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\5&\24\2\u0184"+
		"%\3\2\2\2\u0185\u0187\7 \2\2\u0186\u0188\5\26\f\2\u0187\u0186\3\2\2\2"+
		"\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018d\7!\2\2\u018a\u018d"+
		"\5.\30\2\u018b\u018d\5J&\2\u018c\u0185\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018b\3\2\2\2\u018d\'\3\2\2\2\u018e\u018f\7\23\2\2\u018f\u0190\5*\26"+
		"\2\u0190)\3\2\2\2\u0191\u0193\7 \2\2\u0192\u0194\5,\27\2\u0193\u0192\3"+
		"\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\7!\2\2\u0196"+
		"\u0197\5\4\3\2\u0197\u0198\7\b\2\2\u0198+\3\2\2\2\u0199\u019c\5\24\13"+
		"\2\u019a\u019b\7\21\2\2\u019b\u019d\7\37\2\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u01a0\7\37\2\2\u019f\u0199\3"+
		"\2\2\2\u019f\u019e\3\2\2\2\u01a0-\3\2\2\2\u01a1\u01a3\7$\2\2\u01a2\u01a4"+
		"\5\60\31\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2"+
		"\u01a5\u01a6\7%\2\2\u01a6/\3\2\2\2\u01a7\u01ad\5\62\32\2\u01a8\u01a9\5"+
		"\64\33\2\u01a9\u01aa\5\62\32\2\u01aa\u01ac\3\2\2\2\u01ab\u01a8\3\2\2\2"+
		"\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b1"+
		"\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b2\5\64\33\2\u01b1\u01b0\3\2\2\2"+
		"\u01b1\u01b2\3\2\2\2\u01b2\61\3\2\2\2\u01b3\u01b4\7\"\2\2\u01b4\u01b5"+
		"\5\30\r\2\u01b5\u01b6\7#\2\2\u01b6\u01b7\7\4\2\2\u01b7\u01b8\5\30\r\2"+
		"\u01b8\u01be\3\2\2\2\u01b9\u01ba\7G\2\2\u01ba\u01bb\7\4\2\2\u01bb\u01be"+
		"\5\30\r\2\u01bc\u01be\5\30\r\2\u01bd\u01b3\3\2\2\2\u01bd\u01b9\3\2\2\2"+
		"\u01bd\u01bc\3\2\2\2\u01be\63\3\2\2\2\u01bf\u01c0\t\2\2\2\u01c0\65\3\2"+
		"\2\2\u01c1\u01c2\7&\2\2\u01c2\67\3\2\2\2\u01c3\u01c4\7\'\2\2\u01c49\3"+
		"\2\2\2\u01c5\u01c6\t\3\2\2\u01c6;\3\2\2\2\u01c7\u01c8\7.\2\2\u01c8=\3"+
		"\2\2\2\u01c9\u01ca\t\4\2\2\u01ca?\3\2\2\2\u01cb\u01cc\t\5\2\2\u01ccA\3"+
		"\2\2\2\u01cd\u01ce\t\6\2\2\u01ceC\3\2\2\2\u01cf\u01d0\t\7\2\2\u01d0E\3"+
		"\2\2\2\u01d1\u01d2\7<\2\2\u01d2G\3\2\2\2\u01d3\u01d4\t\b\2\2\u01d4I\3"+
		"\2\2\2\u01d5\u01d6\t\t\2\2\u01d6K\3\2\2\2\u01d7\u01d8\7=\2\2\u01d8\u01d9"+
		"\5\f\7\2\u01d9\u01da\5&\24\2\u01daM\3\2\2\2\u01db\u01dc\7\24\2\2\u01dc"+
		"\u01dd\7G\2\2\u01dd\u01de\5\\/\2\u01deO\3\2\2\2\u01df\u01e0\7\23\2\2\u01e0"+
		"\u01e1\5\f\7\2\u01e1\u01e2\5*\26\2\u01e2Q\3\2\2\2\u01e3\u01e4\7>\2\2\u01e4"+
		"\u01e5\7\23\2\2\u01e5\u01e6\5\f\7\2\u01e6\u01e7\5*\26\2\u01e7S\3\2\2\2"+
		"\u01e8\u01e9\t\n\2\2\u01e9U\3\2\2\2\u01ea\u01eb\7G\2\2\u01eb\u01ed\7$"+
		"\2\2\u01ec\u01ee\5T+\2\u01ed\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01ed"+
		"\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\7%\2\2\u01f2"+
		"W\3\2\2\2\u01f3\u01f4\7A\2\2\u01f4\u01f6\7 \2\2\u01f5\u01f7\5,\27\2\u01f6"+
		"\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\7!"+
		"\2\2\u01f9\u01fa\5\4\3\2\u01fa\u01fb\7\b\2\2\u01fbY\3\2\2\2\u01fc\u0200"+
		"\5P)\2\u01fd\u0200\5V,\2\u01fe\u0200\5X-\2\u01ff\u01fc\3\2\2\2\u01ff\u01fd"+
		"\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200[\3\2\2\2\u0201\u0206\5R*\2\u0202\u0206"+
		"\5P)\2\u0203\u0206\5V,\2\u0204\u0206\5X-\2\u0205\u0201\3\2\2\2\u0205\u0202"+
		"\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u020a\u020b\7\b\2\2\u020b]\3\2\2\2\u020c\u020d\7G\2\2\u020d\u020e"+
		"\7B\2\2\u020e_\3\2\2\2\u020f\u0210\7G\2\2\u0210\u0211\7C\2\2\u0211a\3"+
		"\2\2\2\u0212\u0213\7G\2\2\u0213\u0214\7D\2\2\u0214c\3\2\2\2\u0215\u0216"+
		"\7G\2\2\u0216\u0217\7E\2\2\u0217e\3\2\2\2\u0218\u0219\7G\2\2\u0219\u021a"+
		"\7F\2\2\u021ag\3\2\2\2\u021b\u021c\5 \21\2\u021ci\3\2\2\2-pt\u009a\u009f"+
		"\u00ab\u00c1\u00ca\u00d6\u00db\u00e2\u00e6\u00ea\u00ed\u00f8\u00fd\u0108"+
		"\u0110\u0118\u0128\u014a\u014c\u0153\u015a\u0161\u0169\u016e\u0174\u017d"+
		"\u0181\u0187\u018c\u0193\u019c\u019f\u01a3\u01ad\u01b1\u01bd\u01ef\u01f6"+
		"\u01ff\u0205\u0207";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}