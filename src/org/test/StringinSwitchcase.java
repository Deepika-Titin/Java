package org.test;

public class StringinSwitchcase {
	public static void main(String[] args) {
		String day="sun";
		switch (day) {
		case "mon":
			System.out.println("Monday");
			break;
		case "tue":
			System.out.println("Tuesday");
			break;

		default:
			System.out.println("Key not found");
			break;
		}
	}

}
