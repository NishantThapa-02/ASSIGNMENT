import java.util.Scanner;
import java.lang.Math;

public class AreaProgram {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Scanner length = new Scanner(System.in);
		Scanner radius = new Scanner(System.in);
		Scanner base = new Scanner(System.in);
		Scanner height = new Scanner(System.in);
		int option;

		do {
			System.out
					.print("=== AREA CALCULATOR ===\n1. Square\n2. Circle\n3. Triangle\n4. Exit\n");
			System.out.print("Enter the desired option[1-4]: ");
			option = keyboard.nextInt();

			if (option == 1) {
				int side = length.nextInt();
				System.out.println("The area of the square is: " + side * side);
			} else if(option == 2) {
				int radii = radius.nextInt();
				System.out.println("The area of the circle is: " + Math.PI * radii * radii);
			} else if (option == 3) {
				int base = base.nextInt();
				int height = height.nextInt();
				System.out.println("The area of the triangle is: " + 0.5 * base * height);
			} else {
				System.out.println("Invalid option!! You must choose from 1-4.");
			}
		} while (option != 4);

		length.close();
		radius.close();
		base.close();
		height.close();
		keyboard.close();
	}
}
