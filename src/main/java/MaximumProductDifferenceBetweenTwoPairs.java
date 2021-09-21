import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {

    public static int maxProductDifference(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        res = (nums[nums.length-1]*nums[nums.length-2]) - (nums[0]*nums[1]);
        return res;
    }

    public int maxProductDifference1(int[] nums) {
        // two greatest elements, initialized appropriately
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;

        // two least elements, initialized appropriately
        int c = Integer.MAX_VALUE;
        int d = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; ++i) {
            int curNum = nums[i];
            if (curNum > a) {
                b = a;
                a = curNum;
            } else if (curNum > b) {
                b = curNum;
            }

            if (curNum < d) {
                c = d;
                d = curNum;
            } else if (curNum < c) {
                c = curNum;
            }
        }

        return a * b - c * d;
    }


    public static void main(String[] args) {
        int[] nums = {4,2,5,9,7,4,8};
        System.out.println(maxProductDifference(nums));
    }


}
