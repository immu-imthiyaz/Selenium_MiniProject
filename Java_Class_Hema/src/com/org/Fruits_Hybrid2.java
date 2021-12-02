package com.org;

public class Fruits_Hybrid2 extends Fruits_Hybrid1 {
	public void orange(int a1, double b, long c) {
		System.out.println(a1+b+c);
	}

   public static void main(String[] args) {
	   Fruits_Hybrid2 obj = new Fruits_Hybrid2();
	   obj.apple(10, 9);
	   obj.mango("one", 20);
	   obj.orange(10,2.9,20);
}

}