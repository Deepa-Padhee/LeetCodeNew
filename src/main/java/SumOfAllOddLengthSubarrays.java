public class SumOfAllOddLengthSubarrays {
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int size = 1;
        while (size <= arr.length) {
            for (int i = 0; i < arr.length; i++) {
                if(i + size <= arr.length) {
                    for (int j = i; j < i + size; j++) {
                        sum += arr[j];
                    }
                }
            }
            size += 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        int result = sumOddLengthSubarrays(arr);
        System.out.println(result);
    }
}
