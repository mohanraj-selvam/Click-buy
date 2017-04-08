package com.controller;

import java.security.Principal;
import java.util.List;

import org.hibernate.NonUniqueObjectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.CartDao;
import com.dao.CustomerDao;
import com.dao.ProductDao;
import com.model.Cart;
import com.model.Customer;
import com.model.Product;

@Controller
public class CartController {
@Autowired
CartDao crt;
@Autowired
ProductDao pd;
@Autowired
CustomerDao customer;
@RequestMapping(value="/myCart")
public ModelAndView cart(Principal principal)
{	
	String username=principal.getName();
	System.out.println(username);
	List<Customer> custlist=customer.getByName(username);
	Customer cust=custlist.get(0);
	custlist.remove(0);
	Cart cart=cust.getCart();
	int cartid=cart.getCart_id();
	Cart c=crt.getCartDetails(cartid);
	List<Product> pdt=c.getProduct();
	ModelAndView model=new ModelAndView("cart");
	model.addObject("product", pdt);
	model.addObject("cust",cust);
	model.addObject("cart",c);
	return model;
	
}

@RequestMapping(value="/addtoCart/{id}", method=RequestMethod.GET)
public String addtoCart(@PathVariable int id,Principal principal)
{	

	String username=principal.getName();
	System.out.println(username);
	List<Customer> custlist=customer.getByName(username);
	Customer cust=custlist.get(0);
	custlist.remove(0);
	Cart cart=cust.getCart();
	List<Product> list=cart.getProduct();
	Product p=pd.getById(id);
	p.setCartQuantity(p.getCartQuantity()+1);
	list.add(p);
	cart.setCart_id(cart.getCart_id());
	cart.setProduct(list);
	cart.setQuantiy(cart.getQuantiy()+1);
	cart.setTotal(cart.getTotal()+p.getPrice());
	crt.addtocart(cart);
		return "redirect:/allProduct";
	
}
@RequestMapping(value="/removeFromCart/{id}")
public String removeCartItem(@PathVariable int id,Principal principal)
{
	String username=principal.getName();
	System.out.println(username);
	List<Customer> custlist=customer.getByName(username);
	Customer cust=custlist.get(0);
	custlist.remove(0);
	Cart cart=cust.getCart();
	List<Product> list=cart.getProduct();
	Product prdt=pd.getById(id);
	for(int i=0;i<list.size();i++){
		Product p=list.get(i);
		if(p.getId()==prdt.getId())
		{
			list.remove(i);
			break;
		}
	}
	prdt.setCartQuantity(prdt.getCartQuantity()-1);
	cart.setProduct(list);
	cart.setQuantiy(cart.getQuantiy()-1);
	cart.setTotal(cart.getTotal()-prdt.getPrice());
	crt.addtocart(cart);
	return "redirect:/myCart";
	
	
}

}