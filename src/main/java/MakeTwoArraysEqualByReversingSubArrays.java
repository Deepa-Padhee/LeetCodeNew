import java.util.Arrays;

public class MakeTwoArraysEqualByReversingSubArrays {
    public static boolean canBeEqual(int[] target, int[] arr) {
        boolean res;
        Arrays.sort(target);
        Arrays.sort(arr);
        res = Arrays.equals(target,arr);
        return res;
    }

    public static void main(String[] args) {
        int[] target = {1,12};
        int[] arr = {12,1};
        System.out.println(canBeEqual(target,arr));
    }

}
