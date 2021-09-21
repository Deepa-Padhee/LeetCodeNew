public class ReverseWordsInAStringIII {
    public static String reverseWords1(String s) {
        StringBuilder res = new StringBuilder();
        String wordRev = "";
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)!=' '){
                wordRev = s.charAt(i) + wordRev;
            }
            else {
                res.append(wordRev+" ");
                wordRev = "";
            }
        }
        res.append(wordRev);
        return res.toString();
    }

    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] words = s.split("\\s");
        for (String word : words){
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            res.append(sb.toString()).append(" ");
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

}
