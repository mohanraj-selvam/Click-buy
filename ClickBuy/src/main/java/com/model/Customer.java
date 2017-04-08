package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
@Size(min = 10)
@NotEmpty(message="Mobile is mandatory")
private String mobile;
@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="address_id")
private Address delAdderss;
private boolean enabled;
private String role;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="cart_id")
private Cart cart;
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
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
public Address getDelAdderss() {
	return delAdderss;
}
public void setDelAdderss(Address delAdderss) {
	this.delAdderss = delAdderss;
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
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}

}
