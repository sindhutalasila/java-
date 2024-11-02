package com.java.j001;

import java.util.Scanner;

public class Vowels_Consonants {

	public static void main(String[] args) {
		System.out.println("enter input");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1="";
		String str2="";
		String reverse="";
		
		//System.out.println("enter string:" +str);
		for(int i=0;i<str.length();i++) {
			if(('a'==str.charAt(i)||'e'==str.charAt(i)||'i'==str.charAt(i)||'o'==str.charAt(i)||'u'==str.charAt(i))) {
				str1+=str.charAt(i);
			}
			else {
				str2+=str.charAt(i);
			}
			
			
		}
		for(int j=str1.length()-1;j>=0;j--) {
			 reverse+=str1.charAt(j);
	    
		}
		
		System.out.println("vowels are:"+str1+"  "+"consonants are:"+str2);
		System.out.println("reverse the vowel:"+reverse);
		System.out.println("vowels and consonants:"+str2+reverse);
	}

}
