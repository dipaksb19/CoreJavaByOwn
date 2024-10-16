package Full_Stack_Java;
//Practical session - 1,2
public class Area {

	public static void main(String[] args) {
		
		//Area of circle
		float r = 10.5f;
		float pie = 3.14f;
		float area, perimeter;
		area = pie*r*r;
		System.out.println("Area of circle is : " + area);
		double exactarea = Math.PI*Math.pow(r, 2);
		System.out.println("Value of Pie : " + Math.PI);
		System.out.println("(Real) Area of circle is : " + exactarea);
		System.out.println("Square of Radius : " + Math.pow(r, 2));
		System.out.println("Cube of radius is : " + Math.pow(r, 3));
		
		perimeter = 2*pie*r;
		System.out.println("Perimeter of circle is : " + perimeter);
		
		//Home work
		int n = 5;
		int square, cube;
		System.out.println("squre of n is :  " + (n*n));
		System.out.println("Cube of n is : " + (n*n*n));
		
		
		
		/*Home assignment  - write java program to display area of
		   triangle, square and rectanle */
		
		System.out.println("----------------------------------\n");
		//Area of triangle
		float h = 10.2f;
		float b = 3.0f;
		float areaoftri = (0.5f)*b*h;
		System.out.println("(Float)Area of Triangle is : " + areaoftri);
		
		double h1 = 10.2;
		double b1 = 3.0;
		double areaoftri1 = (0.5)*b*h;
		System.out.println("(Double) Area of Triangle is : " + areaoftri1);
		
		//Area of Square
		int side = 8;
		int areaofsquare = side*side;
		System.out.println("Area of Square is : " + areaofsquare);
		
		//Area of Reactangle
		int width = 10;
		int height = 20;
		float areaofrectangle= width * height;
		System.out.println("Area of Rectangle is : " + areaofrectangle);
		
		
	}

}
