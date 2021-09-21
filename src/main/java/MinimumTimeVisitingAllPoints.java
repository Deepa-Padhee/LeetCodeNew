public class MinimumTimeVisitingAllPoints {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for (int i = 0;i<points.length-1;i++){
            int x = Math.abs(points[i+1][0]-points[i][0]);
            int y = Math.abs(points[i+1][1]-points[i][1]);
            result = result + Math.max(x,y);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] points = {{1,1},{3,4},{-1,0}};
        System.out.println(minTimeToVisitAllPoints(points));
    }
}
