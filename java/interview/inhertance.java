package com.java.interview;


interface Mutiple_Company
{
public abstract void company();

}
 interface Mutiple_Profile{
	 public abstract void empid() ;
 }
 class inhertanc implements Mutiple_Company,Mutiple_Profile{
	public void empid()
	{System.out.println("mpl/22/20");}

	public void company()
	{System.out.println("Mobile Programming");}
 }
 public class inhertance
 {
public static void main(String[] args) {
	inhertanc in= new inhertanc();
	in.company();
	in.empid();

	 
 }
	}

	 
 
 
