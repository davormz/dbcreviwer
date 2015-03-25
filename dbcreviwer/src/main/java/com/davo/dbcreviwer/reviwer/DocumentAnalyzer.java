package com.davo.dbcreviwer.reviwer;

import java.util.List;

import com.davo.dbcreviwer.domain.ErrorBean;

public interface DocumentAnalyzer {
	
	List<ErrorBean> analyze(List<String> content);
	
	
}
