package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int address_id;

private String lineOne;
private String city;
private String State;
private String country;
private String zipcode;
public int getId() {
	return address_id;
}
public void setId(int id) {
	this.address_id = id;
}
public String getLineOne() {
	return lineOne;
}
public void setLineOne(String lineOne) {
	this.lineOne = lineOne;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}

}
