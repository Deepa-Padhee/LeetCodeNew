public class DIStringMatch {
    public static int[] diStringMatch(String s) {
        int len = s.length();
        int res[] = new int[len+1];
        int low =0,high =len;
        for (int i = 0;i<len;i++){
            if (s.charAt(i) == 'I'){
                res[i] = low++;
            }
            else {
                res[i] = high--;
            }
        }
        res[len] = low;
        return res;
    }

    public static void main(String[] args) {
        int[] res = diStringMatch("DDI");
        for (int i =0;i< res.length;i++){
            System.out.print(res[i] + " ");
        }
    }

}
