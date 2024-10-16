package day_seven;
//dayy seven (14/06/24)---> Method calling

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj = new Student();
		obj.id=1;
		obj.name="Dipak";
		obj.age=22;
		
		obj.display();
		
		Student s1 = new Student();
		s1.id=2;
		s1.name="Milind";
		s1.age=22;
		s1.display();
	}

}
