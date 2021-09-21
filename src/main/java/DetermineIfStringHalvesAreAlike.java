import java.util.HashMap;

public class DetermineIfStringHalvesAreAlike {
    public static boolean halvesAreAlike(String s) {
        int len = s.length();
        String h1 = s.substring(0,(len/2));
        String h2 = s.substring((len/2));
        int vow1 = calcVowels(h1);
        int vow2 = calcVowels(h2);
        return vow1==vow2;
    }

    public static int calcVowels(String word){
        int counter = 0;
        for (int i = 0;i<word.length();i++){
            if (word.charAt(i) =='a' || word.charAt(i) =='e' || word.charAt(i)  =='i' || word.charAt(i)  =='o' || word.charAt(i)  =='u' ||
                    word.charAt(i)  =='A' || word.charAt(i)  =='E' || word.charAt(i)  =='I' || word.charAt(i)  =='O' || word.charAt(i)  =='U'){
                counter++;
            }
        }
        return counter;
    }

    public static boolean halvesAreAlike1(String s) {
        int len = s.length();
        String h1 = s.substring(0,(len/2));
        String h2 = s.substring((len/2),len);
        int vow1 = 0;
        int vow2 = 0;
        HashMap<String,String> vowels = new HashMap<>();
        vowels.put("sm1","a");vowels.put("sm2","e");
        vowels.put("sm3","i");vowels.put("sm4","o");
        vowels.put("sm5","u");vowels.put("bg1","A");
        vowels.put("bg2","E");vowels.put("bg3","I");
        vowels.put("bg4","O");vowels.put("bg5","U");
        for (int i = 0;i<h1.length();i++){
            if (vowels.containsValue(String.valueOf(h1.charAt(i)))){
                vow1++;
            }
        }
        for (int i = 0;i<h2.length();i++){
            if (vowels.containsValue(String.valueOf(h2.charAt(i)))){
                vow2++;
            }
        }
        return vow1==vow2;
    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("AbCdEfGh"));
    }
}
