package com.java.j001;

public class Number_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=4,value=1;
         int s;
         
         for(int i=1;i<=n;i++) {
        	 for(int j=1;j<=i;j++) {
        		 s=value++;
        		 System.out.print(s);
        	 }
        	 System.out.println();
         }
	}

}
