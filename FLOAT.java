import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int A = input.nextDouble();

        System.out.print("Enter the second number: ");
        int B = input.nextDouble();

        int sum = A + B;
        System.out.println("The result of the addition is: " + sum);
    }
}