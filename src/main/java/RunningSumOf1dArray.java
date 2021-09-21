public class RunningSumOf1dArray {
    public static int[] runningSum(int[] nums) {
        int arr[] = nums;
        int arrNew[] = new int[nums.length];
        int addition = 0;
        int length = arr.length;
        for (int i = 0; i<length; i++){
            addition = addition + arr[i];
            arrNew[i] = addition;
        }
        return arrNew;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,2,10,1};
        int arrNew[] = runningSum(arr);
        for (int i = 0; i< arrNew.length; i++){
            System.out.println(arrNew[i]);
        }
    }
}
