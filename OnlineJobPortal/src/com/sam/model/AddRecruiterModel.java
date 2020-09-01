package com.sam.model;

public class AddRecruiterModel {
	private String FirstName ;
	private String LastName ;
	private String LoginId ;
	private String Password;
	private String DOB ;
	private String Gender ;
	private String Role;
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
	public String getLoginId() {
		return LoginId;
	}
	public void setLoginId(String loginId) {
		LoginId = loginId;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
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
	
}
