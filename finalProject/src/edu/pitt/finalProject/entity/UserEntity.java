package edu.pitt.finalProject.entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UserEntity
 *
 */
@Entity

public class UserEntity implements Serializable {

	
	private Integer id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private Integer credits;
	private static final long serialVersionUID = 1L;

	public UserEntity() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	} 
	
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public Integer getCredits() {
		return this.credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}
   
}
