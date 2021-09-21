public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] res = new int[2*n];
        for (int i =0;i< nums.length;i++){
            res[i] = nums[i];
            res[i+n] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int[] res = getConcatenation(nums);
        for (int i =0;i< res.length;i++){
            System.out.print(res[i] + " ");
        }
    }

}
