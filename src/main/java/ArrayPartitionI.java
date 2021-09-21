import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayPartitionI {
    public static int arrayPairSum1(int[] nums) { //wrong understanding
        int res = 0;
        int check =0;
        int minAdd = 0;
        Arrays.sort(nums);
        List<Integer> maxArray = new ArrayList<>();
        for (int i = 0;i< nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if (nums[i] < nums[j]){
                    minAdd = minAdd + nums[i];
                    check++;
                }
                else {
                    minAdd = minAdd + nums[j];
                    check++;
                }
                if (check%(nums.length/2) == 0){
                    maxArray.add(minAdd);
                    check = 0;
                    minAdd = 0;
                }
            }
        }
        res = Collections.max(maxArray);
        return res;
    }

    public static int arrayPairSum(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for (int i =0; i<nums.length; i+=2){
            res = res+nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));
    }

}
