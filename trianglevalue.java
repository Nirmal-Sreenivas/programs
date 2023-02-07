import java.util.Scanner;

public class trianglevalue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of side A : ");
        int A = input.nextInt();

		System.out.println("Enter the value of side B : ");
        int B = input.nextInt();

		System.out.println("Enter the value of side c : ");
        int C = input.nextInt();

        

        
        if((A+B>C)&&(A+C>B)&&(B+C>A)){
			if(A==B && A==C){
				System.out.println("it is a equilateral triangle");
			}else if (A==B || B==C || A==C){
				System.out.println("it is a Isosceles triangle");
			}else{
				System.out.println("it is a Scalene Triangle");
			}
		}else {
		System.out.println("the Triangle is not valid.");
		}
		

        

    }
}
