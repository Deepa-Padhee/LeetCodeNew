public class TruncateSentence {
    public static String truncateSentence1(String s, int k) {
        String result = "";
        String[] arr = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = 0;i<k;i++){
            str.append(arr[i]).append(" ");
        }
        result = str.toString();
        result = result.trim();
        return result;
    }

    public static String truncateSentence(String s, int k) {
        String result = "";
        int space = 0;
        int count = 0;
        while (space<k && count<s.length()){
            if (s.charAt(count)==' '){
                space++;
            }
            count++;
        }
        result = s.substring(0,count);
        result = result.trim();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(truncateSentence("What is the solution to this problem",4));
    }
}
