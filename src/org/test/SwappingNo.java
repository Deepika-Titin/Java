package org.test;

public class SwappingNo {
	//swapping with temp..variable
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
