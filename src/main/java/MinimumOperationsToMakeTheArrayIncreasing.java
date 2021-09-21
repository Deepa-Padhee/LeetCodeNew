public class MinimumOperationsToMakeTheArrayIncreasing {
    public static int minOperations1(int[] nums) {
        int res = 0;
        if (nums.length>=1 && nums.length<=5000){
            for (int i = 0;i< nums.length;i++){
                if (i+1< nums.length){
                    if (nums[i]<nums[i+1]){
                        continue;
                    }
                    else {
                        res = res +((nums[i]-nums[i+1])+1);
                        nums[i+1] = nums[i+1] + ((nums[i]-nums[i+1])+1);
                    }
                }
            }
        }
        return res;
    }

    public static int minOperations(int[] nums) {
        int res = 0;
        int num = nums[0];
        if (nums.length>=1 && nums.length<=5000){
            for (int i = 1;i< nums.length;i++){
                    if (num<nums[i]){
                        num = nums[i];
                        continue;
                    }
                    else {
                        res = res +((num-nums[i])+1);
                        nums[i] = nums[i] + ((num-nums[i])+1);
                    }
                num = nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(minOperations(nums));
    }
}
