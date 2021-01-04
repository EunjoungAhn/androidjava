package com.t5.daywrite.user;

public class UserVO {
	private String uID;
	private String name;
	private String password;
	
	public UserVO() {
		super();
	}
	
	public UserVO(String uID, String name, String password) {
		super();
		this.uID = uID;
		this.name = name;
		this.password = password;
	}

	public String getuID() {
		return uID;
	}
	public void setuID(String uID) {
		this.uID = uID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserVO [uID=" + uID + ", name=" + name + ", password=" + password +"]";
	}
}