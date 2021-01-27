package org.test;

public class Prime {
public static void main(String[] args) {
	int num=17;
	boolean res=true;
	if (num==0|| num==1) {
		System.out.println("0 and 1 not considered");
	} else {
for (int i = 2; i <num/2; i++) {
	if (num%i==0) {
		res=false;
		break;
	}
	
}
if (res==true) {
	System.out.println("Prime no.");
}
else {
	System.out.println("Not a Prime");
}
	}
}
}
