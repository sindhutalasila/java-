package com.java.j001;

import java.util.Scanner;

public class StringCharCount {

	public static void main(String[] args) {
		System.out.println("enter input string:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
        //String s="";
		String s1="";
		for(int i=0;i<s.length();i++) {
			int c=0;
			//int c1=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					c++;	
				}
				}
			if(c==1) {
				s1+=s.charAt(i);
			} 
			
			
			}
			System.out.println("non repeating characters are:"+ s1);
		}
	}
 

 
