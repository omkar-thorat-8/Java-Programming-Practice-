package rectangle;

import java.util.Scanner;

public class Main {
	
	public static  void main(String args[])
	{
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Enter the width : ");
		int w = ref.nextInt();
		System.out.println("Enter the height : ");
		int h = ref.nextInt();
		
		Rectangle r = new Rectangle(w,h);
		
		int areaResult = r.area();
		int perimeterResult = r.perimeter();

		System.out.println("Area of Rectangle :" + areaResult);
		System.out.println("Perimete of Rectangle : " + perimeterResult);
	}
	
}
