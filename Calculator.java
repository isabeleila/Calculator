import java.util.Scanner;

public class Calculator{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your first whole number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter your second whole number: ");
        int num2 = scan.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of: " + num1 + " + " + num2 + " = " + sum);

        scan.close();
    }
}