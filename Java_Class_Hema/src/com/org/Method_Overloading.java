package com.org;

public class Method_Overloading {
	public void studentDetail() {
		System.out.println("student Details");

	}
	public void studentDetail(int a) {
		System.out.println(a);
	}


	public void studentDetail(int mark, int sub, float percentage) {
		System.out.println(mark + " " + sub + " " + percentage);
	}
	public void studentDetail(String name, String course, int roll) {
		System.out.println(name + " " + course + " " + roll);

	}
	
	// main method
	public static void main(String[] args) {
		Method_Overloading obj = new Method_Overloading();
		obj.studentDetail();
		obj.studentDetail(9);
		obj.studentDetail("imthiyaz", "java", 27);
		obj.studentDetail(100, 91, 90.1f);

	}

}
