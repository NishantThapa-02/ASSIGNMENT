import java.util.Scanner;
import java.lang.Math;

/**
 * AreaProgram is an application that can calculate the area.
 */
public class AreaProgram {
  /**
  * It executes the area application
  * 
  * @param args
  */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
	int option;
	double side, radius, base, height;
    do {
	  System.out.print("=== AREA CALCULATOR ===\n1. Square\n2. Circle\n3. Triangle\n4. Exit\n");
	  System.out.print("Enter the desired option[1-4]: ");
	  option = keyboard.nextInt();
	  if (option == 1) {
        System.out.print("Enter the length of the square: ");
		side = keyboard.nextDouble();
		// print out the area of the square
		System.out.println("The area of the square is: " + (side * side));
	  } else if (option == 2) {
        System.out.print("Enter the radius of the circle: ");
		radius = keyboard.nextInt();
		// print out the area of the circle
		System.out.println("The area of the circle is: " + (Math.PI * radius * radius));
	  } else if (option == 3) {
        System.out.print("Enter the base of the triangle: ");
		base = keyboard.nextDouble();
		System.out.print("Enter the height of the triangle: ");
		height = keyboard.nextDouble();
		double area = (0.5) * base * height;
		// print out the area of the triangle
		System.out.println("The area of the triangle is: " + area);
	  }else if (option == 4) {
        System.out.println("Exiting the program.");
	  } else {
		System.out.println("Invalid option!! You must choose from 1-4.");
	  }
    } while (option != 4);
    keyboard.close();
  }
}
