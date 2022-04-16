import java.util.Scanner;

public class doWhileSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String repeat = "No";
        do {
            int numOne = scanner.nextInt();
            int numTwo = scanner.nextInt();
            System.out.println(numOne + numTwo);
            System.out.println("Do you wont to repeat");
            repeat = scanner.next();
        } while (repeat.equalsIgnoreCase("Yes"));

    }
}
