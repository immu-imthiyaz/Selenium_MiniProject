package task_own;

public class Interface_task2 implements Interface_task1{
	@Override
	public void sunset() {
		System.out.println("evening");
		
	}
	@Override
	public void sunrise() {
	System.out.println("morning");	
	}
	@Override
	public void moon() {
System.out.println("night");		
	}
	@Override
	public void sky() {
		System.out.println("all in the sky");
		
	}
	
	public static void main(String[] args) {
		Interface_task2 obj = new Interface_task2();
		obj.sky();
		obj.moon();
		obj.sunset();
		obj.sunrise();
	}
	
	
	
}
