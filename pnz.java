import java.util.Scanner;

public class pnz {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scan.nextInt();
    
    if (number > 0) {
      System.out.println("Positive");
    } else if (number < 0) {
      System.out.println("Negative");
    } else {
      System.out.println("Zero");
    }
  }
}