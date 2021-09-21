import java.util.ArrayList;
import java.util.List;

public class MaximumNumberofWordsYouCanType {
    public static int canBeTypedWords1(String text, String brokenLetters) {

        String[] words = text.split(" ");
        int res = words.length;
        for (String word : words){
            for (int i = 0;i<brokenLetters.length();i++){
                String charNew = String.valueOf(brokenLetters.charAt(i));
                if (word.contains(charNew)){
                    res--;
                    break;
                }
            }
        }
        return res;
    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int res = words.length;
        List<Character> broke = new ArrayList<>();

        for (int i = 0;i<brokenLetters.length();i++){
            broke.add(brokenLetters.charAt(i));
        }

        for (String word : words){
            for (Character c : broke) {
                if (word.contains(c.toString())) {
                    res--;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.print(canBeTypedWords("leet code","lt"));
    }

}
