package com.HuangsHotelReservation.model.domain;
import java.io.Serializable;

/**
 * 
 * @author Jay Huang
 *
 */

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5083099771658862389L;

	/**customer last name*/
	private String lastName;
	
	/**customer first name*/
	private String firstName;
	
	/**customer username*/
	private String userName;
	
	/**customer password*/
	private String password;
	
	/**customer address*/
	private String address;
	
	/**customer phone number*/
	private String phoneNumber;
	
	private String ID;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	public static void main(String[] args) {
		
	}
}
