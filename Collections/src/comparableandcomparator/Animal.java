package comparableandcomparator;

public class Animal implements Comparable<Animal>{

	int age;
	String name;
	int weight;
	public Animal(int age, String name, int weight) {
		
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + ", weight=" + weight + "]\n";
	}
	@Override
	//compare to allready implemented method
	public int compareTo(Animal that) { // if returns +Integer the current object is greter
		                                // if returns -Integer the current object is lesser
		                                // if returns same both same
		if(this.age == that.age) {
			return this.name.compareTo(that.name);
		}
		return this.age - that.age;
	}
	
	
	
	
	
}
