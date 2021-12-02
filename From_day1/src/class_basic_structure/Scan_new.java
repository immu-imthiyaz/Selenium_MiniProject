package class_basic_structure;

import java.util.Scanner;

public class Scan_new {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks");
		
		int mark = scan.nextInt();
		if (mark>=35&mark<=50) {
			System.out.println("average");
		
			
		}
		else if (mark>=51&mark<=70) {
			System.out.println("A grade");
		}
		else {
			System.out.println("under 35 fail");
		}
		
	}

} 
