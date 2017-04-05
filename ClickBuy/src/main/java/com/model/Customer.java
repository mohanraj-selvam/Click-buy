package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Customer {
@Id @GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="Cid") 
private int customerId;
@Column(name="password")
@NotEmpty(message="Name is mandatory")
private String password;
@Column(name="Email") 
@NotEmpty(message="Name is mandatory")
private String email;
@NotEmpty(message="First Name is mandatory")
@Column(name="firstname")
private String firstName;
@NotEmpty(message="Last Name is mandatory")
@Column(name="lastname")
private String lastName;
@Column(name="Mobile")
@NotEmpty(message="Mobile is mandatory")
private String mobile;
@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="address_id")
private Address delAdderss;
private boolean enabled;
private String role;

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int name) {
	this.customerId = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public boolean isEnabled() {
	return enabled;
}
public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Address getDelAdderss() {
	return delAdderss;
}
public void setDelAdderss(Address delAdderss) {
	this.delAdderss = delAdderss;
}

}
