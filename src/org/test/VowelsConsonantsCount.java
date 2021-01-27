package org.test;

public class VowelsConsonantsCount {
public static void main(String[] args) {
	String name="Greens123@gmail.com";
	String vowels="",consonants="";
	int vowelCount=0,consonantCount=0;
	char []ch=name.toCharArray();
	for (char c : ch) {
		if (c>=65&&c<=122) {
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			vowelCount++;
			vowels=vowels+c;
			
			} else {
consonants=consonants+c;
consonantCount++;
			}
			
		}
		
	}
	System.out.println("Vowels :"+vowels+"Count : "+ vowelCount);
	System.out.println("Consonants :"+consonants+"Count : "+ consonantCount);
	
}
}
