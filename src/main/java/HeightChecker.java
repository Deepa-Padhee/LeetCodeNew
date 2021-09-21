import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int res = 0;
        int[] backup = Arrays.copyOf(heights,heights.length);

        Arrays.sort(heights);
        for (int i =0;i<heights.length;i++){
            if (heights[i] != backup[i]){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] heights = {1,2,3,4,5};
        System.out.println(heightChecker(heights));
    }

}
