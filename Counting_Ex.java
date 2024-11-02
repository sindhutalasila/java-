package com.java.j001;

import java.util.Scanner;

public class Counting_Ex {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1="";
		int count=1;
		System.out.println("enter name is:" +str);
		for(int i=0;i<=str.length()-1;i++) {
			for(int j=1;j<=str.length()-1;j++) {
				if(str.charAt(i) == str.charAt(j) ) {
					count++;
					str1=str.charAt(i)+""+count;
					break;
				}
				else {
					count=0;
			       str1=str.charAt(i)+""+count;
				}
					
			}
			
			System.out.println(str1);
			
						}
		
	}	
		
	}
		
	


