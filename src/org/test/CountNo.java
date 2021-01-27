package org.test;
//count digits in no...
public class CountNo {
	public static void main(String[] args) {
		int num=153;
		int count=0;
		while (num>0) {
			count++;
			num=num/10;
		}
		System.out.println(count);
	}

}
