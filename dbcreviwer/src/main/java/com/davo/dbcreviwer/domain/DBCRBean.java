package com.davo.dbcreviwer.domain;

import java.util.List;

/**
 * 
 * @author davo
 *
 */
public class DBCRBean extends BaseBean {
	
	private String fileName;
	
	private String author;
	
	private int nol; //Number of lines
	
	private int nos; //Number of sentences
	
	private List<String> content;
	
	private List<ErrorBean> errors;
	

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNol() {
		return nol;
	}

	public void setNol(int nol) {
		this.nol = nol;
	}

	public int getNos() {
		return nos;
	}

	public void setNos(int nos) {
		this.nos = nos;
	}
	
	public List<String> getContent() {
		return content;
	}

	public void setContent(List<String> content) {
		this.content = content;
	}

	public List<ErrorBean> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorBean> errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder("Author: ");
		buffer.append(author);
		buffer.append(" File name: ");
		buffer.append(fileName);
		buffer.append(" lines: ");
		buffer.append(nol);
		return buffer.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof DBCRBean && ((DBCRBean)obj).getFileName().equals(this.getFileName())){
			return true;
		}else
			return false;
	}

	@Override
	public int hashCode() {
		return (13 * fileName.hashCode());
	}


}
