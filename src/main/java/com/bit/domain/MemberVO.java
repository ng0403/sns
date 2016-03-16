package com.bit.domain;

import java.util.Date;

public class MemberVO {
private String id;
private String password;
private String gender;
private Date regdate;

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Date getRegdate() {
	return regdate;
}
public void setRegdate(Date regdate) {
	this.regdate = regdate;
}
@Override
public String toString() {
	return "MemberVo [id=" + id + ", password=" + password + ", gender=" + gender + ", regdate=" + regdate + "]";
}
 
}
