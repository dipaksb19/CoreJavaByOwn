package day_twentyfour2307;

import java.util.Scanner;
public class Controller {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a id & name for 3 Students ");
		Student s[]=new Student[3];
		Student s1=new Student(sc.nextInt(), sc.next());
		s[0]=s1;
		Student s2=new Student(sc.nextInt(), sc.next());
		s[1]=s2;
		Student s3=new Student(sc.nextInt(), sc.next());
		s[2]=s3;

		for (int i = 0; i < s.length; i++) {
			System.out.println("id="+s[i].getId());
			System.out.println("Name="+s[i].getName());
			System.out.println("-----------");
		}

	}

}
