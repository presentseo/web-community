package com.community.vo;

public class Suggestion {
	
	private int suggestionPostNo;
	private int empNo;
	
	public Suggestion() {};
	
	public int getSuggestionPostNo() {
		return suggestionPostNo;
	}
	public void setSuggestionPostNo(int suggestionPostNo) {
		this.suggestionPostNo = suggestionPostNo;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	@Override
	public String toString() {
		return "Suggestion [suggestionPostNo=" + suggestionPostNo + ", empNo=" + empNo + "]";
	}
	
}