public class FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int res = 0;
        for (int num: nums){
            if ((num>9 && num <100) || (num>999 && num<10000) || (num>99999 && num<1000000)){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {100000};
        System.out.println(findNumbers(nums));
    }
}
