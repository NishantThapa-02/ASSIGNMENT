import java.util.Scanner;
import java.lang.Math;

public class AreaProgram {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int option;
		int side, radii, baseY, heightY;

		do {
			System.out.print("=== AREA CALCULATOR ===\n1. Square\n2. Circle\n3. Triangle\n4. Exit\n");
			System.out.print("Enter the desired option[1-4]: ");
			option = keyboard.nextInt();

			if (option == 1) {
        			System.out.print("Enter the length of the square: ");
				side = keyboard.nextInt();
				System.out.println("The area of the square is: " + side * side);
			} else if(option == 2) {
        			System.out.print("Enter the radius of the circle: ");
				radii = keyboard.nextInt();
				System.out.println("The area of the circle is: " + Math.PI * radii * radii);
			} else if (option == 3) {
        			System.out.print("Enter the base of the triangle: ");
				baseY = keyboard.nextInt();
				System.out.print("Enter the height of the triangle: ");
				heightY = keyboard.nextInt();
				System.out.println("The area of the triangle is: " + (0.5) * baseY * heightY);
			}else if (option == 4) {
        			System.out.println("Exiting the program.");
			} else {
				System.out.println("Invalid option!! You must choose from 1-4.");
			}
		} while (option != 4);

		keyboard.close();
	}
}
