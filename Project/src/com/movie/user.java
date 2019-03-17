package com.movie;



import javax.faces.bean.ManagedBean;

@ManagedBean(name = "user")
public class user {
	private String firstName;
	private String lastName;
	private int age;
	private String userName;
	private String password;
	private String printMessage;
	private String feedback;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fName) {
		this.firstName = fName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getprintMessage() {
		if(firstName == null && lastName == null)
		{
			printMessage = " Hello ";
		}
		else
		{
		printMessage = " Hello " + getFirstName() + " "+getLastName()+ " You Succesfully register into our Website...";
		}
		return printMessage;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
}
