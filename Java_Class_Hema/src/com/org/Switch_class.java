package com.org;

public class Switch_class {

	public static void main(String[] args) {

		int n = 5;
		switch (n) {
		case 1:
			System.out.println("flight cancel");
			break;
		case 2:
			System.out.println("flight reschedule");
			break;
		case 3:
			System.out.println("flight postponed");
			break;
		case 4:
			System.out.println("flight mismatch");
			break;
			
		default:
			System.out.println("flight irop cases");
			break;
		}
	}
}
