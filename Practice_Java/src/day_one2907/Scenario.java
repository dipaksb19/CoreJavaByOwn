package day_one2907;

public class Scenario {

	public static void main(String[] args) {
		A a =new B();
		 System.out.println(a.a);// a of A
		 System.out.println(a.b);// b of A
		 //System.out.println(a.c); //Error c of A does not exist in A 
		 a.m1();// m1 of A
		 a.m2();// m2 of B
		 //a.m3(); //Error m3 of A does not exist in A


	}

}
