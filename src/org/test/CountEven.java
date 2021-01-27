package org.test;

public class CountEven {
public static void main(String[] args) {
	int count1=0,count2=0;
	for (int i = 2; i <=100; i++) {
		if (i%2==0) {
			count1++;
		} else {
       count2++;
		}	
	}
	System.out.println(count1);
	System.out.println(count2);
}
}
