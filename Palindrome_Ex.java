package com.java.j001;

import java.util.Scanner;

public class Palindrome_Ex {

 
	public static void main(String[] args) {
//		
		System.out.println("Enter  name :");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1="";
		System.out.print("enter names is: "+str);
		for(int i=str.length()-1;i>=0;i--) {
			str1+=str.charAt(i);
			}
		
		//System.out.println(str1);
		if(str1.equals(str)) {
			System.out.println("Its Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}


	}
}
