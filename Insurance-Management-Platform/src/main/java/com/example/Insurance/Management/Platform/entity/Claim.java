package com.example.Insurance.Management.Platform.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Claim {
	
	@Id
	
	Long claimNumber;
	String description;
	Long claimdate;
	String claimStatus;
	
	
	public Long getClaimNumber() {
		return claimNumber;
	}
	public void setClaimNumber(Long claimNumber) {
		this.claimNumber = claimNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getClaimdate() {
		return claimdate;
	}
	public void setClaimdate(Long claimdate) {
		this.claimdate = claimdate;
	}
	public String getClaimStatus() {
		return claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}
	
	

}
