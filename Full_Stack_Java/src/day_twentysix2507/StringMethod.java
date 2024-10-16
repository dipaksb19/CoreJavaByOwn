package day_twentysix2507;

public class StringMethod {

	public static void main(String[] args) {
		String s = "hello";
		String s1 = "HI";
		
		System.out.println(s.charAt(0));
		System.out.println(s.concat("123"));
		System.out.println(s.length());
		System.out.println(s.substring(2));
		System.out.println(s.substring(0,2));
		System.out.println(s.trim());
		System.out.println(s.indexOf('o'));
		System.out.println(s1.isEmpty());
		System.out.println(s.lastIndexOf('l'));
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());

	}

}
