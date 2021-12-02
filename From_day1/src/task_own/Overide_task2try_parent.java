package task_own;

public class Overide_task2try_parent extends Overide_task2try_child{
	public void stdname(String house) {
		super.stdname(house);
		System.out.println("immu");
	}
	public void stdage(int age) {
		super.stdage(24);
		System.out.println(age);
		
	}
	public static void main(String[] args) {
		Overide_task2try_parent ob1 =new Overide_task2try_parent();
		ob1.stdname("vila");
		ob1.stdage(25);
	}
	
		
		
	

}
