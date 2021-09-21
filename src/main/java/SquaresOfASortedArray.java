import java.util.Arrays;

public class SquaresOfASortedArray {
    public static int[] sortedSquares1(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0;i< nums.length;i++){
            arr[i] = nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }

    public static int[] sortedSquares2(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0;i< nums.length;i++){
            arr[i] = nums[i]*nums[i];
        }
        for (int i =0;i< arr.length;i++){
            for (int j = i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int len = nums.length-1;
        int i = 0;
        int j = len;
        int k = len;

        while (k>=0){
            if (Math.abs(nums[i]) > Math.abs(nums[j])){
                arr[k--] = nums[i] *nums[i];
                i++;
            }
            else {
                arr[k--] = nums[j] * nums[j];
                j--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums= {-4,-1,0,3,10};
        int[] arr = sortedSquares(nums);

        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

}
