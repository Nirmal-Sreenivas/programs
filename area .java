import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Length of a Rectangle: ");
        int L = input.nextInt();

        System.out.print("Enter the Breadth of a Rectangle: ");
        int B = input.nextInt();



        int area = L*B;
        System.out.println("The perimeter is: " + area);

     
    }
}
