import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value in Celsius ");
        double C = input.nextDouble();

        

        
        double F = (C * 1.8) + 32;
        System.out.println("the value in Fahrenheit " + F);

        
       
        

    }
}
