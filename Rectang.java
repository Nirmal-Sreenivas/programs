import java.util.Scanner;

public class Rectang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Length of a Rectangle: ");
        int num1 = input.nextInt();

        System.out.print("Enter the Breadth of a Rectangle: ");
        int num2 = input.nextInt();



        int perimeter = 2*(num1 + num2);
        System.out.println("The perimeter is: " + perimeter);

     
    }
}
