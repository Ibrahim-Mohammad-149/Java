package JavaApps;

import java.util.Scanner;

public class AreaCalculator {
	public static void main (String[] args) {
		Scanner Sc = new Scanner (System.in);
		System.out.print("Which shape do you want to find the area of:\n1) Square\n2) Rectangle\n3) Triangle\n4) Paralellogram\n5) Trapezium\nEnter: ");
		int operation = Sc.nextInt();
		
		switch (operation) {

		case 1:
			System.out.print("\nEnter the side of your square: ");
			int num = Sc.nextInt();
			int result = num*num;
			System.out.println("Area SQUARE = S*S");
			System.out.println("The area of your square is: " + result);
			
		case 2:
			System.out.print("\nEnter the length: ");
			int length = Sc.nextInt();
			System.out.print("Enter the width: ");
			int width = Sc.nextInt();
			int result_rec = length*width;
			System.out.println("Area RECTANGLE = L*W");
			System.out.println("The area of your rectangle is: " + result_rec);
			
		case 3:
			System.out.print("\nEnter the base: ");
			int base = Sc.nextInt();
			System.out.print("Enter the height: ");
			int height = Sc.nextInt();
			int result_tri = (base*height) /2;
			System.out.println("Area TRIANGLE = (B*H) /2");
			System.out.println("The area of your triangle is: " + result_tri);
			
		case 4:
			System.out.print("\nEnter the heigth: ");
			int para_height = Sc.nextInt();
			System.out.print("Enter the base: ");
			int para_base = Sc.nextInt();
			int para_result = para_height*para_base;
			System.out.println("Area PARALELLOGRAM = H*B");
			System.out.println("The area of your paralellogram is: " + para_result);
			
		case 5:
			System.out.print("\nEnter the first base: ");
			int base1 = Sc.nextInt();
			System.out.println("Enter the second base: ");
			int base2 = Sc.nextInt();
			System.out.print("Enter the heigth: ");
			int height_trapez = Sc.nextInt();
			int result_trapez = (((base1 + base2) * height_trapez) /2 );
			System.out.println("Area TRAPEZIUM = /n1) Add the 2 bases (top and bottom bases) \nMultiply by 2\n 3) Divide by 2\n Formula = ((b1+b2) * h) /2");
			System.out.println("The area of your trapezium is: " + result_trapez);
		}
		
		Sc.close();
	}
}
