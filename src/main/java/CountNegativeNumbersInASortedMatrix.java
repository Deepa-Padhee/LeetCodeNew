public class CountNegativeNumbersInASortedMatrix {
    public static int countNegatives(int[][] grid) {
        int res = 0;
        for (int[] num : grid){
            for (int i = 0;i<num.length;i++){
                if (num[i]<0){
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = {{-1}};
        System.out.println(countNegatives(grid));
    }

}
