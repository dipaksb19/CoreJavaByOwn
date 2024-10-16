package conditionalstatement;

import java.util.Scanner;
public class PrintFeverorNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the temperature : ");
		double temp = sc.nextDouble();
		
		if(temp > 100) {
			System.out.println("You have a high fever !");
		}
		else {
			System.out.println("You does not have fever");
		}

	}

}
