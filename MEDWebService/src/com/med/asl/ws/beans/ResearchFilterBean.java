package com.med.asl.ws.beans;

import java.util.List;

public class ResearchFilterBean {
	private List<String> author;
	private List<String> symbol;
	public List<String> getAuthor() {
		return author;
	}
	public void setAuthor(List<String> author) {
		this.author = author;
	}
	public List<String> getSymbol() {
		return symbol;
	}
	public void setSymbol(List<String> symbol) {
		this.symbol = symbol;
	}
	
}
