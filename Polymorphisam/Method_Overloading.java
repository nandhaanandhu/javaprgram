package com.Polymorphisam;

public class Method_Overloading {
public void Company() {
System.out.println("Mobile Programming llc");
}
public void Company(String name) {
	System.out.println("empolyee name"+ name);
	
}
public void Company(String name,int no) {
	System.out.println(name+no);
	
}
public void Company(int emp,String name) {
	System.out.println(emp+ name);
	
}

	public static void main(String[] args) {
Method_Overloading m= new Method_Overloading();
m.Company();
m.Company("Nandha");
m.Company("QA", 1);
m.Company(7, "Joinig date");
	}
	

}
