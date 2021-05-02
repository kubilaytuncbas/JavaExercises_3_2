package Entities;

public class User {
	
	private int userId;
	private String firstName;
	private String lastName;
	private int birthYear;
	private String nationalityIdentity;
	public User(int userId, String firstName, String lastName, int birthYear, String nationalityIdentity) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.nationalityIdentity = nationalityIdentity;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getNationalityIdentity() {
		return nationalityIdentity;
	}
	public void setNationalityIdentity(String nationalityIdentity) {
		this.nationalityIdentity = nationalityIdentity;
	}
	
	
	

}
