package com.sam.model;

public class AddJobModel {
	private String CompanyName;
	private String Language;
	private String Date;
	private String Address;
	private String Description;
	private String Title;
	public String getCompanyName()
	{
		return CompanyName;
	}
	public void setCompanyName(String companyName)
	{
		CompanyName = companyName;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language)
	{
		Language = language;
	}
	public String getDate()
	{
		return Date;
	}
	public void setDate(String date)
	{
		Date = date;
	}
	public String getAddress()
	{
		return Address;
	}
	public void setAddress(String address)
	{
		Address = address;
	}
	public String getDescription()
	{
		return Description;
	}
	public void setDescription(String description)
	{
	Description = description;
	}
	
	public String getTitle()
	{
		return Title;
	}
	public void setTitle(String title)
	{
		Title = title;
	}
}
