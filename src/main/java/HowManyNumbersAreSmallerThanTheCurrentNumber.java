public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int arrNew[] = new int[nums.length];
        int result =0;
        for (int i = 0; i<nums.length; i++){
            for (int j = 0; j<nums.length; j++){
                if (nums[i]>nums[j]){
                    result = result +1;
                }
            }
            arrNew[i] = result;
            result = 0;
        }
        return arrNew;
    }

    public static void main(String[] args) {
        int arr[] = {7,7,7,7};
        int arrNew[] = smallerNumbersThanCurrent(arr);
        for (int i = 0; i< arrNew.length; i++){
            System.out.println(arrNew[i]);
        }
    }
}
