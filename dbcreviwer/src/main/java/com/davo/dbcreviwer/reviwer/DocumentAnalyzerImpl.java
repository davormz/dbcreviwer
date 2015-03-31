package com.davo.dbcreviwer.reviwer;

import java.util.List;

import com.davo.dbcreviwer.domain.ErrorBean;
import com.davo.dbcreviwer.domain.RuleSetBean;

public class DocumentAnalyzerImpl implements DocumentAnalyzer {
	
	private RuleSetBean ruleSet;
	
	

	public RuleSetBean getRuleSet() {
		return ruleSet;
	}

	public void setRuleSet(RuleSetBean ruleSet) {
		this.ruleSet = ruleSet;
	}



	public List<ErrorBean> analyze(List<String> content) {
		// TODO Auto-generated method stub
		return null;
	}

}
