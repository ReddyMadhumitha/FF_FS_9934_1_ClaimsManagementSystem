package com.hcl.claimsmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
/*
 * This class is used for getting the claimrequest details
 * 
 * @author reddy-madhumitha
 */
@Entity
public class ClaimRequest {
	@Id
	private int id;
	@NotEmpty
	private String claimInformation;
	@NotEmpty
	private String reason;
	private String status;
	@NotEmpty
	private String claimId;
	@NotEmpty
	private String memberId;
	/**
	 * 
	 */
	public ClaimRequest() {
		super();
	}
	/**
	 * @param id
	 * @param claimInformation
	 * @param reason
	 * @param status
	 * @param claimId
	 * @param memberId
	 */
	public ClaimRequest(int id, String claimInformation, String reason, String status, String claimId, String memberId) {
		super();
		this.id = id;
		this.claimInformation = claimInformation;
		this.reason = reason;
		this.status = status;
		this.claimId = claimId;
		this.memberId = memberId;
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
	 * @return the claimInformation
	 */
	public String getClaimInformation() {
		return claimInformation;
	}
	/**
	 * @param claimInformation the claimInformation to set
	 */
	public void setClaimInformation(String claimInformation) {
		this.claimInformation = claimInformation;
	}
	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
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
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
}
  