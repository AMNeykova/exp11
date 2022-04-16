import java.util.Scanner;

public class inputNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positive =0;
        int negative =0;
        int zero =0;
        String end = "Yes";
        do {
            System.out.println("Input a number: ");
            int num = scanner.nextInt();
            if (num >0) {
                positive++;
            } else if (num<0) {
                negative++;
            } else{
                zero++;
            }
            System.out.println("Do you wont input new number");
            end = scanner.next();
        }while (!end.equalsIgnoreCase("No"));
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }
}
