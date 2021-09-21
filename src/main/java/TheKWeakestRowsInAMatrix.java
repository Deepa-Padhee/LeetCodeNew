import java.util.*;

public class TheKWeakestRowsInAMatrix {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] res = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        int num =0;
        for (int[] row : mat){
            int add =0;
            for (int i =0;i< row.length;i++){
                if (row[i]==1){
                    add++;
                }
            }
            map.put(num,add);
            num++;
        }

        List<Map.Entry<Integer, Integer> > list
                = new LinkedList<Map.Entry<Integer, Integer> >(
                map.entrySet());

        // Sort the list using lambda expression
        Collections.sort(
                list,
                (i1,
                 i2) -> i1.getValue().compareTo(i2.getValue()));

        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp
                = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        Iterator iterator = temp.entrySet().iterator();
        int checkK =0;
        while (iterator.hasNext() && checkK <k){
            Map.Entry element = (Map.Entry) iterator.next();
            res[checkK] = (int) element.getKey();
            checkK++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0}, {1,0,0,0,0}, {1,1,0,0,0}, {1,1,1,1,1}};
        int[] res = kWeakestRows(mat,3);
        for (int i =0;i< res.length;i++){
            System.out.print(res[i]+ " ");
        }
    }

}
