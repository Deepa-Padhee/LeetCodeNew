import java.util.ArrayList;

public class FlippingAnImage {
    public static int[][] flipAndInvertImage1(int[][] image) {
        ArrayList<int[]> keepThis = new ArrayList<>();
        int[][] res = new int[image.length][];
        for (int[] im : image){
            int[] newIm = new int[im.length];
            int len = im.length;
            for (int i = 0;i< im.length;i++){
                newIm[len-1] = im[i];
                len--;
            }
            for (int i = 0;i< newIm.length;i++){
                if (newIm[i] == 0){
                    newIm[i] = 1;
                }
                else {
                    newIm[i] = 0;
                }
            }
            keepThis.add(newIm);
        }
        res = keepThis.toArray(new int[0][]);
        return res;
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int j = 0;j< image.length;j++){
            int[] newIm = new int[image[j].length];
            int len = image[j].length;
            for (int i = 0;i< image[j].length;i++){
                newIm[len-1] = image[j][i];
                len--;
            }
            for (int i = 0;i< newIm.length;i++){
                if (newIm[i] == 0){
                    newIm[i] = 1;
                }
                else {
                    newIm[i] = 0;
                }
            }
            image[j] = newIm;
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] send = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] res = flipAndInvertImage(send);
        for (int[] im:res){
            for (int i = 0;i< im.length;i++){
                System.out.println(im[i]);
            }
        }
    }
}
