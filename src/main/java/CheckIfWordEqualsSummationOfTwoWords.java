import java.util.HashMap;

public class CheckIfWordEqualsSummationOfTwoWords {
    public static boolean isSumEqual1(String firstWord, String secondWord, String targetWord) {
        boolean res = false;

        int target = createWord(targetWord.length(),targetWord);
        int first = createWord(firstWord.length(),firstWord);
        int second = createWord(secondWord.length(),secondWord);

        if (target == (first + second)){
            res = true;
        }

        return res;
    }

    public static int createWord(int lenOfWord,String word){
        int res = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',0);
        map.put('b',1);
        map.put('c',2);
        map.put('d',3);
        map.put('e',4);
        map.put('f',5);
        map.put('g',6);
        map.put('h',7);
        map.put('i',8);
        map.put('j',9);
        String wordConv = "";

        for (int i = 0; i< lenOfWord; i++){
            if (map.containsKey(word.charAt(i))){
                wordConv = wordConv + map.get(word.charAt(i));
            }
        }
        res = Integer.valueOf(wordConv);
        return res;
    }

    public static boolean isSumEqual2(String firstWord, String secondWord, String targetWord) {
        boolean res = false;
        int target = 0;
        int first = 0;
        int second = 0;
        String wordConv = "";
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',0);
        map.put('b',1);
        map.put('c',2);
        map.put('d',3);
        map.put('e',4);
        map.put('f',5);
        map.put('g',6);
        map.put('h',7);
        map.put('i',8);
        map.put('j',9);

        int lenOfWord = targetWord.length();
        for (int i = 0; i< lenOfWord; i++){
            if (map.containsKey(targetWord.charAt(i))){
                wordConv = wordConv + map.get(targetWord.charAt(i));
            }
        }
        target = Integer.valueOf(wordConv);
        wordConv = "";

        lenOfWord = firstWord.length();
        for (int i = 0; i< lenOfWord; i++){
            if (map.containsKey(firstWord.charAt(i))){
                wordConv = wordConv + map.get(firstWord.charAt(i));
            }
        }
        first = Integer.valueOf(wordConv);
        wordConv = "";

        lenOfWord = secondWord.length();
        for (int i = 0; i< lenOfWord; i++){
            if (map.containsKey(secondWord.charAt(i))){
                wordConv = wordConv + map.get(secondWord.charAt(i));
            }
        }
        second = Integer.valueOf(wordConv);

        if (target == (first + second)){
            res = true;
        }

        return res;
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        boolean res = false;

        int target = createWordNew(targetWord.length(),targetWord);
        int first = createWordNew(firstWord.length(),firstWord);
        int second = createWordNew(secondWord.length(),secondWord);

        if (target == (first + second)){
            res = true;
        }

        return res;
    }

    public static int createWordNew(int lenOfWord,String word){
        int res = 0;

        for (int i = 0; i< lenOfWord; i++){
                res = (res * 10 + (word.charAt(i)%97));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isSumEqual("aaa","a","aaaa"));
    }
}
