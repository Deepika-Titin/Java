package org.test;

public class SeparatingChars {
	public static void main(String[] args) {
		String name="Greens123@gmail.com";
		String upper="",lower="",digits="",special="";
		int upperCount=0,lowerCount=0,digitCount=0,specialCount=0;
		char[]ch=name.toCharArray();
		for (char c : ch) {
			//we can mention ascii as character too..like c>=65instead---c='A'
	//we can use predefined method too like if(c>=...)instead----if(Character.isUppercase(c))
			if (c>=65 && c<=90) {
				upperCount++;
				upper=upper+c;
			}
			else if (c>=97&& c<=122) {
				lowerCount++;
				lower=lower+c;
			}
			else if (c>=48&&c<=57) {
				digitCount++;
				digits=digits+c;
			}
			else {
				specialCount++;
				special=special+c;
			}
		}
		System.out.println("Uppercase :"+upper+"Count : "+ upperCount);
		System.out.println("Lowercase :"+lower+"Count : "+ lowerCount);
		System.out.println("Digits :"+digits+"Count : "+ digitCount);
		System.out.println("Uppercase :"+special+"Count : "+ specialCount);
		}

}
