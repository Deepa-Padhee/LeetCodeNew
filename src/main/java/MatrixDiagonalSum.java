public class MatrixDiagonalSum {
    public static int diagonalSum1(int[][] mat) {
        int res = 0;
        int len = mat.length;;
        boolean isEven = (len/2 == 0)?true:false;
        for (int i = 0;i<len;i++){
            for (int j = 0;j<len;j++){
                if (isEven && ((i==j) || (i==0 && j==(len-1)) || (j==0 && i==(len-1)))){
                    res = res + mat[i][j];
                    System.out.println(mat[i][j]);
                }
                else if ((i==j) || (i==0 && j==(len-1)) || (j==0 && i==(len-1)) || (i+j == len-1)){
                    res = res + mat[i][j];
                    System.out.println(mat[i][j]);
                }
            }
        }
        return res;
    }

    public static int diagonalSum(int[][] mat) {
        int res = 0;
        int len = mat.length;;
        for (int i = 0;i<len;i++){
            res = res + mat[i][i]+ mat[i][len-1-i];
        }
        if (len/2 == 0){
            res = res - (mat[len/2][len/2]);
            return res;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {{5}};


        //int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        //int[][] mat = {{1,2},{4,5}};
        System.out.println(diagonalSum(mat));
    }
}
