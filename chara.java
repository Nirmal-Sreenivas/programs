import java.util.Scanner;

public class chara {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a character: ");
    char character = scan.next().charAt(0);
    
    if (Character.isLetter(character)) {
      System.out.println("it is an alphabet");
    } else if (Character.isDigit(character)) {
      System.out.println("it is a digit");
    } else {
      System.out.println("it is a special character");
    }
  }
}