package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product{
	  int id;  
	    String name;  
	    float price;  
	    public Product(int id, String name, float price) {  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;  
	    }  
	
}

public class Surplus {
	public static void main(String[] args) {
		List<Product>ProductList= new  ArrayList<Product>();
		 ProductList.add(new Product(121, "Iphone", 235647f));
		 ProductList.add(new Product(101, "SAmSung", 135647f));
		 ProductList.add(new Product(221, "HP", 4647f));
		 ProductList.add(new Product(321, "Nokia", 35647f));
		 ProductList.add(new Product(621, "Tablet Accer", 030647f));
		 // Create A Another List
		 List<Float>ProductList2=ProductList.stream().filter(p->p.price>2000).map(p->p.price).collect(Collectors.toList());
		 System.out.println("Filter list by Price..");
		 System.out.println(ProductList2);
		
		
	}

}
