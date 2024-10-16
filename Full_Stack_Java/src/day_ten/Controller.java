package day_ten;
/*day ten (25/06/24)---> Encapsulation
 */

public class Controller {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.setId(100);
		System.out.println(obj.getId());
		
		obj.setName("Dipak");
		System.out.println(obj.getName());
		
		obj.setAge(22);
		System.out.println(obj.getAge());

	}

}
