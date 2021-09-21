import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minj = 0;
        for ( int i=0; i < matrix.length; i++ ) {
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
            for( int j=0 ; j < matrix[0].length; j++ ) {
                if( matrix[i][j] < min) {
                    min = matrix[i][j];
                    minj = j;
                }
            }
            for( int k=0; k < matrix.length; k++) {
                if( matrix[k][minj] > max ) {
                    max = matrix[k][minj];
                }
            }
            if(min==max) {
                res.add(min);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{7,8},{1,2}};
        List<Integer> res = luckyNumbers(matrix);
        for (int i = 0;i<res.size();i++){
            System.out.print(res.get(i) + " ");
        }
    }

}
