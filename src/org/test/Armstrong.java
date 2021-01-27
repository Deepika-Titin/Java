package org.test;

public class Armstrong {
	public static void checkArmstrong(int num) {
		int n=num;
		int rem=0,res=0;
		while (num>0) {
			rem=num%10;
			res=res+(rem*rem*rem);
			num=num/10;
			
		}
		if (n==res) {
			System.out.println(n+"is an Armstrong number");
		} else {
System.out.println(n+"is not an Armstrong number");
		}
	}
	public static void main(String[] args) {
		checkArmstrong(153);
		checkArmstrong(123);
	}

}
