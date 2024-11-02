package com.java.j001;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		System.out.println("Enter  name :");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1="";
		System.out.println("enter names is: "+str);
		for(int i=str.length()-1;i>=0;i--) {
			str1+=str.charAt(i);
		}
		
		System.out.println("reverse name is:" +str1);

	}

}
