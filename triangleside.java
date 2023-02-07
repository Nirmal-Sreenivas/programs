import java.util.Scanner;

public class triangleside {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of side A : ");
        int A = input.nextInt();

		System.out.print("Enter the value of side B : ");
        int B = input.nextInt();

		System.out.print("Enter the value of side c : ");
        int C = input.nextInt();

        

        
        if((A+B>C)&&(A+C>B)&&(B+C>A)){
        System.out.println("the Triangle is valid.");
		}else {
		System.out.println("the Triangle is not valid.");
		}
		

        

    }
}
