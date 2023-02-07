import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length in centimeters: ");
        double cm = input.nextDouble();

        

        
        double meter = cm / 100;
        System.out.println("the length in meters: " + meter);

        
        double kilometer = cm / 100000;
        System.out.println("the length in kilometer : " + kilometer);
        

    }
}
