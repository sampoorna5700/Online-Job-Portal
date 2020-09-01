package com.sam.model;

public class UserProfileModel {
 private String FirstName;
 private String LastName;
 private String LoginId;
 private String Password;
 private String Role;
 private String Gender;
 
 public String getLoginId() {
		return LoginId;
	}
	public void setLoginId(String loginId) {
		LoginId = loginId;
	}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}

public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public void setRole(String Role)
{
	this.Role = Role;
}
public String getRole()
{
	return Role;
}
public void setGender(String Gender)
{
	this.Gender = Gender;
}
public String getGender()
{
	return Gender;
}
}
