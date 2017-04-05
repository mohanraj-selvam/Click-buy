package com.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
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
	
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
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
	}
