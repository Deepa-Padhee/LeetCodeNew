import java.util.Collection;
import java.util.HashMap;

public class SortingTheSentence {
    public static String sortSentence1(String s) {
        String result = "";
        String keep = "";
        int index = 0;
        int len = s.length();
        HashMap<Integer,String> map = new HashMap<>();
        for (int i = 0; i<len; i++){
            if (s.charAt(i) != ' '){
                if ((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57){
                    String str = String.valueOf(s.charAt(i));
                    index = Integer.parseInt(str);
                    if (i == len-1){
                        map.put(index,keep);
                        index = 0;
                        keep = "";
                    }
                }
                else {
                    keep = keep + s.charAt(i);
                }
            }
            else {
                map.put(index,keep);
                index = 0;
                keep = "";
            }
        }

        Collection<String> get = map.values();
        if (!get.isEmpty()){
            for (String val : get){
                result = result + val + " ";
            }
        }
        result = result.trim();
        return  result;
    }

    public static String sortSentence2(String s) {
        String result = "";
        String[] list = s.split(" ");
        HashMap<Integer,String> map = new HashMap<>();
        for (String value : list){
            String index = value.substring(value.length()-1);
            int ind = Integer.parseInt(index);
            String word = value.substring(0,value.length()-1);
            map.put(ind,word);
        }
        Collection<String> get = map.values();
        if (!get.isEmpty()){
            for (String val : get){
                result = result + val + " ";
            }
        }
        result = result.trim();
        return result;
    }

    public static String sortSentence3(String s) {
        String result = "";
        String[] list = s.split(" ");
        String[] newList = new String[200];
        for (String value : list){
            String index = value.substring(value.length()-1);
            int ind = Integer.parseInt(index);
            newList[ind] = value.substring(0,value.length()-1);
        }
        for (String val : newList){
            if (val != null){
                result = result + val + " ";
            }
        }
        result = result.trim();
        return result;
    }

    public static String sortSentence(String s) {
        String result = "";
        String[] list = s.split(" ");
        String[] newList = new String[200];
        for (String value : list){
            String index = value.substring(value.length()-1);
            int ind = Integer.parseInt(index);
            newList[ind] = value.substring(0,value.length()-1);
        }
        StringBuilder ans = new StringBuilder();
        for (String val : newList){
            if (val != null){
                ans.append(val).append(" ");
            }
        }
        result = ans.toString().trim();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
}
