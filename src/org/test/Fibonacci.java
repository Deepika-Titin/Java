package org.test;

public class Fibonacci {
public static void main(String[] args) {
	int a=0,b=1,n=5;
	System.out.println(a);
	System.out.println(b);
	for (int i = 1; i <= n; i++) {
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		
	}
}
}
