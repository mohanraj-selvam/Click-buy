package com.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.dao.ProductDao;
import com.dao.ProductImpl;
import com.model.Product;

@Controller
public class ProductController {
	@Autowired
	ProductDao pd;
	
	@RequestMapping(value="/addProduct" ,method=RequestMethod.GET)
	public String prdt()
	{
		return "productlist";
	}
	@ModelAttribute("prdt")
	public Product getPrdt()
	{
		return new Product();
	}
	@RequestMapping(value="productlist/addproduct" , method=RequestMethod.POST)
	public String addProdt( @ModelAttribute ("prdt") Product p)
	{
		pd.addProduct(p);
		MultipartFile prodImage=p.getImage();
		if(!prodImage.isEmpty()){
			Path paths=Paths.get("C:/Users/Dont open/Documents/Eclipse/ClickBuy/src/main/webapp/resources/Images/"+ p.getId()+".png");
			try
		{
			prodImage.transferTo(new File(paths.toString()));
		} catch (IllegalStateException e) 
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		}
		
		return "redirect:/allProduct";
	} 
	@RequestMapping(value="/allProduct")

	public ModelAndView allProduct()
	{	
		ModelAndView model=new ModelAndView("pl");
		model.addObject("data", pd.getAllProducts());
		return model;
		
	}
	@RequestMapping(value="/product/delete/{id}" )
	public ModelAndView deletetProduct(@PathVariable int id )
	{
		ModelAndView m=new ModelAndView("pl");
		m.addObject("s","Deleted Successfully");
		pd.deleteById(id);
		return m;
		
	}
	
	@RequestMapping(value="/editProduct/{id}" ,method=RequestMethod.GET)
	public ModelAndView editProductGet(@PathVariable int id)
	{
		ModelAndView model=new ModelAndView("editProduct");
		model.addObject("d",pd.getById(id));
		return model;
	}
		
	@ModelAttribute("updt")
	public Product updt()
	{
		return new Product();
	}
	@RequestMapping(value="edit/product/{id}success" ,method=RequestMethod.POST)
	public ModelAndView editProduct( @PathVariable int id, @ModelAttribute ("updt") Product p )
	{	
		ModelAndView model=new ModelAndView("pl");
		model.addObject("Update","Updated Successfully");
		pd.editProduct(id,p);
		return model;
		
	}
	@RequestMapping(value="/details/{id}")
	public ModelAndView productDtails(@PathVariable int id)
	{	
		ModelAndView model=new ModelAndView("Detail");
		model.addObject("prdt",pd.getById(id));
		return model;
	}
	
}
