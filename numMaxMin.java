import java.util.Scanner;

public class numMaxMin {
    public static void main(String[] args) {
        System.out.print("Enter numbers: ");
        Scanner input = new Scanner(System.in);

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        while (true) {
            if ( !input.hasNextDouble())
                break;

            Double num = input.nextDouble();

            min = Math.min(min, num);
            max = Math.max(max, num);

        }
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
    }
}

