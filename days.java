import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of days ");
        int days = input.nextInt();

        

        
        int years = days/365;
        System.out.println("the years is " + years);


		int weeks = days/7;
        System.out.println("the weeks is " + weeks);

        
       
        

    }
}
