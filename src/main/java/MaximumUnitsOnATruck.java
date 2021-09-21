import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class MaximumUnitsOnATruck {
    public static int maximumUnits1(int[][] boxTypes, int truckSize) {
        int res = 0;
        int check =0;
        boolean checkAll = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> keyList = new ArrayList<>();

        for (int i =0;i< boxTypes.length;i++){
            map.put(boxTypes[i][1],boxTypes[i][0]);
            keyList.add(boxTypes[i][1]);
        }

        Collections.sort(keyList, Collections.reverseOrder());

        for (int i =0;i< keyList.size();i++){
            for (int j=1;j<=map.get(keyList.get(i));j++){
                res = res + keyList.get(i);
                check++;
                if (check==truckSize){
                    checkAll = true;
                    break;
                }
            }
            if (checkAll){
                break;
            }
        }

        return res;
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        int res = 0;
        Arrays.sort(boxTypes,(a,b)->(b[1]-a[1]));

        for (int[] boxType : boxTypes){
            if (truckSize-boxType[0] >= 0){
                res = res + (boxType[0]*boxType[1]);
                truckSize = truckSize - boxType[0];
            }
            else {
                res = res + (truckSize * boxType[1]);
                return res;
            }
        }

        return res;
    }


    public static void main(String[] args) {
        int[][] boxTypes = {{1,3},{2,2},{3,1}};
        //int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
        System.out.println(maximumUnits(boxTypes,4));
    }

}
