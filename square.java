import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        int squareSize;
        Scanner scanner = new Scanner(System.in);
        squareSize = scanner.nextInt();
        for (int row = 1; row <= squareSize; row++) {
            for (int col = 1; col <= squareSize; col++) {
                System.out.print(" # ");
            }
            System.out.println();
        }
    }
}
