package com.java.j001;

public class Strings_types {

	public static void main(String[] args) {
		 
         StringBuilder sb=new StringBuilder("Hello");
         System.out.println("length of thr string:"+sb.length());
         System.out.println("CharAt of the string:"+sb.charAt(1));
         System.out.println("SubString of the given string:"+sb.substring(2));
         //System.out.println("Ensure of the given string is:"+sb.ensureCapacity(3);
         
         StringBuffer sbf=new StringBuffer("welcome to ");
         sbf.append("java");
         System.out.println(sbf);
         System.out.println("reverse of the given string:"+sbf.reverse());
         System.out.println("inserting of the given string:"+sbf.insert(1,"session"));
         System.out.println("deletion of the given string:"+sbf.delete(1,5));
         System.out.println("capacity  of the given string"+sbf.capacity());
         System.out.println("replace  of the given string"+sbf.replace(1, 3,"sindhu"));
	}

}
