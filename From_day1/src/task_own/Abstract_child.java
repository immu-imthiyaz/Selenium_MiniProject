package task_own;

public class Abstract_child extends Abstract_Parent{
	public void clsname() {
		System.out.println("5th std");

	}
	public static void main(String[] args) {
		Abstract_child ob9 = new Abstract_child();
		ob9.schlname();
		ob9.stdname();
		ob9.clsname();
		ob9.stdage();
	}
	@Override
	public void stdage() {
		System.out.println("18");
		
	}

}
