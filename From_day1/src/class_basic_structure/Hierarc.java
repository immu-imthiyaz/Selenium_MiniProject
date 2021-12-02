package class_basic_structure;

public class Hierarc extends Single_ext {
	public void tech() {
		System.out.println("mark1");

	}

	public void tech2() {
		System.out.println("mark2");
	}

	public static void main(String[] args) {
		Hierarc obj1 = new Hierarc();
		obj1.tech();
		obj1.tech2();
		obj1.basic();
		obj1.basic2();
		obj1.basic3();
		obj1.program();
		obj1.program2();
	}

}
