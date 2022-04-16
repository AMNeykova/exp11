import java.util.Scanner;

public class vowels {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input sentence: ");
        String sentence= scanner.nextLine();
        sentence = sentence.toLowerCase();
        int vowelsCont=0;
            for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i'
                    || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
                vowelsCont++;
                System.out.println("Number of vowels: " + vowelsCont);
            }
        }
    }
}
