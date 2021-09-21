import java.util.ArrayList;
import java.util.Arrays;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] myArray1 = Arrays.copyOfRange(nums, 0, nums.length/2);
        int[] myArray2 = Arrays.copyOfRange(nums, nums.length/2, nums.length);
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i< myArray1.length; i++){
            newArray.add(myArray1[i]);
            newArray.add(myArray2[i]);
        }
        Object[] objectArray = newArray.toArray();
        int[] numsNew = new int[objectArray.length];
        for (int i = 0; i < objectArray.length; i++){
            numsNew[i] = (Integer)objectArray[i];
        }
        return numsNew;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2};
        int arrNew[] = shuffle(arr,4);
        for (int i = 0; i< arrNew.length; i++){
            System.out.println(arrNew[i]);
        }
    }
}
