package lab;
import java.util.Scanner;
public class Lab {

	public static double calculateCircle(double radius) {
		return Math.PI * radius * radius;
	}
	
	public static double calculateBase(double width, double length) {
		return width * length;
	}
	public static double calculatePyramid(double height, double width, double length) {
		return (calculateBase(width, length)* height)/ 3;
	}
	
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Type 'c\' to calculate area of a circle");
		System.out.println("Type 'p\' to calculate volume of a pyramid");
		
		char choice = scnr.next().charAt(0);
		
		if (choice == 'c') {
			double userRadius;
			System.out.println("Enter a value for the circles radius");
			
			userRadius = scnr.nextDouble();
			
			System.out.print("The Area of a circle with a radius of " + userRadius + ": ");
			System.out.println(calculateCircle(userRadius));
		}
		if (choice == 'p') {
			System.out.println("Enter values for length width and height of the pyramid");
			double userLength = scnr.nextDouble();
			double userWidth = scnr.nextDouble();
			double userHeight = scnr.nextDouble();
			
			System.out.print("The volume of a pyramid with a base of " + calculateBase(userWidth, userLength) + " and a height of " + userHeight + ": ");
			System.out.println(calculatePyramid(userHeight, userWidth, userLength));
		}
	}

}
