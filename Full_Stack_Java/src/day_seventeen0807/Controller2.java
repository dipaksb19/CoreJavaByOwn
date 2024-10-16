package day_seventeen0807;

import java.util.Scanner;

public class Controller2 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the employee Id : ");
		emp.setId(sc.nextInt());
		
		System.out.println("Enter the employee name : ");
		emp.setName(sc.next());
		
		System.out.println("Enter the employee salary : ");
		emp.setSalary(sc.nextFloat());
		
		System.out.println(emp.toString());
	}

}
