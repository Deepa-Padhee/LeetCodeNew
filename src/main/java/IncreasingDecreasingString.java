import java.util.HashMap;

public class IncreasingDecreasingString {
    public static String sortString(String s) {
        StringBuilder res = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                map.replace(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else {
                map.put(s.charAt(i),1);
            }
        }

        while (!map.isEmpty()){
            for (int i = 97;i<=122;i++){
                if (map.containsKey((char)i)  && map.get((char)i) >0){
                    res.append((char)i);
                    map.replace((char) i, map.get((char)i)-1);
                }
            }
            for (int i = 122;i>=97;i--){
                if (map.containsKey((char)i) && map.get((char)i) >0){
                    res.append((char)i);
                    map.replace((char) i, map.get((char)i)-1);
                }
            }
            map.values().removeIf(f -> f == 0f);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(sortString("ggggggg"));
    }

}
