package day_one2907;

public class InnerClass {

	class inner {
		void disp() {
			System.out.println("This is inner class");
		}
	}
	public static void main(String[] args) {
		InnerClass outobj = new InnerClass();
		
		InnerClass.inner inobj = outobj.new inner();
		inobj.disp();
	}

}
