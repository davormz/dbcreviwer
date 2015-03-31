package com.davo.dbcreviwer.reviwer;

import java.util.List;

import com.davo.dbcreviwer.domain.ErrorBean;

/**
 * 
 * @author davo
 *
 */
public interface DocumentAnalyzer {
	
	List<ErrorBean> analyze(List<String> content);
	
	
}
