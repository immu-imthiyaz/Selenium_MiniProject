package com.org;

public class Method_Overloading_Ext extends Method_Overloading {
	public void studentDetails(String ext) {
		System.out.println("ext");

	}
	public static void main(String[] args) {
		Method_Overloading_Ext obj = new Method_Overloading_Ext();
		obj.studentDetail();
		obj.studentDetails("ext");
		obj.studentDetail(19);
		obj.studentDetail("immu", "selenium", 35);
		obj.studentDetail(50, 49, 99.9f);
		
		
		
		
		
	}

}
