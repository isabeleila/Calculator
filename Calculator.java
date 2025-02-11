import java.util.Scanner;

public class Calculator{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your first whole number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter your second whole number: ");
        int num2 = scan.nextInt();

        System.out.println("Would you like to add or subtract your numbers? Enter in add or subtract.");
        String answer = scan.next();

        if(answer.equals("add")){
            int sum = num1 + num2;
            System.out.println("The sum of: " + num1 + " + " + num2 + " = " + sum);
        } else if(answer.equals("subtract")){
            int diff = num1 - num2;
            System.out.println("The difference of: " + num1 + " - " + num2 + " = " + diff);
        } else{
            System.out.println("Please enter a valid response.");
        }

        scan.close();
    }

        
        
       
}
    
