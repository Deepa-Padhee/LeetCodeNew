import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NumberOfMatchingSubSequence {
    public static int numMatchingSubseq(String s, String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0;
            for (int i = 0; i < s.length(); i++){
                if (map.containsKey(s.charAt(i))){
                    int n = map.get(s.charAt(i));
                    map.replace(s.charAt(i),n,n+1);
                }
                else {
                    map.put(s.charAt(i),1);
                }
            }
            for (String word : words){
                HashMap<Character, Integer> checkMap = new HashMap<>();
                int check = 0;
                for (int i = 0; i < word.length(); i++){
                    if (checkMap.containsKey(word.charAt(i))){
                        int n = checkMap.get(word.charAt(i));
                        checkMap.replace(word.charAt(i),n,n+1);
                    }
                    else {
                        checkMap.put(word.charAt(i),1);
                    }
                }
                Iterator mapIterator = checkMap.entrySet().iterator();
                while (mapIterator.hasNext()) {
                    Map.Entry mapElement = (Map.Entry)mapIterator.next();
                    if (map.containsKey(mapElement.getKey())){
                        int oldWordValue = map.get(mapElement.getKey());
                        int newWordValue = (int) mapElement.getValue();

                        if (newWordValue == oldWordValue){
                            check = check+1;
                        }

                    }

                }
                if (check == word.length()){
                    result = result + 1;
                }
                else {
                    result =0;
                }
            }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"deepa"};
        int result = numMatchingSubseq("deepa", words);
        System.out.println(result);
    }
}
