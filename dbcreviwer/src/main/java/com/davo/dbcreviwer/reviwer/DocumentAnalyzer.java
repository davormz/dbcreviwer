package com.davo.dbcreviwer.reviwer;

import java.io.File;
import java.util.List;

import com.davo.dbcreviwer.domain.ErrorBean;

/**
 * 
 * @author davo
 *
 */
public interface DocumentAnalyzer {
	
	void analyze(File document);
	
	
}
