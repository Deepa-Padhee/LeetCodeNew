public class ShortestDistanceToACharacter {
    public static int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        int recent = s.indexOf(c);
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i) != c){
                res[i] = Math.abs(recent-i);
            }
            else {
                recent = i;
            }
        }

        for (int i = s.length()-1;i>=0;i--){
            if (s.charAt(i) != c){
                res[i] = Math.min(res[i],Math.abs(recent-i));
            }
            else {
                recent = i;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] res = shortestToChar("loveleetcode",'e');
        for (int i = 0;i< res.length;i++){
            System.out.print(res[i] + " ");
        }
    }

}
