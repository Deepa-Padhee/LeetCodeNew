public class CellsWithOddValuesInAMatrix {
    public static int oddCells(int m, int n, int[][] indices) {
        int result = 0;
        int[][] array =new int[m][n];
        int r = 0;
        int c = 0;
        for (int i = 0;i<indices.length;i++){
            r = indices[i][0];
            c = indices[i][1];
            for (int j = 0;j<n;j++){
                array[r][j]++;
            }
            for (int j = 0;j<m;j++){
                array[j][c]++;
            }
        }
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(array[i][j]%2!=0) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(2,3, indices));
    }
}
