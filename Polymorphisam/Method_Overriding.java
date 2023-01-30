package com.Polymorphisam;


	class Method_Overriding {
		void show(){
		System.out.println("Nandha");
		}
		static class Child extends Method_Overriding {
		void show(){
		super.show();
		System.out.println("Selvam");
		}
		public static void main(String args[]){
		Method_Overriding ob = new Child();
		ob.show();
		
		}
		}

}
