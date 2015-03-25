package com.davo.dbcreviwer.domain;

import com.davo.dbcreviwer.common.ErrorSeverity;

/**
 * 
 * @author davo
 *
 */
public class ErrorBean extends BaseBean {
	
	private String errorType;
	
	private ErrorSeverity errorSeverity;
	
	private int lineNumber;
	
	

	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	public ErrorSeverity getErrorSeverity() {
		return errorSeverity;
	}

	public void setErrorSeverity(ErrorSeverity errorSeverity) {
		this.errorSeverity = errorSeverity;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder("Error Type: ");
		buffer.append(errorType);
		buffer.append("Severity: ");
		buffer.append(errorSeverity.toString());
		return buffer.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ErrorBean && 
				((ErrorBean)obj).getErrorSeverity().equals(this.errorSeverity) &&
				((ErrorBean)obj).getErrorType().equals(this.errorType)){
			return true;
		}else
			return false;
	}

	@Override
	public int hashCode() {
		return (31 * errorType.hashCode());
	}

}
