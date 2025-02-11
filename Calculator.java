import java.util.Scanner;

public class Calculator{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your first whole number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter your second whole number: ");
        int num2 = scan.nextInt();

        System.out.println("Would you like to add, subtract, multiply or divide? Enter in add, subtract, multiply, divide.");
        String answer = scan.next();

        if(answer.equals("add")){
            int sum = num1 + num2;
            System.out.println("The sum of: " + num1 + " + " + num2 + " = " + sum);
        } else if(answer.equals("subtract")){
            int diff = num1 - num2;
            System.out.println("The difference of: " + num1 + " - " + num2 + " = " + diff);
        } else if(answer.equals("multiply")){
            int product = num1 * num2;
            System.out.println("The product of: " + num1 + " * " + num2 + " = " + product);
        }else if(answer.equals("divide")){
            int quotient = num1/num2;
            System.out.println("The quotient for: " + num1 + "/" + num2 + " = " + quotient);
        }else{
            System.out.println("Please enter a valid response.");
        }

        scan.close();
    }

        
        
       
}
    
