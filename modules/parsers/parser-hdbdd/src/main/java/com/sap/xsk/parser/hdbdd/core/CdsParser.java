/*
 * Copyright (c) 2022 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2022 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
// Generated from com/sap/xsk/parser/hdbdd/core/Cds.g4 by ANTLR 4.9.3
package com.sap.xsk.parser.hdbdd.core;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CdsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, NAMESPACE=19, AS=20, BUILT_IN_HANA_TYPE=21, USING=22, ON=23, 
		NULL=24, DEFAULT=25, ASSOCIATION_MIN=26, BOOLEAN=27, ID=28, SEMICOLUMN=29, 
		INTEGER=30, DECIMAL=31, LOCAL_TIME=32, LOCAL_DATE=33, UTC_DATE_TIME=34, 
		UTC_TIMESTAMP=35, STRING=36, VARBINARY=37, TYPE_OF=38, WS=39, LINE_COMMENT=40, 
		LINE_COMMENT2=41, A=42, B=43, C=44, D=45, E=46, F=47, G=48, H=49, I=50, 
		J=51, K=52, L=53, M=54, N=55, O=56, P=57, Q=58, R=59, S=60, T=61, U=62, 
		V=63, W=64, X=65, Y=66, Z=67;
	public static final int
		RULE_cdsFile = 0, RULE_namespaceRule = 1, RULE_usingRule = 2, RULE_topLevelSymbol = 3, 
		RULE_dataTypeRule = 4, RULE_fieldDeclRule = 5, RULE_typeAssignRule = 6, 
		RULE_elementDeclRule = 7, RULE_elementDetails = 8, RULE_elementConstraints = 9, 
		RULE_association = 10, RULE_associationTarget = 11, RULE_unmanagedForeignKey = 12, 
		RULE_managedForeignKeys = 13, RULE_foreignKey = 14, RULE_cardinality = 15, 
		RULE_defaultValue = 16, RULE_annotationRule = 17, RULE_annValue = 18, 
		RULE_enumRule = 19, RULE_arrRule = 20, RULE_obj = 21, RULE_keyValue = 22, 
		RULE_artifactRule = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"cdsFile", "namespaceRule", "usingRule", "topLevelSymbol", "dataTypeRule", 
			"fieldDeclRule", "typeAssignRule", "elementDeclRule", "elementDetails", 
			"elementConstraints", "association", "associationTarget", "unmanagedForeignKey", 
			"managedForeignKeys", "foreignKey", "cardinality", "defaultValue", "annotationRule", 
			"annValue", "enumRule", "arrRule", "obj", "keyValue", "artifactRule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'::'", "':'", "'\"'", "'('", "','", "')'", "'not null'", 
			"'NULL'", "'NOT NULL'", "'='", "'{'", "'}'", "'['", "'*'", "']'", "'@'", 
			"'#'", null, "'as'", null, null, "'on'", "'null'", null, null, null, 
			null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NAMESPACE", "AS", "BUILT_IN_HANA_TYPE", 
			"USING", "ON", "NULL", "DEFAULT", "ASSOCIATION_MIN", "BOOLEAN", "ID", 
			"SEMICOLUMN", "INTEGER", "DECIMAL", "LOCAL_TIME", "LOCAL_DATE", "UTC_DATE_TIME", 
			"UTC_TIMESTAMP", "STRING", "VARBINARY", "TYPE_OF", "WS", "LINE_COMMENT", 
			"LINE_COMMENT2", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
			"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
			"Z"
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
	public String getGrammarFileName() { return "Cds.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CdsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CdsFileContext extends ParserRuleContext {
		public NamespaceRuleContext namespaceRule() {
			return getRuleContext(NamespaceRuleContext.class,0);
		}
		public List<UsingRuleContext> usingRule() {
			return getRuleContexts(UsingRuleContext.class);
		}
		public UsingRuleContext usingRule(int i) {
			return getRuleContext(UsingRuleContext.class,i);
		}
		public TopLevelSymbolContext topLevelSymbol() {
			return getRuleContext(TopLevelSymbolContext.class,0);
		}
		public CdsFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cdsFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterCdsFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitCdsFile(this);
		}
	}

	public final CdsFileContext cdsFile() throws RecognitionException {
		CdsFileContext _localctx = new CdsFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cdsFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			namespaceRule();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USING) {
				{
				{
				setState(49);
				usingRule();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16 || _la==ID) {
				{
				setState(55);
				topLevelSymbol();
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

	public static class NamespaceRuleContext extends ParserRuleContext {
		public Token ID;
		public List<Token> members = new ArrayList<Token>();
		public TerminalNode NAMESPACE() { return getToken(CdsParser.NAMESPACE, 0); }
		public TerminalNode SEMICOLUMN() { return getToken(CdsParser.SEMICOLUMN, 0); }
		public List<TerminalNode> ID() { return getTokens(CdsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CdsParser.ID, i);
		}
		public NamespaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterNamespaceRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitNamespaceRule(this);
		}
	}

	public final NamespaceRuleContext namespaceRule() throws RecognitionException {
		NamespaceRuleContext _localctx = new NamespaceRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespaceRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(NAMESPACE);
			setState(59);
			((NamespaceRuleContext)_localctx).ID = match(ID);
			((NamespaceRuleContext)_localctx).members.add(((NamespaceRuleContext)_localctx).ID);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(60);
				match(T__0);
				setState(61);
				((NamespaceRuleContext)_localctx).ID = match(ID);
				((NamespaceRuleContext)_localctx).members.add(((NamespaceRuleContext)_localctx).ID);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(SEMICOLUMN);
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

	public static class UsingRuleContext extends ParserRuleContext {
		public Token ID;
		public List<Token> pack = new ArrayList<Token>();
		public List<Token> members = new ArrayList<Token>();
		public Token alias;
		public TerminalNode USING() { return getToken(CdsParser.USING, 0); }
		public TerminalNode SEMICOLUMN() { return getToken(CdsParser.SEMICOLUMN, 0); }
		public List<TerminalNode> ID() { return getTokens(CdsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CdsParser.ID, i);
		}
		public TerminalNode AS() { return getToken(CdsParser.AS, 0); }
		public UsingRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterUsingRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitUsingRule(this);
		}
	}

	public final UsingRuleContext usingRule() throws RecognitionException {
		UsingRuleContext _localctx = new UsingRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_usingRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(USING);
			setState(70);
			((UsingRuleContext)_localctx).ID = match(ID);
			((UsingRuleContext)_localctx).pack.add(((UsingRuleContext)_localctx).ID);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(71);
				match(T__0);
				setState(72);
				((UsingRuleContext)_localctx).ID = match(ID);
				((UsingRuleContext)_localctx).pack.add(((UsingRuleContext)_localctx).ID);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(T__1);
			setState(79);
			((UsingRuleContext)_localctx).ID = match(ID);
			((UsingRuleContext)_localctx).members.add(((UsingRuleContext)_localctx).ID);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(80);
				match(T__0);
				setState(81);
				((UsingRuleContext)_localctx).ID = match(ID);
				((UsingRuleContext)_localctx).members.add(((UsingRuleContext)_localctx).ID);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(87);
				match(AS);
				setState(88);
				((UsingRuleContext)_localctx).alias = match(ID);
				}
			}

			setState(91);
			match(SEMICOLUMN);
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

	public static class TopLevelSymbolContext extends ParserRuleContext {
		public DataTypeRuleContext dataTypeRule() {
			return getRuleContext(DataTypeRuleContext.class,0);
		}
		public ArtifactRuleContext artifactRule() {
			return getRuleContext(ArtifactRuleContext.class,0);
		}
		public TopLevelSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterTopLevelSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitTopLevelSymbol(this);
		}
	}

	public final TopLevelSymbolContext topLevelSymbol() throws RecognitionException {
		TopLevelSymbolContext _localctx = new TopLevelSymbolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_topLevelSymbol);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				dataTypeRule();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				artifactRule();
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

	public static class DataTypeRuleContext extends ParserRuleContext {
		public Token type;
		public Token name;
		public TypeAssignRuleContext typeAssignRule() {
			return getRuleContext(TypeAssignRuleContext.class,0);
		}
		public TerminalNode SEMICOLUMN() { return getToken(CdsParser.SEMICOLUMN, 0); }
		public List<TerminalNode> ID() { return getTokens(CdsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CdsParser.ID, i);
		}
		public DataTypeRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterDataTypeRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitDataTypeRule(this);
		}
	}

	public final DataTypeRuleContext dataTypeRule() throws RecognitionException {
		DataTypeRuleContext _localctx = new DataTypeRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dataTypeRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			((DataTypeRuleContext)_localctx).type = match(ID);
			setState(98);
			((DataTypeRuleContext)_localctx).name = match(ID);
			setState(99);
			match(T__2);
			setState(100);
			typeAssignRule();
			setState(101);
			match(SEMICOLUMN);
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

	public static class FieldDeclRuleContext extends ParserRuleContext {
		public TypeAssignRuleContext typeAssignRule() {
			return getRuleContext(TypeAssignRuleContext.class,0);
		}
		public TerminalNode SEMICOLUMN() { return getToken(CdsParser.SEMICOLUMN, 0); }
		public TerminalNode ID() { return getToken(CdsParser.ID, 0); }
		public FieldDeclRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterFieldDeclRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitFieldDeclRule(this);
		}
	}

	public final FieldDeclRuleContext fieldDeclRule() throws RecognitionException {
		FieldDeclRuleContext _localctx = new FieldDeclRuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fieldDeclRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(103);
				match(ID);
				}
				break;
			case T__3:
				{
				setState(104);
				match(T__3);
				setState(105);
				match(ID);
				setState(106);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(109);
			match(T__2);
			setState(110);
			typeAssignRule();
			setState(111);
			match(SEMICOLUMN);
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

	public static class TypeAssignRuleContext extends ParserRuleContext {
		public TypeAssignRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAssignRule; }
	 
		public TypeAssignRuleContext() { }
		public void copyFrom(TypeAssignRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignBuiltInTypeWithArgsContext extends TypeAssignRuleContext {
		public Token ref;
		public Token INTEGER;
		public List<Token> args = new ArrayList<Token>();
		public TerminalNode ID() { return getToken(CdsParser.ID, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(CdsParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(CdsParser.INTEGER, i);
		}
		public AssignBuiltInTypeWithArgsContext(TypeAssignRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterAssignBuiltInTypeWithArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitAssignBuiltInTypeWithArgs(this);
		}
	}
	public static class AssignHanaTypeWithArgsContext extends TypeAssignRuleContext {
		public Token hanaType;
		public Token INTEGER;
		public List<Token> args = new ArrayList<Token>();
		public TerminalNode BUILT_IN_HANA_TYPE() { return getToken(CdsParser.BUILT_IN_HANA_TYPE, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(CdsParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(CdsParser.INTEGER, i);
		}
		public AssignHanaTypeWithArgsContext(TypeAssignRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterAssignHanaTypeWithArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitAssignHanaTypeWithArgs(this);
		}
	}
	public static class AssignHanaTypeContext extends TypeAssignRuleContext {
		public Token hanaType;
		public TerminalNode BUILT_IN_HANA_TYPE() { return getToken(CdsParser.BUILT_IN_HANA_TYPE, 0); }
		public AssignHanaTypeContext(TypeAssignRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterAssignHanaType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitAssignHanaType(this);
		}
	}
	public static class AssignTypeContext extends TypeAssignRuleContext {
		public Token ID;
		public List<Token> pathSubMembers = new ArrayList<Token>();
		public List<TerminalNode> ID() { return getTokens(CdsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CdsParser.ID, i);
		}
		public TerminalNode TYPE_OF() { return getToken(CdsParser.TYPE_OF, 0); }
		public AssignTypeContext(TypeAssignRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterAssignType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitAssignType(this);
		}
	}

	public final TypeAssignRuleContext typeAssignRule() throws RecognitionException {
		TypeAssignRuleContext _localctx = new TypeAssignRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeAssignRule);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new AssignBuiltInTypeWithArgsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((AssignBuiltInTypeWithArgsContext)_localctx).ref = match(ID);
				setState(114);
				match(T__4);
				setState(115);
				((AssignBuiltInTypeWithArgsContext)_localctx).INTEGER = match(INTEGER);
				((AssignBuiltInTypeWithArgsContext)_localctx).args.add(((AssignBuiltInTypeWithArgsContext)_localctx).INTEGER);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(116);
					match(T__5);
					setState(117);
					((AssignBuiltInTypeWithArgsContext)_localctx).INTEGER = match(INTEGER);
					((AssignBuiltInTypeWithArgsContext)_localctx).args.add(((AssignBuiltInTypeWithArgsContext)_localctx).INTEGER);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new AssignHanaTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				((AssignHanaTypeContext)_localctx).hanaType = match(BUILT_IN_HANA_TYPE);
				}
				break;
			case 3:
				_localctx = new AssignHanaTypeWithArgsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				((AssignHanaTypeWithArgsContext)_localctx).hanaType = match(BUILT_IN_HANA_TYPE);
				setState(126);
				match(T__4);
				setState(127);
				((AssignHanaTypeWithArgsContext)_localctx).INTEGER = match(INTEGER);
				((AssignHanaTypeWithArgsContext)_localctx).args.add(((AssignHanaTypeWithArgsContext)_localctx).INTEGER);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(128);
					match(T__5);
					setState(129);
					((AssignHanaTypeWithArgsContext)_localctx).INTEGER = match(INTEGER);
					((AssignHanaTypeWithArgsContext)_localctx).args.add(((AssignHanaTypeWithArgsContext)_localctx).INTEGER);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(T__6);
				}
				break;
			case 4:
				_localctx = new AssignTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE_OF) {
					{
					setState(136);
					match(TYPE_OF);
					}
				}

				setState(139);
				((AssignTypeContext)_localctx).ID = match(ID);
				((AssignTypeContext)_localctx).pathSubMembers.add(((AssignTypeContext)_localctx).ID);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(140);
					match(T__0);
					setState(141);
					((AssignTypeContext)_localctx).ID = match(ID);
					((AssignTypeContext)_localctx).pathSubMembers.add(((AssignTypeContext)_localctx).ID);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ElementDeclRuleContext extends ParserRuleContext {
		public Token key;
		public Token name;
		public TypeAssignRuleContext typeAssignRule() {
			return getRuleContext(TypeAssignRuleContext.class,0);
		}
		public TerminalNode SEMICOLUMN() { return getToken(CdsParser.SEMICOLUMN, 0); }
		public List<AnnotationRuleContext> annotationRule() {
			return getRuleContexts(AnnotationRuleContext.class);
		}
		public AnnotationRuleContext annotationRule(int i) {
			return getRuleContext(AnnotationRuleContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CdsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CdsParser.ID, i);
		}
		public List<ElementDetailsContext> elementDetails() {
			return getRuleContexts(ElementDetailsContext.class);
		}
		public ElementDetailsContext elementDetails(int i) {
			return getRuleContext(ElementDetailsContext.class,i);
		}
		public ElementDeclRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementDeclRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterElementDeclRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitElementDeclRule(this);
		}
	}

	public final ElementDeclRuleContext elementDeclRule() throws RecognitionException {
		ElementDeclRuleContext _localctx = new ElementDeclRuleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elementDeclRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(149);
				annotationRule();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(155);
				((ElementDeclRuleContext)_localctx).key = match(ID);
				}
				break;
			}
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(158);
				((ElementDeclRuleContext)_localctx).name = match(ID);
				}
				break;
			case T__3:
				{
				setState(159);
				match(T__3);
				setState(160);
				((ElementDeclRuleContext)_localctx).name = match(ID);
				setState(161);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(164);
			match(T__2);
			setState(165);
			typeAssignRule();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << NULL) | (1L << DEFAULT))) != 0)) {
				{
				{
				setState(166);
				elementDetails();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(SEMICOLUMN);
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

	public static class ElementDetailsContext extends ParserRuleContext {
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public ElementConstraintsContext elementConstraints() {
			return getRuleContext(ElementConstraintsContext.class,0);
		}
		public ElementDetailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementDetails; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterElementDetails(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitElementDetails(this);
		}
	}

	public final ElementDetailsContext elementDetails() throws RecognitionException {
		ElementDetailsContext _localctx = new ElementDetailsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elementDetails);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				defaultValue();
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				elementConstraints();
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

	public static class ElementConstraintsContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(CdsParser.NULL, 0); }
		public ElementConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementConstraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterElementConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitElementConstraints(this);
		}
	}

	public final ElementConstraintsContext elementConstraints() throws RecognitionException {
		ElementConstraintsContext _localctx = new ElementConstraintsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elementConstraints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << NULL))) != 0)) ) {
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

	public static class AssociationContext extends ParserRuleContext {
		public Token key;
		public Token ascId;
		public Token ascKeyword;
		public Token toKeyword;
		public AssociationTargetContext associationTarget() {
			return getRuleContext(AssociationTargetContext.class,0);
		}
		public TerminalNode SEMICOLUMN() { return getToken(CdsParser.SEMICOLUMN, 0); }
		public List<TerminalNode> ID() { return getTokens(CdsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CdsParser.ID, i);
		}
		public CardinalityContext cardinality() {
			return getRuleContext(CardinalityContext.class,0);
		}
		public List<ManagedForeignKeysContext> managedForeignKeys() {
			return getRuleContexts(ManagedForeignKeysContext.class);
		}
		public ManagedForeignKeysContext managedForeignKeys(int i) {
			return getRuleContext(ManagedForeignKeysContext.class,i);
		}
		public List<UnmanagedForeignKeyContext> unmanagedForeignKey() {
			return getRuleContexts(UnmanagedForeignKeyContext.class);
		}
		public UnmanagedForeignKeyContext unmanagedForeignKey(int i) {
			return getRuleContext(UnmanagedForeignKeyContext.class,i);
		}
		public ElementConstraintsContext elementConstraints() {
			return getRuleContext(ElementConstraintsContext.class,0);
		}
		public AssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_association; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitAssociation(this);
		}
	}

	public final AssociationContext association() throws RecognitionException {
		AssociationContext _localctx = new AssociationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_association);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(180);
				((AssociationContext)_localctx).key = match(ID);
				}
				break;
			}
			setState(183);
			((AssociationContext)_localctx).ascId = match(ID);
			setState(184);
			match(T__2);
			setState(185);
			((AssociationContext)_localctx).ascKeyword = match(ID);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(186);
				cardinality();
				}
			}

			setState(189);
			((AssociationContext)_localctx).toKeyword = match(ID);
			setState(190);
			associationTarget();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==ON) {
				{
				setState(193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(191);
					managedForeignKeys();
					}
					break;
				case ON:
					{
					setState(192);
					unmanagedForeignKey();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << NULL))) != 0)) {
				{
				setState(198);
				elementConstraints();
				}
			}

			setState(201);
			match(SEMICOLUMN);
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

	public static class AssociationTargetContext extends ParserRuleContext {
		public Token ID;
		public List<Token> pathSubMembers = new ArrayList<Token>();
		public List<TerminalNode> ID() { return getTokens(CdsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CdsParser.ID, i);
		}
		public AssociationTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associationTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterAssociationTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitAssociationTarget(this);
		}
	}

	public final AssociationTargetContext associationTarget() throws RecognitionException {
		AssociationTargetContext _localctx = new AssociationTargetContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_associationTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			((AssociationTargetContext)_localctx).ID = match(ID);
			((AssociationTargetContext)_localctx).pathSubMembers.add(((AssociationTargetContext)_localctx).ID);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(204);
				match(T__0);
				setState(205);
				((AssociationTargetContext)_localctx).ID = match(ID);
				((AssociationTargetContext)_localctx).pathSubMembers.add(((AssociationTargetContext)_localctx).ID);
				}
				}
				setState(210);
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

	public static class UnmanagedForeignKeyContext extends ParserRuleContext {
		public Token ID;
		public List<Token> pathSubMembers = new ArrayList<Token>();
		public Token source;
		public TerminalNode ON() { return getToken(CdsParser.ON, 0); }
		public List<TerminalNode> ID() { return getTokens(CdsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CdsParser.ID, i);
		}
		public UnmanagedForeignKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unmanagedForeignKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterUnmanagedForeignKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitUnmanagedForeignKey(this);
		}
	}

	public final UnmanagedForeignKeyContext unmanagedForeignKey() throws RecognitionException {
		UnmanagedForeignKeyContext _localctx = new UnmanagedForeignKeyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unmanagedForeignKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(ON);
			setState(212);
			((UnmanagedForeignKeyContext)_localctx).ID = match(ID);
			((UnmanagedForeignKeyContext)_localctx).pathSubMembers.add(((UnmanagedForeignKeyContext)_localctx).ID);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(213);
				match(T__0);
				setState(214);
				((UnmanagedForeignKeyContext)_localctx).ID = match(ID);
				((UnmanagedForeignKeyContext)_localctx).pathSubMembers.add(((UnmanagedForeignKeyContext)_localctx).ID);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(T__10);
			setState(221);
			((UnmanagedForeignKeyContext)_localctx).source = match(ID);
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

	public static class ManagedForeignKeysContext extends ParserRuleContext {
		public List<ForeignKeyContext> foreignKey() {
			return getRuleContexts(ForeignKeyContext.class);
		}
		public ForeignKeyContext foreignKey(int i) {
			return getRuleContext(ForeignKeyContext.class,i);
		}
		public ManagedForeignKeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_managedForeignKeys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterManagedForeignKeys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitManagedForeignKeys(this);
		}
	}

	public final ManagedForeignKeysContext managedForeignKeys() throws RecognitionException {
		ManagedForeignKeysContext _localctx = new ManagedForeignKeysContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_managedForeignKeys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__11);
			setState(224);
			foreignKey();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(225);
				match(T__5);
				setState(226);
				foreignKey();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(T__12);
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

	public static class ForeignKeyContext extends ParserRuleContext {
		public Token ID;
		public List<Token> pathSubMembers = new ArrayList<Token>();
		public Token alias;
		public List<TerminalNode> ID() { return getTokens(CdsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CdsParser.ID, i);
		}
		public TerminalNode AS() { return getToken(CdsParser.AS, 0); }
		public ForeignKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterForeignKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitForeignKey(this);
		}
	}

	public final ForeignKeyContext foreignKey() throws RecognitionException {
		ForeignKeyContext _localctx = new ForeignKeyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_foreignKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			((ForeignKeyContext)_localctx).ID = match(ID);
			((ForeignKeyContext)_localctx).pathSubMembers.add(((ForeignKeyContext)_localctx).ID);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(235);
				match(T__0);
				setState(236);
				((ForeignKeyContext)_localctx).ID = match(ID);
				((ForeignKeyContext)_localctx).pathSubMembers.add(((ForeignKeyContext)_localctx).ID);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(242);
				match(AS);
				setState(243);
				((ForeignKeyContext)_localctx).alias = match(ID);
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

	public static class CardinalityContext extends ParserRuleContext {
		public CardinalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardinality; }
	 
		public CardinalityContext() { }
		public void copyFrom(CardinalityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NoCardinalityContext extends CardinalityContext {
		public NoCardinalityContext(CardinalityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterNoCardinality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitNoCardinality(this);
		}
	}
	public static class MaxCardinalityContext extends CardinalityContext {
		public Token max;
		public Token many;
		public TerminalNode INTEGER() { return getToken(CdsParser.INTEGER, 0); }
		public MaxCardinalityContext(CardinalityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterMaxCardinality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitMaxCardinality(this);
		}
	}
	public static class MinMaxCardinalityContext extends CardinalityContext {
		public Token max;
		public Token many;
		public TerminalNode ASSOCIATION_MIN() { return getToken(CdsParser.ASSOCIATION_MIN, 0); }
		public TerminalNode INTEGER() { return getToken(CdsParser.INTEGER, 0); }
		public MinMaxCardinalityContext(CardinalityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterMinMaxCardinality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitMinMaxCardinality(this);
		}
	}

	public final CardinalityContext cardinality() throws RecognitionException {
		CardinalityContext _localctx = new CardinalityContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cardinality);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new MinMaxCardinalityContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(T__13);
				setState(247);
				match(ASSOCIATION_MIN);
				setState(250);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER:
					{
					setState(248);
					((MinMaxCardinalityContext)_localctx).max = match(INTEGER);
					}
					break;
				case T__14:
					{
					setState(249);
					((MinMaxCardinalityContext)_localctx).many = match(T__14);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(252);
				match(T__15);
				}
				break;
			case 2:
				_localctx = new MaxCardinalityContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(T__13);
				setState(256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER:
					{
					setState(254);
					((MaxCardinalityContext)_localctx).max = match(INTEGER);
					}
					break;
				case T__14:
					{
					setState(255);
					((MaxCardinalityContext)_localctx).many = match(T__14);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(258);
				match(T__15);
				}
				break;
			case 3:
				_localctx = new NoCardinalityContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(T__13);
				setState(260);
				match(T__15);
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

	public static class DefaultValueContext extends ParserRuleContext {
		public Token value;
		public TerminalNode DEFAULT() { return getToken(CdsParser.DEFAULT, 0); }
		public TerminalNode STRING() { return getToken(CdsParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(CdsParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(CdsParser.DECIMAL, 0); }
		public TerminalNode LOCAL_TIME() { return getToken(CdsParser.LOCAL_TIME, 0); }
		public TerminalNode LOCAL_DATE() { return getToken(CdsParser.LOCAL_DATE, 0); }
		public TerminalNode UTC_DATE_TIME() { return getToken(CdsParser.UTC_DATE_TIME, 0); }
		public TerminalNode UTC_TIMESTAMP() { return getToken(CdsParser.UTC_TIMESTAMP, 0); }
		public TerminalNode NULL() { return getToken(CdsParser.NULL, 0); }
		public TerminalNode VARBINARY() { return getToken(CdsParser.VARBINARY, 0); }
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_defaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(DEFAULT);
			setState(264);
			((DefaultValueContext)_localctx).value = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << INTEGER) | (1L << DECIMAL) | (1L << LOCAL_TIME) | (1L << LOCAL_DATE) | (1L << UTC_DATE_TIME) | (1L << UTC_TIMESTAMP) | (1L << STRING) | (1L << VARBINARY))) != 0)) ) {
				((DefaultValueContext)_localctx).value = (Token)_errHandler.recoverInline(this);
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

	public static class AnnotationRuleContext extends ParserRuleContext {
		public AnnotationRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationRule; }
	 
		public AnnotationRuleContext() { }
		public void copyFrom(AnnotationRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnnPropertyRuleContext extends AnnotationRuleContext {
		public Token annId;
		public Token prop;
		public AnnValueContext annValue() {
			return getRuleContext(AnnValueContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CdsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CdsParser.ID, i);
		}
		public AnnPropertyRuleContext(AnnotationRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterAnnPropertyRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitAnnPropertyRule(this);
		}
	}
	public static class AnnObjectRuleContext extends AnnotationRuleContext {
		public TerminalNode ID() { return getToken(CdsParser.ID, 0); }
		public AnnValueContext annValue() {
			return getRuleContext(AnnValueContext.class,0);
		}
		public AnnObjectRuleContext(AnnotationRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterAnnObjectRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitAnnObjectRule(this);
		}
	}
	public static class AnnMarkerRuleContext extends AnnotationRuleContext {
		public TerminalNode ID() { return getToken(CdsParser.ID, 0); }
		public AnnMarkerRuleContext(AnnotationRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterAnnMarkerRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitAnnMarkerRule(this);
		}
	}

	public final AnnotationRuleContext annotationRule() throws RecognitionException {
		AnnotationRuleContext _localctx = new AnnotationRuleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_annotationRule);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new AnnObjectRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(T__16);
				setState(267);
				match(ID);
				setState(268);
				match(T__2);
				setState(269);
				annValue();
				}
				break;
			case 2:
				_localctx = new AnnPropertyRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(T__16);
				setState(271);
				((AnnPropertyRuleContext)_localctx).annId = match(ID);
				setState(272);
				match(T__0);
				setState(273);
				((AnnPropertyRuleContext)_localctx).prop = match(ID);
				setState(274);
				match(T__2);
				setState(275);
				annValue();
				}
				break;
			case 3:
				_localctx = new AnnMarkerRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(T__16);
				setState(277);
				match(ID);
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

	public static class AnnValueContext extends ParserRuleContext {
		public Token literal;
		public ArrRuleContext arrRule() {
			return getRuleContext(ArrRuleContext.class,0);
		}
		public EnumRuleContext enumRule() {
			return getRuleContext(EnumRuleContext.class,0);
		}
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public TerminalNode STRING() { return getToken(CdsParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(CdsParser.BOOLEAN, 0); }
		public AnnValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterAnnValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitAnnValue(this);
		}
	}

	public final AnnValueContext annValue() throws RecognitionException {
		AnnValueContext _localctx = new AnnValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_annValue);
		int _la;
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				arrRule();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				enumRule();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				obj();
				}
				break;
			case BOOLEAN:
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				((AnnValueContext)_localctx).literal = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BOOLEAN || _la==STRING) ) {
					((AnnValueContext)_localctx).literal = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class EnumRuleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CdsParser.ID, 0); }
		public EnumRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterEnumRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitEnumRule(this);
		}
	}

	public final EnumRuleContext enumRule() throws RecognitionException {
		EnumRuleContext _localctx = new EnumRuleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enumRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__17);
			setState(287);
			match(ID);
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

	public static class ArrRuleContext extends ParserRuleContext {
		public List<AnnValueContext> annValue() {
			return getRuleContexts(AnnValueContext.class);
		}
		public AnnValueContext annValue(int i) {
			return getRuleContext(AnnValueContext.class,i);
		}
		public ArrRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterArrRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitArrRule(this);
		}
	}

	public final ArrRuleContext arrRule() throws RecognitionException {
		ArrRuleContext _localctx = new ArrRuleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__13);
			setState(290);
			annValue();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(291);
				match(T__5);
				setState(292);
				annValue();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			match(T__15);
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

	public static class ObjContext extends ParserRuleContext {
		public List<KeyValueContext> keyValue() {
			return getRuleContexts(KeyValueContext.class);
		}
		public KeyValueContext keyValue(int i) {
			return getRuleContext(KeyValueContext.class,i);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitObj(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__11);
			setState(301);
			keyValue();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(302);
				match(T__5);
				setState(303);
				keyValue();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			match(T__12);
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

	public static class KeyValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CdsParser.ID, 0); }
		public AnnValueContext annValue() {
			return getRuleContext(AnnValueContext.class,0);
		}
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitKeyValue(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(ID);
			setState(312);
			match(T__2);
			setState(313);
			annValue();
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

	public static class ArtifactRuleContext extends ParserRuleContext {
		public Token artifactType;
		public Token artifactName;
		public List<TerminalNode> ID() { return getTokens(CdsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CdsParser.ID, i);
		}
		public List<AnnotationRuleContext> annotationRule() {
			return getRuleContexts(AnnotationRuleContext.class);
		}
		public AnnotationRuleContext annotationRule(int i) {
			return getRuleContext(AnnotationRuleContext.class,i);
		}
		public List<ArtifactRuleContext> artifactRule() {
			return getRuleContexts(ArtifactRuleContext.class);
		}
		public ArtifactRuleContext artifactRule(int i) {
			return getRuleContext(ArtifactRuleContext.class,i);
		}
		public List<DataTypeRuleContext> dataTypeRule() {
			return getRuleContexts(DataTypeRuleContext.class);
		}
		public DataTypeRuleContext dataTypeRule(int i) {
			return getRuleContext(DataTypeRuleContext.class,i);
		}
		public List<FieldDeclRuleContext> fieldDeclRule() {
			return getRuleContexts(FieldDeclRuleContext.class);
		}
		public FieldDeclRuleContext fieldDeclRule(int i) {
			return getRuleContext(FieldDeclRuleContext.class,i);
		}
		public List<ElementDeclRuleContext> elementDeclRule() {
			return getRuleContexts(ElementDeclRuleContext.class);
		}
		public ElementDeclRuleContext elementDeclRule(int i) {
			return getRuleContext(ElementDeclRuleContext.class,i);
		}
		public List<AssociationContext> association() {
			return getRuleContexts(AssociationContext.class);
		}
		public AssociationContext association(int i) {
			return getRuleContext(AssociationContext.class,i);
		}
		public TerminalNode SEMICOLUMN() { return getToken(CdsParser.SEMICOLUMN, 0); }
		public ArtifactRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_artifactRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).enterArtifactRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CdsListener ) ((CdsListener)listener).exitArtifactRule(this);
		}
	}

	public final ArtifactRuleContext artifactRule() throws RecognitionException {
		ArtifactRuleContext _localctx = new ArtifactRuleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_artifactRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(315);
				annotationRule();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			((ArtifactRuleContext)_localctx).artifactType = match(ID);
			setState(322);
			((ArtifactRuleContext)_localctx).artifactName = match(ID);
			setState(323);
			match(T__11);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__16) | (1L << ID))) != 0)) {
				{
				setState(329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(324);
					artifactRule();
					}
					break;
				case 2:
					{
					setState(325);
					dataTypeRule();
					}
					break;
				case 3:
					{
					setState(326);
					fieldDeclRule();
					}
					break;
				case 4:
					{
					setState(327);
					elementDeclRule();
					}
					break;
				case 5:
					{
					setState(328);
					association();
					}
					break;
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			match(T__12);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLUMN) {
				{
				setState(335);
				match(SEMICOLUMN);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u0155\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\5\2;\n\2\3\3\3\3\3\3\3\3\7\3A\n"+
		"\3\f\3\16\3D\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\4"+
		"\3\4\3\4\3\4\7\4U\n\4\f\4\16\4X\13\4\3\4\3\4\5\4\\\n\4\3\4\3\4\3\5\3\5"+
		"\5\5b\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7n\n\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\b\u0085\n\b\f\b\16\b\u0088\13\b\3\b\3\b\5\b\u008c\n\b\3\b\3\b"+
		"\3\b\7\b\u0091\n\b\f\b\16\b\u0094\13\b\5\b\u0096\n\b\3\t\7\t\u0099\n\t"+
		"\f\t\16\t\u009c\13\t\3\t\5\t\u009f\n\t\3\t\3\t\3\t\3\t\5\t\u00a5\n\t\3"+
		"\t\3\t\3\t\7\t\u00aa\n\t\f\t\16\t\u00ad\13\t\3\t\3\t\3\n\3\n\5\n\u00b3"+
		"\n\n\3\13\3\13\3\f\5\f\u00b8\n\f\3\f\3\f\3\f\3\f\5\f\u00be\n\f\3\f\3\f"+
		"\3\f\3\f\7\f\u00c4\n\f\f\f\16\f\u00c7\13\f\3\f\5\f\u00ca\n\f\3\f\3\f\3"+
		"\r\3\r\3\r\7\r\u00d1\n\r\f\r\16\r\u00d4\13\r\3\16\3\16\3\16\3\16\7\16"+
		"\u00da\n\16\f\16\16\16\u00dd\13\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\7\17\u00e6\n\17\f\17\16\17\u00e9\13\17\3\17\3\17\3\20\3\20\3\20\7\20"+
		"\u00f0\n\20\f\20\16\20\u00f3\13\20\3\20\3\20\5\20\u00f7\n\20\3\21\3\21"+
		"\3\21\3\21\5\21\u00fd\n\21\3\21\3\21\3\21\3\21\5\21\u0103\n\21\3\21\3"+
		"\21\3\21\5\21\u0108\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0119\n\23\3\24\3\24\3\24\3\24\5\24"+
		"\u011f\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0128\n\26\f\26\16"+
		"\26\u012b\13\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0133\n\27\f\27\16"+
		"\27\u0136\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\7\31\u013f\n\31\f\31"+
		"\16\31\u0142\13\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u014c"+
		"\n\31\f\31\16\31\u014f\13\31\3\31\3\31\5\31\u0153\n\31\3\31\2\2\32\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\5\4\2\n\f\32\32\4\2"+
		"\32\32 \'\4\2\35\35&&\2\u016c\2\62\3\2\2\2\4<\3\2\2\2\6G\3\2\2\2\ba\3"+
		"\2\2\2\nc\3\2\2\2\fm\3\2\2\2\16\u0095\3\2\2\2\20\u009a\3\2\2\2\22\u00b2"+
		"\3\2\2\2\24\u00b4\3\2\2\2\26\u00b7\3\2\2\2\30\u00cd\3\2\2\2\32\u00d5\3"+
		"\2\2\2\34\u00e1\3\2\2\2\36\u00ec\3\2\2\2 \u0107\3\2\2\2\"\u0109\3\2\2"+
		"\2$\u0118\3\2\2\2&\u011e\3\2\2\2(\u0120\3\2\2\2*\u0123\3\2\2\2,\u012e"+
		"\3\2\2\2.\u0139\3\2\2\2\60\u0140\3\2\2\2\62\66\5\4\3\2\63\65\5\6\4\2\64"+
		"\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67:\3\2\2\28\66\3"+
		"\2\2\29;\5\b\5\2:9\3\2\2\2:;\3\2\2\2;\3\3\2\2\2<=\7\25\2\2=B\7\36\2\2"+
		">?\7\3\2\2?A\7\36\2\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2"+
		"\2DB\3\2\2\2EF\7\37\2\2F\5\3\2\2\2GH\7\30\2\2HM\7\36\2\2IJ\7\3\2\2JL\7"+
		"\36\2\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ"+
		"\7\4\2\2QV\7\36\2\2RS\7\3\2\2SU\7\36\2\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2"+
		"VW\3\2\2\2W[\3\2\2\2XV\3\2\2\2YZ\7\26\2\2Z\\\7\36\2\2[Y\3\2\2\2[\\\3\2"+
		"\2\2\\]\3\2\2\2]^\7\37\2\2^\7\3\2\2\2_b\5\n\6\2`b\5\60\31\2a_\3\2\2\2"+
		"a`\3\2\2\2b\t\3\2\2\2cd\7\36\2\2de\7\36\2\2ef\7\5\2\2fg\5\16\b\2gh\7\37"+
		"\2\2h\13\3\2\2\2in\7\36\2\2jk\7\6\2\2kl\7\36\2\2ln\7\6\2\2mi\3\2\2\2m"+
		"j\3\2\2\2no\3\2\2\2op\7\5\2\2pq\5\16\b\2qr\7\37\2\2r\r\3\2\2\2st\7\36"+
		"\2\2tu\7\7\2\2uz\7 \2\2vw\7\b\2\2wy\7 \2\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2"+
		"\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}\u0096\7\t\2\2~\u0096\7\27\2\2\177\u0080"+
		"\7\27\2\2\u0080\u0081\7\7\2\2\u0081\u0086\7 \2\2\u0082\u0083\7\b\2\2\u0083"+
		"\u0085\7 \2\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u0096\7\t\2\2\u008a\u008c\7(\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u0092\7\36\2\2\u008e\u008f\7\3\2\2\u008f"+
		"\u0091\7\36\2\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"s\3\2\2\2\u0095~\3\2\2\2\u0095\177\3\2\2\2\u0095\u008b\3\2\2\2\u0096\17"+
		"\3\2\2\2\u0097\u0099\5$\23\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u009f\7\36\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a4\3\2\2\2\u00a0\u00a5\7\36\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a3\7"+
		"\36\2\2\u00a3\u00a5\7\6\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\7\5\2\2\u00a7\u00ab\5\16\b\2\u00a8\u00aa\5"+
		"\22\n\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\37"+
		"\2\2\u00af\21\3\2\2\2\u00b0\u00b3\5\"\22\2\u00b1\u00b3\5\24\13\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\23\3\2\2\2\u00b4\u00b5\t\2\2"+
		"\2\u00b5\25\3\2\2\2\u00b6\u00b8\7\36\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\36\2\2\u00ba\u00bb\7\5\2\2"+
		"\u00bb\u00bd\7\36\2\2\u00bc\u00be\5 \21\2\u00bd\u00bc\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\36\2\2\u00c0\u00c5\5\30\r\2"+
		"\u00c1\u00c4\5\34\17\2\u00c2\u00c4\5\32\16\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\5\24\13\2\u00c9"+
		"\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\37"+
		"\2\2\u00cc\27\3\2\2\2\u00cd\u00d2\7\36\2\2\u00ce\u00cf\7\3\2\2\u00cf\u00d1"+
		"\7\36\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2"+
		"\u00d2\u00d3\3\2\2\2\u00d3\31\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6"+
		"\7\31\2\2\u00d6\u00db\7\36\2\2\u00d7\u00d8\7\3\2\2\u00d8\u00da\7\36\2"+
		"\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7\r\2\2\u00df"+
		"\u00e0\7\36\2\2\u00e0\33\3\2\2\2\u00e1\u00e2\7\16\2\2\u00e2\u00e7\5\36"+
		"\20\2\u00e3\u00e4\7\b\2\2\u00e4\u00e6\5\36\20\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\17\2\2\u00eb\35\3\2\2\2\u00ec\u00f1"+
		"\7\36\2\2\u00ed\u00ee\7\3\2\2\u00ee\u00f0\7\36\2\2\u00ef\u00ed\3\2\2\2"+
		"\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f6"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\26\2\2\u00f5\u00f7\7\36\2\2"+
		"\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\37\3\2\2\2\u00f8\u00f9"+
		"\7\20\2\2\u00f9\u00fc\7\34\2\2\u00fa\u00fd\7 \2\2\u00fb\u00fd\7\21\2\2"+
		"\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0108"+
		"\7\22\2\2\u00ff\u0102\7\20\2\2\u0100\u0103\7 \2\2\u0101\u0103\7\21\2\2"+
		"\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0108"+
		"\7\22\2\2\u0105\u0106\7\20\2\2\u0106\u0108\7\22\2\2\u0107\u00f8\3\2\2"+
		"\2\u0107\u00ff\3\2\2\2\u0107\u0105\3\2\2\2\u0108!\3\2\2\2\u0109\u010a"+
		"\7\33\2\2\u010a\u010b\t\3\2\2\u010b#\3\2\2\2\u010c\u010d\7\23\2\2\u010d"+
		"\u010e\7\36\2\2\u010e\u010f\7\5\2\2\u010f\u0119\5&\24\2\u0110\u0111\7"+
		"\23\2\2\u0111\u0112\7\36\2\2\u0112\u0113\7\3\2\2\u0113\u0114\7\36\2\2"+
		"\u0114\u0115\7\5\2\2\u0115\u0119\5&\24\2\u0116\u0117\7\23\2\2\u0117\u0119"+
		"\7\36\2\2\u0118\u010c\3\2\2\2\u0118\u0110\3\2\2\2\u0118\u0116\3\2\2\2"+
		"\u0119%\3\2\2\2\u011a\u011f\5*\26\2\u011b\u011f\5(\25\2\u011c\u011f\5"+
		",\27\2\u011d\u011f\t\4\2\2\u011e\u011a\3\2\2\2\u011e\u011b\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\'\3\2\2\2\u0120\u0121\7\24\2"+
		"\2\u0121\u0122\7\36\2\2\u0122)\3\2\2\2\u0123\u0124\7\20\2\2\u0124\u0129"+
		"\5&\24\2\u0125\u0126\7\b\2\2\u0126\u0128\5&\24\2\u0127\u0125\3\2\2\2\u0128"+
		"\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2"+
		"\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7\22\2\2\u012d+\3\2\2\2\u012e\u012f"+
		"\7\16\2\2\u012f\u0134\5.\30\2\u0130\u0131\7\b\2\2\u0131\u0133\5.\30\2"+
		"\u0132\u0130\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7\17\2\2"+
		"\u0138-\3\2\2\2\u0139\u013a\7\36\2\2\u013a\u013b\7\5\2\2\u013b\u013c\5"+
		"&\24\2\u013c/\3\2\2\2\u013d\u013f\5$\23\2\u013e\u013d\3\2\2\2\u013f\u0142"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0144\7\36\2\2\u0144\u0145\7\36\2\2\u0145\u014d\7"+
		"\16\2\2\u0146\u014c\5\60\31\2\u0147\u014c\5\n\6\2\u0148\u014c\5\f\7\2"+
		"\u0149\u014c\5\20\t\2\u014a\u014c\5\26\f\2\u014b\u0146\3\2\2\2\u014b\u0147"+
		"\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u0150\u0152\7\17\2\2\u0151\u0153\7\37\2\2\u0152"+
		"\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\61\3\2\2\2)\66:BMV[amz\u0086"+
		"\u008b\u0092\u0095\u009a\u009e\u00a4\u00ab\u00b2\u00b7\u00bd\u00c3\u00c5"+
		"\u00c9\u00d2\u00db\u00e7\u00f1\u00f6\u00fc\u0102\u0107\u0118\u011e\u0129"+
		"\u0134\u0140\u014b\u014d\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}