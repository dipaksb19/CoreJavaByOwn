package day_two3007;
import java.util.Scanner;
public class Voting {

	public static void main(String[] args) {
		System.out.println("---Checking the eligibility for vote---");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks :");
		int marks = sc.nextInt();
		
		if(marks>80) {
			System.out.println("First");
		}
		else if(marks>60) {
			System.out.println("Second");
		}
		else if(marks>40) {
			System.out.println("Third");
		}
		else {
			System.out.println("fail");
		}
		
		int num = 153;
		int div = num / 10;
		System.out.println(div);

	}
	
	
}
