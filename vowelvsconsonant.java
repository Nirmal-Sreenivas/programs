import java.util.Scanner;

public class vowelvsconsonant {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an alphabet: ");
    char alphabet = input.nextChar;
    
    if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' || 
        alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
      System.out.println(alphabet + " is a vowel");
    } else {
      System.out.println(alphabet + " is a consonant");
    }
  }
}