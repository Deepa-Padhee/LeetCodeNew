import java.util.*;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public static boolean areOccurrencesEqual1(String s) {
        boolean res = true;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                map.replace(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else {
                map.put(s.charAt(i),1);
            }
        }

        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        List<Object> sb = new ArrayList<>();
        while (iterator.hasNext()){
            Map.Entry entry = iterator.next();
            if (!sb.contains(entry.getValue())){
                sb.add(entry.getValue());
            }
            if (sb.size()>1){
                return false;
            }
        }

        return res;
    }

    public static boolean areOccurrencesEqual(String s) {
        int i;
        int[] count = new int[26];
        for (i = 0;i<s.length();i++){
           count[s.charAt(i)-'a']++;
        }


        int freq = count[s.charAt(0)-'a'];
        for (i = 0;i< 26;i++){
            if (count[i]!=0 && count[i]!=freq){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.print(areOccurrencesEqual("vvvvvvvvvvvvvvvvvvv"));
    }

}
