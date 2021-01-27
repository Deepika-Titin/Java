package org.test;
//convert int to string
public class Reverse {
public static void main(String[] args) {
	int n=123;
	String revstr="";
	//int to str
	String num=String.valueOf(n);
	for (int j = num.length()-1; j >=0; j--) {
		char c=(num.charAt(j));
		revstr=revstr+c; 
	}
	//to convert a string into integer
	System.out.println(revstr);
	int no=Integer.parseInt(revstr);
	System.out.println(no);
}
//to reverse a no. without using predefined mtds...
}
