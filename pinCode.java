import java.util.Scanner;

public class pinCode {
    public static void main(String[] args) {
        int enterPin = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Pin Code: ");
        int PIN = 0;
        int CORRECT_PIN = 1234;

        while (PIN != CORRECT_PIN && enterPin < 3) {
            PIN = scanner.nextInt();
            enterPin++;
            if (PIN != CORRECT_PIN && enterPin < 3) {
                System.out.println("PIN is incorrect! Try again!");
            }
        }
        if (PIN == CORRECT_PIN && enterPin <= 3) {
            System.out.println("Welcome!");
        }
    }

}
