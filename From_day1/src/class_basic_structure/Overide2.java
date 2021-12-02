package class_basic_structure;

public class Overide2 extends Overide1{
	
	public void bike() {
		super.bike();
    System.out.println("trk 502");
	}
	public static void main(String[] args) {
		Overide2 obj = new Overide2();
		obj.bike();
		
	}
	

}
