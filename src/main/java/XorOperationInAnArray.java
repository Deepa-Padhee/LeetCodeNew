public class XorOperationInAnArray {
    public static int xorOperation(int n, int start) {
        int result = 0;
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = start + (2*i);
        }
        for (int digit : arr){
            result = result ^ digit;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = xorOperation(10,5);
        System.out.println(result);
    }
}
