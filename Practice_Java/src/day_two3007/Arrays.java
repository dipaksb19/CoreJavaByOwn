package day_two3007;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array : ");
		int size = sc.nextInt();
		int array [] = new int[size];
		
		System.out.println("Enter the elements of array : ");
		for(int i = 0; i<array.length; i++) {
			System.out.println("Enter number at " + i +" Index : ");
			array[i] = sc.nextInt();
		}
		
		System.out.println("Displaying array :");
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Sorting the array in ascending order: ");
		for(int i = 0; i<array.length;i++) {
			for(int j = i+1; j<array.length; j++) {
				if(array[i]>array[j]) {
					int temp = 0;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("---Sorted in ascending order successfully---");
		System.out.println("Displaying sorted array :");
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		System.out.println("Sorting the array in descending order: ");
		for(int i = 0; i<array.length;i++) {
			for(int j = i+1; j<array.length; j++) {
				if(array[i]<array[j]) {
					int temp = 0;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("---Sorted in descending order successfully---");
		System.out.println("Displaying sorted array :");
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		

	}

}
