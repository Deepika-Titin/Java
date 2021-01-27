package org.prg;

public class Hello1 {
	public static void main(String[] args) {
		for (int i = 0; i <=100; i++) {
			if (i==5) {
				System.out.println(i);
				System.out.println("---");
			}
		}
		//Using break
		for (int i = 0; i <=10; i++) {
		
			if (i==5) {
				break;	
			}
			System.out.println(i);
		}
		//Using continue
		for (int i = 0; i <=10; i++) {
			if (i==5) {
				continue;					}
		System.out.println(i);
		
		}
		//Using nested for loop
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=3; j++) {
				System.out.println(i);			
			}
		}
		//Using nested for loop
		for (int i = 1; i <=3; i++) {
			for (int j = i+1; j <=3; j++) {		
				System.out.println(j);							
			}
		}
		
	}
	

}
