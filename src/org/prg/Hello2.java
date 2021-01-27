package org.prg;

public class Hello2 {
	public static void main(String[] args) {
		for (int i = 1; i<=3; i++) {
			for (int j = i+1; j <=i; j++) {
				System.out.println(j);
			}
		}
		//break cannot be used outside the loop
		//int i=5; 
		//if (i==5) {
			//break;
		//}
		//System.out.println(i);
		
		//continue cannot be used outside the loop
		//int i=5;
		//if (i==5) {
			//continue;
		//}
		//System.out.println(i);
	}
	

}
