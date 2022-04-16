import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=0;
        int reverse=0;
        System.out.println("Input your number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        while(number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }   System.out.println("The reverse number: " + reverse);
    }
}

