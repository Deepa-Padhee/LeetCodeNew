import java.util.ArrayList;
import java.util.List;

public class NRepeatedElementInSize2NArray {
    public static int repeatedNTimes(int[] nums) {
        int res = 0;
        List<Integer> numList = new ArrayList<>();
        for (int i = 0;i<nums.length;i++){
            if (numList.contains(nums[i])){
                return nums[i];
            }
            numList.add(nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(nums));
    }

}
