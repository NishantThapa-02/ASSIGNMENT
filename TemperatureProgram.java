import java.util.Scanner;

public class TemperatureProgram {
  public static void main(String[] agrs) {
    Scanner scanner = new Scanner(System.in);
    double degrees;

    System.out.print("Enter the degrees Fahrenheit: ");
    degrees = scanner.nextDouble();
    if (degrees <= 32) {
      System.out.println("Freezing");
    } else if (degrees <= 50) {
      System.out.println("Cold");
    } else if (degrees <= 85){
      System.out.println("Warm");
    } else{
      System.out.println("Hot");
    }
    scanner.close();
  }
}
