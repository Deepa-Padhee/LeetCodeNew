import java.util.ArrayList;

public class CheckIfTheSentenceIsPangram {

    public static boolean checkIfPangram(String sentence) {
        boolean result = false;
        int ascii = 0;
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i< sentence.length(); i++){
            char c = sentence.charAt(i);
            if (!list.contains(c)){
                ascii = ascii + (int) c;
                list.add(c);
            }
        }

        if (ascii == 2847){
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPangram("leetcode"));
    }
}
