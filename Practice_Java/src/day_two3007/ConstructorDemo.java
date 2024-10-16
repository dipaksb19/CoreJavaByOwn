package day_two3007;

public class ConstructorDemo {

	int a ;
	ConstructorDemo(int x){
		a = x;
		System.out.println("Value" + a);
	}
	
	void show() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		//new ConstructorDemo(10);  // without object
		ConstructorDemo obj = new ConstructorDemo(10);
		}

}
