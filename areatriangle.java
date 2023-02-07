import java.util.Scanner;

public class areatriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of a triangle  : ");
        float H = input.nextFloat();

		System.out.print("Enter the base length of a triangle  : ");
        float B = input.nextFloat();

        

        
        float area = (H*B)/2;
        System.out.println("the area of a triangle is : " + area);

        
       
        

    }
}
