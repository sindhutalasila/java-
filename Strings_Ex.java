package com.java.j001;

public class Strings_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                String str="hello";
                String str1="hello";
                //compare to
                if(str==str1) {
                	System.out.println("true");//compare the given string with the current string
                }
                System.out.println(str.compareTo(str1));
                if(str.equals(str1)) {
                	System.out.println("true");
                }
                //length
                int len=str.length();
                System.out.println(len);//length of the string
                //concat
                String str2="world";
                String str3=str.concat(str2);
                System.out.println(str3);//Adding two String
                //charAt
                char c=str.charAt(1);
                System.out.println(c);//char value given the index number
                //contains
                if(str.contains("e")) {
                	System.out.println("string was there");//Searches the sequence of the string,it returns boolean value
                	
                }
                //substring
                String s4=str.substring(1);
                System.out.println(s4);//it returns part of the string
                //equalsIsIgnoreCase
                if(str.equalsIgnoreCase("HELLO"));{
                	System.out.println("inside");//compares the two given strings
                }
                //endsWith
                System.out.println(str.endsWith("o"));//method checks if the string ends with a given suffix.it returns boolean values
                //format
                String s1=String.format("name is %s", str);
                System.out.println(s1);
                String s2=String.format("value is%f",32.8359876);//method returns the formatted string given by local,format and arguements
                System.out.println(s2);
                //getBytes
                byte[] b=str.getBytes();
                System.out.println(b);//this method does the encoding of string into the bytes and keeps it in an array of bytes
                //indexOf
                System.out.println(str.indexOf("o"));//returns the index
                //intern
                System.out.println("intern of the given string:" +str3.intern());//returns the interned string,it returns the canonical representation string
                //isEmpty
                System.out.println(str.isEmpty());
                //join
                String jo=String.join("-",str,str3);//join the two strings
                System.out.println(jo);
                //last indexof
                System.out.println(str.lastIndexOf("h"));//displays index of the variable
                //length
                System.out.println(str.length());
                //replace
                System.out.println(str.replace("o","O"));//replace the characters
                //replace all
                System.out.println(str.replaceAll(str, "java"));//replace all
                //split
                String sen="method splits this string against given regular expression and returns a char array.";
                System.out.println(sen.split("\\s"));
                //starts with
                System.out.println(str.startsWith("h"));//method checks if this string starts with the given prefix.It returns the boolen values
                //toCharArray
                char[] ch=str.toCharArray();
                System.out.println(ch);
                //tolower case
                System.out.println(str.toCharArray());//converted to lower case
                //toupper case
                System.out.println(str.toUpperCase());//converted to upper case
                System.out.println(str.trim());//This method trim the spaces.The string trim() method doesn't omit middle spaces.

               
	}

}

