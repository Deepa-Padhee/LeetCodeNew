public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0;i< nums.length;i++){
            res[i] = nums[nums[i]];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        int[] res = buildArray(nums);
        for (int i =0;i< res.length;i++){
            System.out.print(res[i] + " ");
        }
    }

}
