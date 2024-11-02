package com.java.j001;
//

//public class methodcalling {
//	public static void main(String args[]) {
//		//String name="sindhu";
//		//System.out.println(name);
// 		 //print();
//		 //addition();
//		 //name();
//		 //int sub=subtraction();
//		 //System.out.println(sub-10);
//		methodcalling obj=new methodcalling();
//		int add=obj.addition(10,20);
//		System.out.println(add);
//		
//		
//}
//	/*static void print() {
//		System.out.println("method calling prog");
//	}
//	static int addition() {
//	   int sum=10+20;
//	   System.out.println(sum);
//	   return sum;
//	}
//	static String name() {
//		String name="sindhu"+"talasila";
//		System.out.println(name);
//		return name;
//		
//	}
//	 static int subtraction()
//	 {
//		 int a=20,b=20,sub=a-b;
//		 System.out.println(sub);
//		 return sub;
//	 }*/
//	//METHOD CALLING WITH OBJ
//	static int addition(int a,int b) {
//		int c=a+b;
//		return c;
//	}
//	
//	 
//}
//	

public class methodcalling {

	static void print() {
		System.out.println("method calling");
	}

	static int sum() {
		int a = 10;
		int b = 20;
		int add = a + b;
		System.out.println(add);
		return add;
	}
	

//	static String me(String fname, String lname) {
//		String name = fname + lname;
//		System.out.println(fname);
//		System.out.println(lname);
//		return name;
//
//	}

	public static void main(String[] args) {
		print();
		int c = sum();
		System.out.println(c + 10);
		
	}

}
//
//
