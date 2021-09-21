public class FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int result = 0;
        for (int i =0; i< gain.length; i++){
            if (i != 0 ){
                gain[i] = gain[i-1]+gain[i];
            }
            if (gain[i] > result){
                result= gain[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
}
