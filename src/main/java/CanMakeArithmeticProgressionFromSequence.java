import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public static boolean canMakeArithmeticProgression1(int[] arr) {
        boolean res = true;
        if (arr.length ==2){
            return false;
        }
        Arrays.sort(arr);
        int current =Math.abs(arr[0] - arr[1]);
        for (int i = 1;i< arr.length;i++){
            if (current != (Math.abs(arr[i-1] - arr[i]))){
                return false;
            }
        }
        return res;
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        boolean res = true;
        Arrays.sort(arr);
        int current =Math.abs(arr[0] - arr[1]);
        for (int i = 2;i< arr.length;i++){
            if (current != (Math.abs(arr[i-1] - arr[i]))){
                return false;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr = {-2,0};
        System.out.print(canMakeArithmeticProgression(arr));
    }

}
