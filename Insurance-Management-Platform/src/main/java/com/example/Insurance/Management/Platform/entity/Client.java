package com.example.Insurance.Management.Platform.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Client {
	
	@Id
	
	Long id;
	String name;
	Long dateofbirth;
	String address;
	Long contact;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Long dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	
	
	
	

}
