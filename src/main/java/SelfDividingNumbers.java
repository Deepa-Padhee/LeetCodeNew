import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left;i<=right;i++){
            boolean checkFalse  = checkNum(i);
            if (checkFalse){
                res.add(i);
            }
        }
        return res;
    }

    public static boolean checkNum(int numCheck){
        int mainNum = numCheck;
        boolean checkFalse = true;
        while (numCheck > 0) {
            int num = numCheck % 10;
            if (num == 0 || (mainNum % num != 0)){
                checkFalse = false;
                break;
            }
            numCheck = numCheck / 10;
        }
        return checkFalse;
    }

    public static void main(String[] args) {
        int start =1;
        int end = 22;
        List<Integer> res =selfDividingNumbers(start,end);
        for (int i =0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }

}
