import java.util.NavigableMap;
import java.util.TreeMap;

public class NumberOfRectanglesThatCanFormTheLargestSquare {
    public static int countGoodRectangles1(int[][] rectangles) {
        int res = 0;
        NavigableMap<Integer,Integer> map = new TreeMap<>();
        for (int[] rectangle : rectangles){
            if (rectangle[0] > rectangle[1]){
                if (map.containsKey(rectangle[1])){
                    int change = map.get(rectangle[1]) +1;
                    map.replace(rectangle[1],change);
                }
                else {
                    map.put(rectangle[1],1);
                }
            }
            else {
                if (map.containsKey(rectangle[0])){
                    int change = map.get(rectangle[0]) +1;
                    map.replace(rectangle[0],change);
                }
                else {
                    map.put(rectangle[0],1);
                }
            }
        }
        res = map.get(map.lastKey());
        return res;
    }

    public static int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        int count = 0;
        for (int i = 0;i<rectangles.length;i++){
            int superSide = Math.min(rectangles[i][0],rectangles[i][1]);
            if (superSide>maxLen){
                maxLen=superSide;
                count=1;
            }
            else if (superSide==maxLen){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] rec = {{2,3},{3,7},{4,3}};
        System.out.println(countGoodRectangles(rec));
    }
}
