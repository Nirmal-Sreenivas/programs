import java.util.Scanner;

public class divisible {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scan.nextInt();
    
    if (number % 5 == 0 && number % 11 == 0) {
      System.out.println(" the given number is divisible by both 5 and 11");
    } else {
      System.out.println("the given number is not divisible by both 5 and 11");
    }
  }
}