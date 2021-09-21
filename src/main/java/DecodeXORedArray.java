public class DecodeXORedArray {
    public static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length+1];
        arr[0] = first;
        for (int i = 0; i<encoded.length; i++){
            arr[i+1] = arr[i]^encoded[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] encoded = {6};
        int[] result = decode(encoded,1);
        for (int i = 0; i< result.length; i++){
            System.out.println(result[i]);
        }
    }
}
