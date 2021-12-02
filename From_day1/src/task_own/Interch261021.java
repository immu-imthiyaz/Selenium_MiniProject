package task_own;

public class Interch261021 implements Inter261021 {
	@Override
	public void man() {
		System.out.println("five");
	}
	@Override
	public void woman() {
		System.out.println("ten");
	}
	@Override
	public void human() {
		System.out.println(20+30+" "+"total");
	}
	public void family() {
		System.out.println("imthiyaz");
		
	}
	public static void main(String[] args) {
		Interch261021 obj = new Interch261021();
		obj.man();
		obj.woman();
		obj.human();
		obj.family();
	}

}
