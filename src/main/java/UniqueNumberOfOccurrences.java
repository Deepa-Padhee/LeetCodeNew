import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueNumberOfOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        boolean res = true;
        int occ = 1;
        List<Integer> listInt = new ArrayList<>();

        Arrays.sort(arr);
        int intRightNow = arr[0];

        for (int i = 1;i< arr.length;i++){
            if (arr[i] == intRightNow){
                occ++;
            }
            else {
                if (listInt.contains(occ)){
                    return false;
                }
                listInt.add(occ);
                occ = 0;
                occ++;
                intRightNow = arr[i];
            }
        }
        if (listInt.contains(occ)){
            return false;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }

}
