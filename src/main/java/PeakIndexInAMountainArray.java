public class PeakIndexInAMountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int res = 0;
        while (arr[res] < arr[res+1]){
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.print(peakIndexInMountainArray(arr));
    }

}
