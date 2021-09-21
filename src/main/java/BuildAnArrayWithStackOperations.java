import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BuildAnArrayWithStackOperations {
    public static List<String> buildArray1(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int count =0;

        List<Integer> targetNums = Arrays.stream(target).boxed().collect(Collectors.toList());

        for (int i = 1; i<=n; i++){
            if (targetNums.contains(i)){
                res.add("Push");
                count++;
            }
            else {
                res.add("Push");
                res.add("Pop");
            }

            if (count == target.length){
                break;
            }

        }

        return res;
    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int count =0;

        for (int i =1;i<=n && count< target.length;i++){
            res.add("Push");
            if (target[count] != i){
                res.add("Pop");
            }

            if (target[count]<=i){
                count++;
            }
        }

        return res;
    }


    public static void main(String[] args) {
        int[] target = {1,3};
        List<String> res = buildArray(target,3);
        for (int i =0;i< res.size();i++){
            System.out.print(res.get(i) + " ");
        }
    }

}
