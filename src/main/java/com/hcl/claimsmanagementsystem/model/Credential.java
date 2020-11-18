/**
 * 
 */
package com.hcl.claimsmanagementsystem.model;

import javax.validation.constraints.NotEmpty;
/*
 * This class is used for getting the Credential details
 * 
 * @author reddy-madhumitha
 */
public class Credential {
	@NotEmpty
	private String userId; 
	@NotEmpty
	private String password;
	
	/**
	 * 
	 */
	public Credential() {
		super();
	}

	/**
	 * @param userId
	 * @param password
	 */
	public Credential(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Credential [userId=" + userId + ", password=" + password + "]";
	}
	
	
}
