import java.util.Arrays;

public class SortArrayByParityII {
    public static int[] sortArrayByParityII1(int[] nums) {//wrong
        int[] res = new int[nums.length];
        Arrays.sort(res);
        for (int i = 0;i< nums.length;i++){
            if (((i%2 == 0) && (nums[i]%2 == 0)) || ((i%2 != 0) && (nums[i]%2 != 0))){
                continue;
            }
            else {
                if (i+1 < nums.length){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }

        }
        return nums;
    }

    public static int[] sortArrayByParityII(int[] nums) {//wrong
        int[] res = new int[nums.length];
        int i = 0,j = 1;
        int k =0;

        while (k< nums.length){
            if (nums[k]%2 == 0){
                res[i] = nums[k++];
                i+=2;
            }
            else {
                res[j] = nums[k++];
                j+=2;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,4,6,2,9};
        int[] res = sortArrayByParityII(nums);
        for (int i = 0;i< res.length;i++){
            System.out.print(res[i] + " ");
        }
    }

}
