package class_basic_structure;

public class Poly_meth_Load {
	public void boys(String count ) {
		System.out.println("total boys:" + count);

	}
	public void boys(float absentboys) {
		System.out.println("absenties"+ absentboys);

	}
	public void boys(int top) {
		System.out.println("marks" + top);

	}
	public static void main(String[] args) {
		Poly_meth_Load obj = new Poly_meth_Load();
		obj.boys("ten");
		obj.boys(10f);
		obj.boys(100 );
		
	}
	

}
