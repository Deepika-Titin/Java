package org.test;

public class CharSortUsingASCI {
	public static void main(String[] args) {
		/*ASCII CODE
		 * A_Z-----65-90
		 * a-z-----97-122
		 * 0-9-----48-57
		 */
		String name="Greens";
		char[] ch=name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]>ch[j]) {
					//we are using char as datatype becoz it is storing an character
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					
				}
				
			}
			
		}
		System.out.println("After sorting");
		for (char c : ch) {
			System.out.println(c);
			
		}
	}

}
