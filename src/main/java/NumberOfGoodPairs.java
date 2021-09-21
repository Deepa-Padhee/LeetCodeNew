public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int result = 0;
        int length = nums.length;
        for (int i =0; i<length; i++){
            for (int j = i+1; j<length; j++){
                if (nums[i] == nums[j]){
                    result = result +1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int arrNew= numIdenticalPairs(arr);
        System.out.println(arrNew);
    }
}
