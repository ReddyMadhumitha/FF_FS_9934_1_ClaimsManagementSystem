package com.hcl.claimsmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
/*
 * This class is used for getting the User details
 * 
 * @author reddy-madhumitha
 */


@Entity
@Table(name="user")
public class User {
	@Id
	private int id;
	@NotEmpty
	private String userId;
	@NotEmpty
	private String password;
	private String status;
	private String confirmPassword;
	private int roleId;
	/**
	 * 
	 */
	public User() {
		super();
	}
	/**
	 * @param id
	 * @param userId
	 * @param password
	 * @param status
	 * @param confirmPassword
	 * @param roleId
	 */
	public User(int id, @NotEmpty String userId, @NotEmpty String password, String status, String confirmPassword,
			int roleId) {
		super();
		this.id = id;
		this.userId = userId;
		this.password = password;
		this.status = status;
		this.confirmPassword = confirmPassword;
		this.roleId = roleId;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}
	/**
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
}
