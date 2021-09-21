import java.util.HashMap;

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        String result = "";
        HashMap<Integer,Character> map = new HashMap<>();
        for (int i = 0; i<indices.length; i++){
            map.put(indices[i],s.charAt(i));
        }
        for (int i = 0; i<map.size(); i++){
            String value = String.valueOf(map.get(i));
            result = result + value;
        }
        return result;
    }


    public static void main(String[] args) {
        String s= "art";
        int[] arr = {1,0,2};
        String result = restoreString(s, arr);
        System.out.println(result);
    }
}
