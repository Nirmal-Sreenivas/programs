import java.util.Scanner;

public class trianglevalidity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of angle A : ");
        int A = input.nextInt();

		System.out.print("Enter the value of angle B : ");
        int B = input.nextInt();

		System.out.print("Enter the value of angle c : ");
        int C = input.nextInt();

        

        
        if(A+B+C == 180 ){
        System.out.println("the Triangle is valid.");
		}else {
		System.out.println("the Triangle is not valid.");
		}
		

        

    }
}
