package org.test;

public class sumofOdd {
public static void main(String[] args) {
	int a=100;
	for (int i = 1; i <=a; i++) {
		if (i%2!=0) {
			int sum=0;
			sum +=i;
			System.out.println(sum);
		}
	}
}
}
