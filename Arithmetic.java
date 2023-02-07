import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();



        int addition = num1 + num2;
        System.out.println("The sum is: " + addition);

        
        int subtraction = num1 - num2;
        System.out.println("The sub is: " + subtraction);

        
        int multiplication = num1 * num2;
        System.out.println("The multiplication is: " + multiplication);

        
        int division = num1 / num2;
        System.out.println("The division is: " + division);

        
        int modulus = num1 % num2;
        System.out.println("The modulus is: " + modulus);
    }
}
