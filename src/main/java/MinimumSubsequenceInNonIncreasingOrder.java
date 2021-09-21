import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumSubsequenceInNonIncreasingOrder {
    public static List<Integer> minSubsequence1(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Integer[] newNums = Arrays.stream( nums ).boxed().toArray( Integer[]::new );
        Arrays.sort(newNums, Collections.reverseOrder());
        int greatest =0;
        for (int i =0;i< newNums.length;i++){
            greatest = greatest + newNums[i];
            res.add(newNums[i]);
            int small = 0;
            for (int j = i+1;j< newNums.length;j++){
                small = small + newNums[j];
            }
            if (greatest>small){
                return res;
            }
        }
        return res;
    }

    public static List<Integer> minSubsequence(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int greatest =0;
        int sum =0;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }

        for (int i =nums.length-1;i>=0;i--){
            sum = sum - nums[i];
            greatest = greatest + nums[i];
            res.add(nums[i]);

            if (greatest>sum){
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,10,9,8};
        List<Integer> res = minSubsequence(nums);
        for (int i =0;i< res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }

}
