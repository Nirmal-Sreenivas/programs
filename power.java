import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number X ");
        int X = input.nextInt();

		System.out.print("Enter number Y ");
        int Y = input.nextInt();

        

        
        int Z = X^Y;
        System.out.println("the value of X ^ Y is : " + Z);

        
       
        

    }
}
