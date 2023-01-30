package com.assignment;

class one{
	public void company() {
System.out.println("Mobile programming");
	}
}

class two extends one{
	public void empid() {
System.out.println("mp/22/11/05");
	}
}
class three extends two{
	public void branch() {
System.out.println("Bangalore");
	}
}

public class Multi {
public static void main(String[] args) {
	three s = new three();
	s.company();
	s.empid();
	s.branch();
}
}
