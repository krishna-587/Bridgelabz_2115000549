import java.util.Scanner;

public class searchForSpecificWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        sc.nextLine(); 
        
        String[] sentences = new String[size];
        System.out.println("Enter some sentences: ");
        for (int i = 0; i < size; i++) {
            sentences[i] = sc.nextLine();
        }

        System.out.print("Enter word to search: ");
        String word = sc.next();
        System.out.println(searchWord(sentences, word, size));
    }

    public static String searchWord(String sentences[], String word, int size) {
        for(String sentence : sentences){
            if(sentence.contains(word)){
                return sentence;
            }
        }

        return "Not Found";
    }
}
