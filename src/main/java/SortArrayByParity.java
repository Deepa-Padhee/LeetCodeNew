import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity {
    public static int[] sortArrayByParity1(int[] nums) {
        int[] res = new int[nums.length];
        List<Integer> evenArr = new ArrayList<>();
        List<Integer> oddArr = new ArrayList<>();
        for (int i =0;i< nums.length;i++){
            if (nums[i] % 2 ==0){
                evenArr.add(nums[i]);
            }
            else {
                oddArr.add(nums[i]);
            }
        }
        evenArr.addAll(oddArr);
        for (int i = 0;i<evenArr.size();i++){
            res[i] = evenArr.get(i);
        }
        return res;
    }

    public static int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for (int i =0;i< nums.length;i++){
            if (nums[i] % 2 ==0){
                res[left] = nums[i];
                left++;
            }
            else {
                res[right] = nums[i];
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {6,2,8,3,4,7,1,3,3,2};
        int[] res = sortArrayByParity(nums);
        for (int i = 0;i< res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}
