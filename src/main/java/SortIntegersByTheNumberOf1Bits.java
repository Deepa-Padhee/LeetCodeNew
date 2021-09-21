import java.util.*;
import java.util.stream.Collectors;

public class SortIntegersByTheNumberOf1Bits {
    public static int[] sortByBits1(int[] arr) {
        int[] res = new int[arr.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i< arr.length;i++){
            String binary = Integer.toBinaryString(arr[i]);
            int add = 0;
            for (int j=0;j<binary.length();j++){
                if (binary.charAt(j) == '1'){
                    add++;
                }
            }
            map.put(arr[i],add);
        }

        Map<Integer, Integer> sortedMap =
                map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));


        Iterator iterator = sortedMap.entrySet().iterator();
        int k = 0;
        while (iterator.hasNext() && k< arr.length){
            Map.Entry element = (Map.Entry) iterator.next();
            res[k] = (int) element.getKey();
            k++;
        }

        return res;
    }

    public static int[] sortByBits(int[] arr) {
        Integer[] res = new Integer[arr.length];
        for (int i = 0; i < res.length; ++i){
            res[i] = arr[i];
        }
        Arrays.sort(res, Comparator.comparing(i -> Integer.bitCount(i) * 10000 + i));
        for (int i = 0; i < res.length; ++i){
            arr[i] = res[i];
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int[] res = sortByBits(arr);
    }

}
