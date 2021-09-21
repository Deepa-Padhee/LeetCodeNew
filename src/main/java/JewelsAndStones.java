public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int result =0;
        int jLength = jewels.length();
        int sLength = stones.length();
        for (int i = 0; i<sLength; i++){
            for (int j = 0; j<jLength; j++){
                if (stones.charAt(i) == jewels.charAt(j)){
                    result = result +1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String jewels = "z";
        String stones = "zz";
        System.out.println(numJewelsInStones(jewels,stones));
    }
}
