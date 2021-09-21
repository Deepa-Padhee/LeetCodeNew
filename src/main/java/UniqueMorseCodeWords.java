import java.util.HashSet;

public class UniqueMorseCodeWords {
    public static int uniqueMorseRepresentations(String[] words) {
        int result =0;
        HashSet<String> changedWords = new HashSet<>();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String word:words){
            StringBuilder sb = new StringBuilder();
            for (int i = 0;i<word.length();i++){
                sb.append(morse[word.charAt(i) - 'a']);
            }
            changedWords.add(sb.toString());
        }
        result = changedWords.size();
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}
