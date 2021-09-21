import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public static int sumOfUnique1(int[] nums) {
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i< nums.length;i++){
            if (map.containsKey(nums[i])){
                map.replace(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() ==1){
                res = res + entry.getKey();
            }
        }

        return res;
    }

    public static int sumOfUnique(int[] nums) {
        int[] arr = new int[101];

        for (int i = 0; i < nums.length; i++) {

            arr[nums[i]]++;

        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1 ) sum+=i;

        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};
        System.out.println(sumOfUnique(nums));
    }

}
