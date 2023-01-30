package com.abstraction;

public class Banks extends Bank_Details{

	

	@Override
	public void cheque() {
System.out.println("new cheque");		
	}

	@Override
	public void statement() {
System.out.println("6month statement");		
	}
public static void main(String[] args) {
Banks s= new Banks();
s.bank();
s.cheque();
s.statement();
	}
}
