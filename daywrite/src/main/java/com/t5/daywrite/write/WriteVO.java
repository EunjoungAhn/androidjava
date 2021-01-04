package com.t5.daywrite.write;

public class WriteVO {
	private int addID;
	private String uID;
	private String addDate;
	private String content;
	
	public int getAddID() {
		return addID;
	}
	public void setAddID(int addID) {
		this.addID = addID;
	}
	public String getuID() {
		return uID;
	}
	public void setuID(String uID) {
		this.uID = uID;
	}
	public String getAddDate() {
		return addDate;
	}
	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "WriteVO [addID=" + addID + ", uID=" + uID + ", addDate=" + addDate +", content=" + content + "]";
	}
}
