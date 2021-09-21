import java.util.HashMap;

public class CountTheNumberOfConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        HashMap<Integer,Character> map = new HashMap<>();
        for (int i = 0; i<allowed.length(); i++){
            map.put(i,allowed.charAt(i));
        }
        for (String word : words){
            int count =0;
            for (int i = 0;i<word.length();i++){
                if (map.containsValue(word.charAt(i))){
                    count = count+1;
                }
                if (count== word.length()){
                    result = result+1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        int result = countConsistentStrings("cad", words);
        System.out.println(result);
    }
}
