package com.hcl.hibernatepractise.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee_Address implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addrId;
	private String street;
	private String city;
	private String state;
	private String country;

	/*
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "EMP_ID") private Employee employee;
	 */

	public Employee_Address() {
		super();

	}

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee_Address [addrId=" + addrId + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}

}
