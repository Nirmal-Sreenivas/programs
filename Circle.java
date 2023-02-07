import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Radius: ");
        double radius = input.nextDouble();

        

        
        double diameter = 2*radius;
        System.out.println("Diameter: " + diameter);

        
        double circumference = 2*Math.PI*radius;
        System.out.println("Circumference: " + circumference);
        

        double area = Math.PI*radius*radius;
        System.out.println("Area: " + area);
    }
}
