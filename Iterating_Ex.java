package com.java.j001;

import java.util.Scanner;

public class Iterating_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("enter string");
         Scanner sc=new Scanner(System.in);
         String str=sc.next();
         //String str1="";
         for(int i=0;i<str.length();i++) {
        	char c=str.charAt(i);
        	System.out.println(c);
        	 
         }
         
         
	}

}
