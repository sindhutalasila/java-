package com.java.j001;

public class CenteredPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=6;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n-i-1;j++) {
        		System.out.print("  ");
        	}
        	for(int k=0;k<2*i-1;k++) {
        		System.out.print(k+" ");
        	}
        	System.out.println();
        }
        
	}

}
