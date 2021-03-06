/*
* generated by Xtext
*/

package org.xtext.example.lmrc.entity.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class EntityDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Module");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEntitiesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEntitiesEntityParserRuleCall_3_0 = (RuleCall)cEntitiesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Module:
		//
		//	"module" name=ID "{" entities+=Entity* "}";
		public ParserRule getRule() { return rule; }

		//"module" name=ID "{" entities+=Entity* "}"
		public Group getGroup() { return cGroup; }

		//"module"
		public Keyword getModuleKeyword_0() { return cModuleKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//entities+=Entity*
		public Assignment getEntitiesAssignment_3() { return cEntitiesAssignment_3; }

		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_3_0() { return cEntitiesEntityParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributesAttributeParserRuleCall_3_0 = (RuleCall)cAttributesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Entity:
		//
		//	"entity" name=ID "{" attributes+=Attribute* "}";
		public ParserRule getRule() { return rule; }

		//"entity" name=ID "{" attributes+=Attribute* "}"
		public Group getGroup() { return cGroup; }

		//"entity"
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//attributes+=Attribute*
		public Assignment getAttributesAssignment_3() { return cAttributesAssignment_3; }

		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_3_0() { return cAttributesAttributeParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeAbstractTypeParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//Attribute:
		//
		//	name=ID ":" type=AbstractType;
		public ParserRule getRule() { return rule; }

		//name=ID ":" type=AbstractType
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//type=AbstractType
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//AbstractType
		public RuleCall getTypeAbstractTypeParserRuleCall_2_0() { return cTypeAbstractTypeParserRuleCall_2_0; }
	}

	public class NamedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Named");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cModuleParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cAttributeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Named:
		//
		//	Module | Entity | Attribute;
		public ParserRule getRule() { return rule; }

		//Module | Entity | Attribute
		public Alternatives getAlternatives() { return cAlternatives; }

		//Module
		public RuleCall getModuleParserRuleCall_0() { return cModuleParserRuleCall_0; }

		//Entity
		public RuleCall getEntityParserRuleCall_1() { return cEntityParserRuleCall_1; }

		//Attribute
		public RuleCall getAttributeParserRuleCall_2() { return cAttributeParserRuleCall_2; }
	}

	public class AbstractTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AbstractType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBooleanTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIntTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cStringTypeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cEntityReferenceParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//AbstractType:
		//
		//	BooleanType | IntType | StringType | EntityReference;
		public ParserRule getRule() { return rule; }

		//BooleanType | IntType | StringType | EntityReference
		public Alternatives getAlternatives() { return cAlternatives; }

		//BooleanType
		public RuleCall getBooleanTypeParserRuleCall_0() { return cBooleanTypeParserRuleCall_0; }

		//IntType
		public RuleCall getIntTypeParserRuleCall_1() { return cIntTypeParserRuleCall_1; }

		//StringType
		public RuleCall getStringTypeParserRuleCall_2() { return cStringTypeParserRuleCall_2; }

		//EntityReference
		public RuleCall getEntityReferenceParserRuleCall_3() { return cEntityReferenceParserRuleCall_3; }
	}

	public class BooleanTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BooleanType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBooleanTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBooleanKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//BooleanType:
		//
		//	{BooleanType} "boolean";
		public ParserRule getRule() { return rule; }

		//{BooleanType} "boolean"
		public Group getGroup() { return cGroup; }

		//{BooleanType}
		public Action getBooleanTypeAction_0() { return cBooleanTypeAction_0; }

		//"boolean"
		public Keyword getBooleanKeyword_1() { return cBooleanKeyword_1; }
	}

	public class IntTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IntType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cIntTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cIntKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//IntType:
		//
		//	{IntType} "int";
		public ParserRule getRule() { return rule; }

		//{IntType} "int"
		public Group getGroup() { return cGroup; }

		//{IntType}
		public Action getIntTypeAction_0() { return cIntTypeAction_0; }

		//"int"
		public Keyword getIntKeyword_1() { return cIntKeyword_1; }
	}

	public class StringTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StringType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStringTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStringKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//StringType:
		//
		//	{StringType} "string";
		public ParserRule getRule() { return rule; }

		//{StringType} "string"
		public Group getGroup() { return cGroup; }

		//{StringType}
		public Action getStringTypeAction_0() { return cStringTypeAction_0; }

		//"string"
		public Keyword getStringKeyword_1() { return cStringKeyword_1; }
	}

	public class EntityReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EntityReference");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefEntityCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefEntityFQNParserRuleCall_0_1 = (RuleCall)cRefEntityCrossReference_0.eContents().get(1);
		
		//EntityReference:
		//
		//	ref=[Entity|FQN];
		public ParserRule getRule() { return rule; }

		//ref=[Entity|FQN]
		public Assignment getRefAssignment() { return cRefAssignment; }

		//[Entity|FQN]
		public CrossReference getRefEntityCrossReference_0() { return cRefEntityCrossReference_0; }

		//FQN
		public RuleCall getRefEntityFQNParserRuleCall_0_1() { return cRefEntityFQNParserRuleCall_0_1; }
	}

	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN:
		//
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private ModuleElements pModule;
	private EntityElements pEntity;
	private AttributeElements pAttribute;
	private NamedElements pNamed;
	private AbstractTypeElements pAbstractType;
	private BooleanTypeElements pBooleanType;
	private IntTypeElements pIntType;
	private StringTypeElements pStringType;
	private EntityReferenceElements pEntityReference;
	private FQNElements pFQN;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public EntityDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.lmrc.entity.EntityDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Module:
	//
	//	"module" name=ID "{" entities+=Entity* "}";
	public ModuleElements getModuleAccess() {
		return (pModule != null) ? pModule : (pModule = new ModuleElements());
	}
	
	public ParserRule getModuleRule() {
		return getModuleAccess().getRule();
	}

	//Entity:
	//
	//	"entity" name=ID "{" attributes+=Attribute* "}";
	public EntityElements getEntityAccess() {
		return (pEntity != null) ? pEntity : (pEntity = new EntityElements());
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}

	//Attribute:
	//
	//	name=ID ":" type=AbstractType;
	public AttributeElements getAttributeAccess() {
		return (pAttribute != null) ? pAttribute : (pAttribute = new AttributeElements());
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}

	//Named:
	//
	//	Module | Entity | Attribute;
	public NamedElements getNamedAccess() {
		return (pNamed != null) ? pNamed : (pNamed = new NamedElements());
	}
	
	public ParserRule getNamedRule() {
		return getNamedAccess().getRule();
	}

	//AbstractType:
	//
	//	BooleanType | IntType | StringType | EntityReference;
	public AbstractTypeElements getAbstractTypeAccess() {
		return (pAbstractType != null) ? pAbstractType : (pAbstractType = new AbstractTypeElements());
	}
	
	public ParserRule getAbstractTypeRule() {
		return getAbstractTypeAccess().getRule();
	}

	//BooleanType:
	//
	//	{BooleanType} "boolean";
	public BooleanTypeElements getBooleanTypeAccess() {
		return (pBooleanType != null) ? pBooleanType : (pBooleanType = new BooleanTypeElements());
	}
	
	public ParserRule getBooleanTypeRule() {
		return getBooleanTypeAccess().getRule();
	}

	//IntType:
	//
	//	{IntType} "int";
	public IntTypeElements getIntTypeAccess() {
		return (pIntType != null) ? pIntType : (pIntType = new IntTypeElements());
	}
	
	public ParserRule getIntTypeRule() {
		return getIntTypeAccess().getRule();
	}

	//StringType:
	//
	//	{StringType} "string";
	public StringTypeElements getStringTypeAccess() {
		return (pStringType != null) ? pStringType : (pStringType = new StringTypeElements());
	}
	
	public ParserRule getStringTypeRule() {
		return getStringTypeAccess().getRule();
	}

	//EntityReference:
	//
	//	ref=[Entity|FQN];
	public EntityReferenceElements getEntityReferenceAccess() {
		return (pEntityReference != null) ? pEntityReference : (pEntityReference = new EntityReferenceElements());
	}
	
	public ParserRule getEntityReferenceRule() {
		return getEntityReferenceAccess().getRule();
	}

	//FQN:
	//
	//	ID ("." ID)*;
	public FQNElements getFQNAccess() {
		return (pFQN != null) ? pFQN : (pFQN = new FQNElements());
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}

	//terminal ID:
	//
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
