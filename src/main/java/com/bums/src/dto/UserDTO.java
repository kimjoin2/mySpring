package com.bums.src.dto;

public class UserDTO {
	private String id;
	private String pw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", pw=" + pw + "]";
	}
	
	public UserDTO(){}
	public UserDTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
}
