package day_one2907;

public class StaticinnerClass {

	private static class inner{
		void show() {
			System.out.println("This is inner");
		}
		
	}
	void display() {
		System.out.println("This is outer");
	}
	public static void main(String [] args) {
		StaticinnerClass outobj = new StaticinnerClass();
		StaticinnerClass.inner inobj= new StaticinnerClass.inner();
		inobj.show();
		outobj.display();
	}
}
