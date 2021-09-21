import java.util.Arrays;

public class MaximumProductOfTwoElementsInAnArray {
    public static int maxProduct1(int[] nums) {
        int res = 0;
        for (int i = 0;i< nums.length;i++){
            nums[i] = nums[i]-1;
        }
        Arrays.sort(nums);
        res = nums[nums.length-1] * nums[nums.length-2];
        return res;
    }

    public static int maxProduct2(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        res = (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
        return res;
    }

    public static int maxProduct(int[] nums) {
        int max = 0;
        int secondMax = 0;

        for (int num : nums){
            if (num>max){
                secondMax = max;
                max = num;
            }
            else if (secondMax<num){
                secondMax = num;
            }
        }

        return (max - 1) * (secondMax - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1,5,4,5};
        System.out.println(maxProduct(nums));
    }

}
