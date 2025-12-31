import java.util.Scanner;

public class JavaBasics22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt(); // Read the first number
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt(); // Read the second number
        
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0); // Read the operator
        
        switch(operator) {
            case '+': 
                System.out.println("Result: " + (a + b));
                break;
            case '-': 
                System.out.println("Result: " + (a - b));
                break;
            case '*': 
                System.out.println("Result: " + (a * b));
                break;
            case '/': 
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            case '%': 
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default: 
                System.out.println("Wrong operator");
        }
        
        sc.close(); // Close the scanner
    }
}