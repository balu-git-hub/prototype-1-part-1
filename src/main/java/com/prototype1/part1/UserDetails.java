package com.prototype1.part1;

import javax.validation.constraints.*;






public class UserDetails {
	
	@Size(min = 3 , max = 20)
	@NotBlank
	private String firstName;
	
	
	
	private String lastName;
	
	
	private String middleName;
	
	@NotBlank
	
	private String address;
	
	@NotBlank
	private String country;
	
	@NotBlank
	private String state;
	
	@NotBlank
	@Size(min = 6,max = 6, message = "postal code must be 6 digits")
	private String zipcode;
	
	@Email(message = "please enter a valid e-mail address")
	@NotBlank
	private String email;
	
	@NotBlank
	@Size(min = 10,max = 10, message = "number must be 10 digits")
	private String phoneNumber;
	
	
	@NotBlank
	private String height;
	
	@NotBlank
	private String weight;
	
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public @NotBlank @Size(min = 6, max = 6) String getZipcode() {
		return zipcode;
	}
	public void setZipcode(@NotBlank @Size(min = 6, max = 6) String zipcode) {
		this.zipcode = zipcode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(@NotBlank @Size(min = 10, max = 10) String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(@NotBlank String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(@NotBlank String weight) {
		this.weight = weight;
	}
	

	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", address=" + address + ", country=" + country + ", state=" + state + ", zipcode=" + zipcode
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", height=" + height + ", weight=" + weight
				+ "]";
	}
	
	
	
	

}
