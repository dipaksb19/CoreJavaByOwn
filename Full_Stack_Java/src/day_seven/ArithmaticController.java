package day_seven;

//day seven (18/06/24)---> Method calling

public class ArithmaticController {

	public static void main(String[] args) {
		Arithmatic obj = new Arithmatic();
		obj.a = 10;
		obj.b = 20;
		int result = obj.add();
		System.out.println("Result of addition is : " + result);

	}

}
