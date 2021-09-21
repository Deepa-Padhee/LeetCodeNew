public class HammingDistance {
    public static int hammingDistance1(int x, int y) {//Failed during submission
        int res =0;
        String xBit = String.format("%04d", Integer.parseInt(Integer.toBinaryString(x)));
        String yBit = String.format("%04d", Integer.parseInt(Integer.toBinaryString(y)));
        int posX = xBit.indexOf('1');
        int posY = yBit.indexOf('1');
        res = Math.abs(posX-posY);
        return res;
    }

    public static int hammingDistance(int x, int y) {
        int res =0;
        int n = x^y;
        String bitChange = Integer.toBinaryString(n);
        for (int i=0;i<bitChange.length();i++){
            if (bitChange.charAt(i) == '1'){
                res++;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(hammingDistance(93,73));
        //System.out.println(hammingDistance(3,1));
    }

}
