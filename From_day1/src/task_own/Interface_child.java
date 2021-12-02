package task_own;

public class Interface_child implements Interface_parent {
	@Override
	public void road1() {
System.out.println("bypass");		
	}
	@Override
	public void road2() {
System.out.println("mainroad");		
	}
	@Override
	public void road3() {
System.out.println(20 + 30 *30/10);		
	}
	public static void main(String[] args) {
		Interface_child iv = new Interface_child();
		iv.road1();
		iv.road2();
		iv.road3();
	}

}
