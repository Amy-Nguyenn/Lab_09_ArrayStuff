import java.util.Scanner;

public class SafeInput {
    private static final Scanner scanner = new Scanner(System.in);

    // Method to get an integer within a specified range
    public static int getRangedInt(String prompt, int min, int max) {
        int userInput = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt + " (" + min + " - " + max + "): ");
            if (scanner.hasNextInt()) {
                userInput = scanner.nextInt();
                if (userInput >= min && userInput <= max) {
                    validInput = true;
                } else {
                    System.out.println("Error: Please enter an integer between " + min + " and " + max + ".");
                }
            } else {
                System.out.println("Error: That's not an integer. Please try again.");
                scanner.next(); // Clear the invalid input
            }
        }
        return userInput;
    }

    // Other methods can be added as needed...
}
