public class ReplaceElementsWithGreatestElementOnRightSide {
    public static int[] replaceElements1(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0;i<arr.length;i++){
            int max = 0;
            for (int j=i+1;j< arr.length;j++){
                if (arr[j]>max){
                    max = arr[j];
                }
            }
            res[i] = max;
        }
        res[arr.length-1] = -1;
        return res;
    }

    public static int[] replaceElements(int[] arr) {
        int res[] = new int[arr.length];
        res[arr.length-1] = -1;
        int rightMax = arr[arr.length-1];

        for (int i = arr.length-2;i>=0;i--){
            res[i] = rightMax;
            if (arr[i]>rightMax){
                rightMax = arr[i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        int res[] = replaceElements(arr);
        for (int i = 0;i< res.length;i++){
            System.out.print(res[i]+ " ");
        }
    }

}
