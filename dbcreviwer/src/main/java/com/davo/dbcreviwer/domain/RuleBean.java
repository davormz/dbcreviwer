package com.davo.dbcreviwer.domain;

import com.davo.dbcreviwer.common.RuleType;

/**
 * 
 * @author davo
 *
 */
public class RuleBean extends BaseBean {
	
	private Integer id;
	
	private String ruleName;
	
	private String ruleExpresion;
	
	private RuleType ruleType;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleExpresion() {
		return ruleExpresion;
	}

	public void setRuleExpresion(String ruleExpresion) {
		this.ruleExpresion = ruleExpresion;
	}

	public RuleType getRuleType() {
		return ruleType;
	}

	public void setRuleType(RuleType ruleType) {
		this.ruleType = ruleType;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

}
