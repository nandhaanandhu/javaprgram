package com.Encapsulation;

public class Encapsul {
	
public static void main(String[] args) {
	

	Company c= new Company();
	c.setemp_no(1721);
	c.setName("Mobile Programming");
	c.setEmail("nandha@mobileprogramming.com");
	c.setAmount(30000);
	
	System.out.println(c.getemp_no());
	System.out.println(c.getName());
	System.out.println(c.getEmail());
	System.out.println(c.getAmount());

}	
	
	
	
}
