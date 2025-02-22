import java.util.Scanner;

public class CensorBadWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        String censoredText = censorBadWords(input);
        System.out.println("Censored Sentence:\n" + censoredText);
        sc.close();
    }

    public static String censorBadWords(String text) {
        String[] badWords = {"foolish", "stupid"}; 
        for (String badWord : badWords) {
            text = text.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }
        return text;
    }
}
