import java.util.Scanner;

public class CalculatorSwitch {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int c;

        // Keep the program running until the user chooses to exit
        do {
            // Display menu
            System.out.println("Main Menu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter your Choice: ");
            c = sc.nextInt();

            // Check for invalid choice
            if (c < 1 || c > 6) {
                System.out.println("Invalid choice! Please enter again :)");
                continue;  // Skip the rest of the loop and prompt again
            }

            // If the user chooses to exit, break the loop
            if (c == 6) {
                System.out.println("Exiting the program...");
                break;  // Exit the program
            }

            // If user selected an operation (not exit), ask for numbers
            System.out.print("Enter a: ");
            int a = sc.nextInt();
            System.out.print("Enter b: ");
            int b = sc.nextInt();

            // Perform the selected operation
            switch (c) {
                case 1:
                    System.out.println("Result: " + (a + b));
                    break;
                case 2:
                    System.out.println("Result: " + (a - b));
                    break;
                case 3:
                    System.out.println("Result: " + (a * b));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println("Result: " + (a / b));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    System.out.println("Result: " + (a % b));
                    break;
            }

        } while (true);  // Keep looping until user chooses to exit
    }
}
