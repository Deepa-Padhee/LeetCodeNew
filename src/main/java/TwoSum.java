public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++){
            for (int j = 0; j< length; j++){
                if (i != j){
                    int sum = nums[i] +nums[j];
                    if (sum == target){
                        return new int[]{i,j};
                    }
                }
            }
        }
        return new int[]{};
    }


    public static void main(String[] args) {
        int arr[] = { 3,3};
        int arrNew[] = twoSum(arr, 6);
        for (int i = 0; i<2; i++){
            System.out.println(arrNew[i]);
        }
    }
}
