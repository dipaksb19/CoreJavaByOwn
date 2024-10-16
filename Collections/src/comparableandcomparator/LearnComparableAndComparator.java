package comparableandcomparator;

import java.util.*;
public class LearnComparableAndComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a1 = new Animal(4, "Leo", 10);
		Animal a2 = new Animal(2, "Leo", 4);
		Animal a3 = new Animal(2, "Bruno", 4);
		Animal a4 = new Animal(2, "Maxo", 4);
		Animal a5 = new Animal(1, "Maxo", 6);
		Animal a6 = new Animal(3, "Don", 3);
		
		List<Animal> dogs = new ArrayList<>();
		
		dogs.add(a1);
		dogs.add(a2);
		dogs.add(a3);
		dogs.add(a4);
		dogs.add(a5);
		dogs.add(a6);

		System.out.println(dogs);
		
	
		
		Collections.sort(dogs);
		System.out.println(dogs);

		
	}

}
