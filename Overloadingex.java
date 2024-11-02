package com.java.j001;

public class Overloadingex {
         static int add(int a,int b) { //static method
        	 int c=a+b;
        	 System.out.println(c);
        	 return c;
        	 }
         static {
        	 String name="sindhu";      //static block
        	 System.out.println(name);
        	 }
         {
        	 int c=12;                 //instance block
        	 int d=2;
        	 int e=c*d;
        	 System.out.println(e);
        	 
         }
         Overloadingex(int a,String name) {  //paramaterized constructor
        	System.out.println(a);
        	System.out.println(name);
        	
        	 
         }
	public static void main(String[] args) {
		   
           //System.out.println("overloading the constructor");
           add(10,20);                          //static method
           Overloadingex ol=new Overloadingex(10,"sindhu");//parameterized constructor with object
           
	}

}
