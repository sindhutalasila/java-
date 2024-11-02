package com.java.j001;
//Default constructor
/*public class constructorex {
	public static void main(String args[]) {
		constructorex ce=new constructorex(); 
		
	}
	constructorex() {
		System.out.println("default constructor is created");
	}
}*/

//constructor overloading
public class constructorex {
	
	constructorex(){
		System.out.println("constructor is created");
	}
	constructorex(int no,String name) { 
		System.out.println("The Number Is :" +no);
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		constructorex ce=new constructorex();
		constructorex ce1=new constructorex(10,"sindhu");


	}

}

/*public class constructorex {
	public static void main(String args[]) {
		constructorex ce=new constructorex();
		
		
	}
	constructorex() {
		int no=10;
		System.out.println(no);
		
	}
	
}*/