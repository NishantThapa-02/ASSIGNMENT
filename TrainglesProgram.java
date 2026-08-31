import java.util.Scanner;

public class TrianglesProgram {
  public static void main(String[] args){
    final int GAP_SIZE = 2;
    Scanner keyboard = new Scanner(System.in);
    int size;

    System.out.println("Enter the size of the triangle [3-5]: ");
    size = keyboard.nextInt();
    for(int row = 0; row < size; row++){
      for(int column = 0; column < size - row - 1; column++){
        System.out.print(" ");
      }
      for(int column = 0; column < row + 1; column++){
        System.out.print("*"); 
      }
      for(int column = 0; column < GAP_SIZE; column++){
        System.out.print(" ");
      }
      for(int column = 0; column < row + 1; column++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int column = 0; column < GAP_SIZE / 2; column++){
        System.out.println();
      }
    for(int row = 0; row < size; row++){
      for(int column = 0; column < row; column++){
        System.out.print(" ");
      }
      for(int column = size; column > row; column--){
        System.out.print("*"); 
      }
      for(int column = 0; column < GAP_SIZE; column++){
        System.out.print(" ");
      }
      for(int column = size; column < row; column--){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
