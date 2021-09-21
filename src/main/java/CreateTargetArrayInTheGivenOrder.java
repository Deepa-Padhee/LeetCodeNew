import java.util.ArrayList;

public class CreateTargetArrayInTheGivenOrder {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i =0;i<nums.length;i++){
            arr.add(index[i],nums[i]);
        }
        Object[] objectArray = arr.toArray();
        int[] numsNew = new int[objectArray.length];
        for (int i = 0; i < objectArray.length; i++){
            numsNew[i] = (Integer)objectArray[i];
        }
        return numsNew;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int[] index = {0};
        int[] result = createTargetArray(nums,index);
        for (int i = 0; i< result.length; i++){
            System.out.println(result[i]);
        }
     }
}
