import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        // Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Taking first number
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        // Taking operator
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        // Taking second number
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Performing calculation
        try {

            switch (operator) {

                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;

                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;

                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;

                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException(
                            "Cannot divide by zero!"
                        );
                    }
                    System.out.println("Result: " + (num1 / num2));
                    break;

                default:
                    System.out.println("Invalid operator!");
            }

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Invalid input! Please enter valid numbers.");

        } finally {

            sc.close();
        }
    }
}