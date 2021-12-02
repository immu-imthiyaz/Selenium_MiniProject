package class_basic_structure;

public class Single_ext extends Class_structure{
	public void program() {
	System.out.println("result1");	

	}
	public void program2() {
    System.out.println("result2");
	}
	public static void main(String[] args) {
		Single_ext obj = new Single_ext();
		obj.program();
		obj.program2();
		obj.basic();
		obj.basic2();
		obj.basic3();
		
	}
}
