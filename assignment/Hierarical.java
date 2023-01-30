package com.assignment;

class com{
	public void company() {
System.out.println("Mobile programming");
	}
}

class emp extends com{
	public void empid() {
System.out.println("mp/22/11/05");
	}
}
class brah extends com{
	public void branch() {
System.out.println("Bangalore");
	}
}


public class Hierarical {
public static void main(String[] args) {
	brah s = new brah();
	s.branch();
	s.company();
	 emp t=new emp();
	 t.empid();
	 t.company();
}
}
