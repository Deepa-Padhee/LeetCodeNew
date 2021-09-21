import java.util.ArrayList;

public class DecompressRunLengthEncodedList {
    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i =0; i< nums.length; i=i+2){
            for (int j =0; j<nums[i]; j++){
                arr.add(nums[i+1]);
            }
        }
        Object[] objectArray = arr.toArray();
        int[] numsNew = new int[objectArray.length];
        for (int i = 0; i < objectArray.length; i++){
            numsNew[i] = (Integer)objectArray[i];
        }
        return numsNew;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1};
        int[] result = decompressRLElist(arr);
        for (int i = 0; i< result.length; i++){
            System.out.println(result[i]);
        }
    }
}
