import java.util.Scanner;

public class angles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of angle A : ");
        int A = input.nextInt();

		System.out.print("Enter the value of angle B : ");
        int B = input.nextInt();

        

        
        int C = 180-A-B;
        System.out.println("the value of angle C is : " + C);

        
       
        

    }
}
