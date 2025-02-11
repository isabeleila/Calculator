import java.util.Scanner;

public class Calculator{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your first number: ");
        float num1 = scan.nextFloat();

        System.out.println("Enter your second number: ");
        float num2 = scan.nextFloat();

        System.out.println("Would you like to add, subtract, multiply or divide? Enter in add, subtract, multiply, divide.");
        String answer = scan.next();

        if(answer.equals("add")){
            float sum = num1 + num2;
            System.out.println("The sum of: " + num1 + " + " + num2 + " = " + sum);
        } else if(answer.equals("subtract")){
            float diff = num1 - num2;
            System.out.println("The difference of: " + num1 + " - " + num2 + " = " + diff);
        } else if(answer.equals("multiply")){
            float product = num1 * num2;
            System.out.println("The product of: " + num1 + " * " + num2 + " = " + product);
        }else if(answer.equals("divide")){
            float quotient = num1/num2;
            System.out.println("The quotient for: " + num1 + "/" + num2 + " = " + quotient);
        }else{
            System.out.println("Please enter a valid response.");
        }

        scan.close();
    }

        
        
       
}
    
