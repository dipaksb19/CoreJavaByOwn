package day_twentyone1707;

public class PrimeNum {

	public static void main(String[] args) {
		int n = 10;
		boolean flag = true;
		int count = 0;
		
		for(int i = 3; i < n; i++ ) {
			if(n % i == 0) {
				count++;
				flag = false;
			}
		}
		if (count == 0) {
			System.out.println("Number is Prime");
		}
		else {
			System.out.println("Number is not Prime");
		}

	}

}
