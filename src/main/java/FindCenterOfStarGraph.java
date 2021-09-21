import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindCenterOfStarGraph {
    public static int findCenter1(int[][] edges) {
        int res = 0;
        int valueHigh = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int[] edge : edges){
            if (map.containsKey(edge[0])){
                map.replace(edge[0],map.get(edge[0])+1);
            }
            else {
                map.put(edge[0],1);
            }

            if (map.containsKey(edge[1])){
                map.replace(edge[1],map.get(edge[1])+1);
            }
            else {
                map.put(edge[1],1);
            }
        }

        Iterator iterator = (Iterator) map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry element = (Map.Entry) iterator.next();
            int elementValue = (int) element.getValue();
            if (elementValue > res){
                res = elementValue;
                valueHigh = (int) element.getKey();
            }
        }

        return valueHigh;
    }

    public static int findCenter(int[][] edges) {
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int[] edge : edges){
            if (map.containsKey(edge[0])){
                map.replace(edge[0],map.get(edge[0])+1);
                return edge[0];
            }
            else {
                map.put(edge[0],1);
            }

            if (map.containsKey(edge[1])){
                map.replace(edge[1],map.get(edge[1])+1);
                return edge[1];
            }
            else {
                map.put(edge[1],1);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] edges = {{1,2},{5,1},{1,3},{1,4}};
        System.out.println(findCenter(edges));
    }

}
