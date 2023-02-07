import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value in Fahrenheit ");
        double F = input.nextDouble();

        

        
        double C = ((F-32)*5)/9;
        System.out.println("the value in Celsius" + C);

        
       
        

    }
}
