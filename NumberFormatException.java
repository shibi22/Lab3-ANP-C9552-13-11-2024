import java.util.Scanner;

public class NumberFormatException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter a number
            System.out.print("Please enter a number: ");
            String userInput = scanner.nextLine(); // Read user input as string

            // Try to parse the string input to an integer
            int number = Integer.parseInt(userInput); // This may throw NumberFormatException

            // If parsing is successful, print the number
            System.out.println("The number you entered is: " + number);

        } catch (Exception e) {
            // This block will catch the exception if user enters non-numeric data
            System.out.println("Error: Invalid input! Please enter a valid number.");
        } finally {
            // Always close the scanner to prevent resource leakage
            scanner.close();
        }
    }
}
