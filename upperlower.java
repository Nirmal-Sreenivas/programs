import java.util.Scanner;

public class upperlower {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an alphabet: ");
    char alphabet = scan.next().charAt(0);
    
    if (Character.isUpperCase(alphabet)) {
      System.out.println("it is an uppercase alphabet");
    } else if (Character.isLowerCase(alphabet)) {
      System.out.println("it is a lowercase alphabet");
    } else {
      System.out.println("it is not an alphabet");
    }
  }
}