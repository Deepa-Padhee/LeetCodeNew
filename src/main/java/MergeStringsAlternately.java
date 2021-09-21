public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int first =0,sec =0;
        while (first!=word1.length() || sec!=word2.length()){
            if (first<word1.length()){
                res.append(word1.charAt(first));
                first++;
            }
            if (sec<word2.length()){
                res.append(word2.charAt(sec));
                sec++;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd","pq"));
    }
}
