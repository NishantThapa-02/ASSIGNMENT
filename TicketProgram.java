import java.util.Scanner;

public class TicketProgram {
  public static void main (String[] args) {
    final int TICKET_COST = 15;
    Scanner scanner = new Scanner(System.in);
    int tickets;
    double total;

    System.out.print("Enter the number of tickets: ");
    tickets = scanner.nextInt();
    total = tickets * TICKET_COST;
    System.out.println("Total is $ " + total);
    scanner.close();
  }
}
