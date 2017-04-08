package com.dao;

import com.model.Cart;

public interface CartDao {
public void addtocart(Cart cart);
public void removeFromCart(Cart cart);
public Cart getCartDetails(int cartid);
}
