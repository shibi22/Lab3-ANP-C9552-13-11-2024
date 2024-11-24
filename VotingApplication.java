import java.util.Scanner;

// Custom exception class for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking age input from the user
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Check if age is less than 18
            if (age < 18) {
                // Explicitly throw an exception if age is less than 18
                throw new InvalidAgeException("You must be at least 18 years old to vote.");
            }

            // If age is valid
            System.out.println("You are eligible to vote!");

        } catch (InvalidAgeException e) {
            // Handling the custom exception
            System.out.println("Exception: " + e.getMessage());
        } 
    }
}
