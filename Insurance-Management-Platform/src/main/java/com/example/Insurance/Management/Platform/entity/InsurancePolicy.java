package com.example.Insurance.Management.Platform.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class InsurancePolicy {
	
	@Id
	Long policyNumber;
	String type;
	Long coverageAmount;
	String premium;
	Long startdate;
	Long enddate;
	
	
	public Long getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(Long policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getCoverageAmount() {
		return coverageAmount;
	}
	public void setCoverageAmount(Long coverageAmount) {
		this.coverageAmount = coverageAmount;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public Long getStartdate() {
		return startdate;
	}
	public void setStartdate(Long startdate) {
		this.startdate = startdate;
	}
	public Long getEnddate() {
		return enddate;
	}
	public void setEnddate(Long enddate) {
		this.enddate = enddate;
	}
	
	

}
