package day_two3007;

import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("For Loop...");
//		System.out.println("Enter the number :");
//		int n = sc.nextInt();
//		
//		for(int i = 0; i<= n; i++) {
//			System.out.println(i);
//		}
//		
//		System.out.println("While Loop...");
//		
//		int a = 1;
//		int i = 10;
//		
//		while(i>=a) {
//			System.out.println("Hii..." + i);
//			i--;
//		}
		
		System.out.println("Do While Loop...");
		int a = 10;
		do {
			System.out.println("Executed...");
			--a;
		}
		while(a<5);
		
		
		

	}

}
