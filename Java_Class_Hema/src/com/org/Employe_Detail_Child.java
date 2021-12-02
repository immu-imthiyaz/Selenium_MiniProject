package com.org;

public class Employe_Detail_Child extends Employe_Detail{
	@Override
	public void emp_Name(String name) {
		super.emp_Name(name);
		
	}
	@Override
	public void emp_Phoneno(String no) {
		super.emp_Phoneno(no);
	}
	@Override
	public void emp_salary(String salary) {
		super.emp_salary(salary);
	}
	public static void main(String[] args) {
		Employe_Detail_Child obj = new Employe_Detail_Child();
		obj.emp_Name("immu");
		obj.emp_Phoneno("909229011");
		obj.emp_salary("1000000000000000");
	}
	

}
