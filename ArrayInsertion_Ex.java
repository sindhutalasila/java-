package com.java.j001;

import java.util.Arrays;

public class ArrayInsertion_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] originalArray= {1,2,4,5};
		int insertingElement=3;
		int indexValue=2;
		int [] newArray=new int[originalArray.length+1];
		for(int i=0;i<indexValue;i++) {
			newArray[i]=originalArray[i];
			
		}
		newArray[indexValue]=insertingElement;
		for(int i=indexValue;i<originalArray.length;i++) {
			newArray[i+1]=originalArray[i];
		}
		System.out.println(Arrays.toString(newArray));

	}

}
