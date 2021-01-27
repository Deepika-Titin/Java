package org.test;

public class Ascending {
	public static void main(String[] args) {
		int a[]= {1,9,8,4,7};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				//for decending order we need to change a[i]<a[j]
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println("After sorting in Ascending order");
		for (int i : a) {
			System.out.println(i+"\t");
			
		}
	}
	

}
