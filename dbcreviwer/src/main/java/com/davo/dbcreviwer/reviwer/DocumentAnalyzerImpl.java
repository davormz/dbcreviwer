package com.davo.dbcreviwer.reviwer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.sql.SQLiteBaseListener;
import org.antlr.v4.runtime.sql.SQLiteLexer;
import org.antlr.v4.runtime.sql.SQLiteParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.davo.dbcreviwer.domain.RuleSetBean;

public class DocumentAnalyzerImpl implements DocumentAnalyzer {
	
	private RuleSetBean ruleSet;
	
	

	public RuleSetBean getRuleSet() {
		return ruleSet;
	}

	public void setRuleSet(RuleSetBean ruleSet) {
		this.ruleSet = ruleSet;
	}

	public void analyze(File document) {
		// TODO Auto-generated method stub
		
		try {
			ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(document));
			SQLiteLexer lexer = new SQLiteLexer(input);
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			
			SQLiteParser parser = new SQLiteParser(tokens);
			
			ParseTree tree = parser.insert_stmt();
			
			// Create a generic parse tree walker that can trigger callbacks
			ParseTreeWalker walker = new ParseTreeWalker();
			// Walk the tree created during the parse, trigger callbacks
			walker.walk(new SQLiteBaseListener(), tree);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
