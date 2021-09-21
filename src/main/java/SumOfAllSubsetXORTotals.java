public class SumOfAllSubsetXORTotals {
    static int sum = 0;
    public static int subsetXORSum(int[] nums) {
        sum = backTrack(nums,0,0);
        return sum;
    }

    private static int backTrack(int[] nums, int index, int current) {
        sum = sum + current;
        for (int i = index;i< nums.length;i++){
            current = current^nums[i];
            backTrack(nums,i+1,current);
            current = current ^ nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1,3};
        System.out.println(subsetXORSum(arr));
    }
}
