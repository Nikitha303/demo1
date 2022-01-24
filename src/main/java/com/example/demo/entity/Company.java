package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Company {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	String name;
    String location;
	
	@OneToOne(mappedBy ="company")
	User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="company_address_id", referencedColumnName = "id")
	Address address;
	
	
	public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}




	public String getLocation() {
		return location;
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




}
