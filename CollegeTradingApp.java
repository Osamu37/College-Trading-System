import java.util.Scanner;

public class CollegeTradingApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to SLCE - College Trading System!");
        System.out.println("Please enter your details to register:");

        System.out.print("Full Name: ");
        String name = input.nextLine();

        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("Secret Key: ");
        String secretKey = input.nextLine();

        boolean isValid = validateUser(name, username, email, secretKey);

        if (isValid) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed. Please try again with valid inputs.");
        }

        input.close();
    }

    public static boolean validateUser(String name, String username, String email, String secretKey) {
        if (!name.matches("[a-zA-Z\\s.'-]{1,25}")) {
            System.out.println("Invalid name format.");
            return false;
        }

        if (!username.matches("^[a-zA-Z0-9._-]{4,12}$")) {
            System.out.println("Username must be 4-12 characters with no spaces.");
            return false;
        }

        if (!email.matches("^(.+)@(.+)$") || email.length() > 40) {
            System.out.println("Invalid email.");
            return false;
        }

        if (!secretKey.matches("[a-zA-Z0-9]{5,10}")) {
            System.out.println("Secret Key must be 5–10 alphanumeric characters.");
            return false;
        }

        return true;
    }
}
