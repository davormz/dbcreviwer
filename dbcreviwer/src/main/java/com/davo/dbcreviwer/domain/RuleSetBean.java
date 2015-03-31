package com.davo.dbcreviwer.domain;

import java.util.List;

/**
 * 
 * @author davo
 *
 */
public class RuleSetBean extends BaseBean{
	
	private Integer id;
	
	private String name;
	
	private List<RuleBean> rules;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<RuleBean> getRules() {
		return rules;
	}

	public void setRules(List<RuleBean> rules) {
		this.rules = rules;
	}

	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder("Ruleset ID: ");
		buffer.append(id);
		buffer.append(" : ");
		buffer.append(name);
		return buffer.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof RuleSetBean && ((RuleSetBean) obj).getId().equals(this.id)){
			return true;
		}else
			return false;
	}

	@Override
	public int hashCode() {
		return (31 * id + name.hashCode());
	}


}
