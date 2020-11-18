package com.hcl.claimsmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
/*
 * This class is used for getting the Payment details
 * 
 * @author reddy-madhumitha
 */
@Entity
public class Payment {
	@Id
	private int id;
	@NotEmpty
	private String requestAmount;
	private String claimAmount;
	@NotEmpty
	private String claimId;
	/**
	 * 
	 */
	public Payment() {
		super();
	}
	/**
	 * @param id
	 * @param requestAmount
	 * @param claimAmount
	 * @param claimId
	 */
	public Payment(int id, String requestAmount, String claimAmount, String claimId) {
		super();
		this.id = id;
		this.requestAmount = requestAmount;
		this.claimAmount = claimAmount;
		this.claimId = claimId;
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
	 * @return the requestAmount
	 */
	public String getRequestAmount() {
		return requestAmount;
	}
	/**
	 * @param requestAmount the requestAmount to set
	 */
	public void setRequestAmount(String requestAmount) {
		this.requestAmount = requestAmount;
	}
	/**
	 * @return the claimAmount
	 */
	public String getClaimAmount() {
		return claimAmount;
	}
	/**
	 * @param claimAmount the claimAmount to set
	 */
	public void setClaimAmount(String claimAmount) {
		this.claimAmount = claimAmount;
	}
	/**
	 * @return the claimId
	 */
	public String getClaimId() {
		return claimId;
	}
	/**
	 * @param claimId the claimId to set
	 */
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	
}
