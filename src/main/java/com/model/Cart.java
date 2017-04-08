package com.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart {
@Id 
@GeneratedValue(strategy=GenerationType.AUTO)
private int cart_id;
@Column
private double total;
@Column
private int quantiy;
@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
@JoinTable(name = "cart_product", joinColumns = {
		@JoinColumn(name = "cart_id") },
		inverseJoinColumns = { @JoinColumn(name = "id") })
private List<Product> product;

public int getCart_id() {
return cart_id;
}
public void setCart_id(int cart_id) {
this.cart_id = cart_id;
}

public double getTotal() {
return total;
}


public void setTotal(double total) {
this.total = total;
}

public List<Product> getProduct() {
return product;
}


public void setProduct(List<Product> product) {
this.product = product;
}
public int getQuantiy() {
	return quantiy;
}
public void setQuantiy(int quantiy) {
	this.quantiy = quantiy;
}
		
}
