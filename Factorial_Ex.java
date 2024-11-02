package com.java.j001;

import java.util.Scanner;

public class Factorial_Ex {
	
	
	   public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("enter input");
           Scanner sn=new Scanner(System.in);
           int n=sn.nextInt();
           long fact=1;
           for(int i=1;i<=n;i++) { 
        	    fact=fact*i;
        	   }
           System.out.println(fact);
	}

}
