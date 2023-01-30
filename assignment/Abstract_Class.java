package com.assignment;

	abstract class Company {
		  abstract void employee();
		
	}
		 class Branch extends Company {
		    
		  // implementation of abstract method
		  public void empolyee() {
		    System.out.println("Bangalore");
		  }

		@Override
		void employee() {
			// TODO Auto-generated method stub
			
		}
		}

		class Domain extends Company {
		    
		  // implementation of abstract method
		  public void employee() {
		    System.out.println("Nandha");
		  }
		}

		 class Abstract_Class {
		  public static void main(String[] args) {
		    Domain m1 = new Domain();
		    m1.employee();
		    Branch s1 = new Branch();
		    s1.employee();
		  }
		}

	
