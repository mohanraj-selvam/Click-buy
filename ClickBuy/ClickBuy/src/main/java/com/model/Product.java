package com.model;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@Column
private String product_Name;
@Column
private String descripction;
@Column
private int price;
@Column
private Date mfg_Date;
@Transient
private MultipartFile image;
@ManyToMany( fetch = FetchType.EAGER,mappedBy = "product")
private List<Cart> cart;
@Column
private int cartQuantity;

public int getCartQuantity() {
	return cartQuantity;
}

public void setCartQuantity(int cartQuantity) {
	this.cartQuantity = cartQuantity;
}

public List<Cart> getCart() {
	return cart;
}

public void setCart(List<Cart> cart) {
	this.cart = cart;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getProduct_Name() {
	return product_Name;
}

public void setProduct_Name(String product_Name) {
	this.product_Name = product_Name;
}

public String getDescripction() {
	return descripction;
}

public void setDescripction(String descripction) {
	this.descripction = descripction;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public Date getMfg_Date() {
	return mfg_Date;
}

public void setMfg_Date(Date mfg_Date) {
	this.mfg_Date = mfg_Date;
}

public MultipartFile getImage() {
	return image;
}

public void setImage(MultipartFile image) {
	this.image = image;
}


}
