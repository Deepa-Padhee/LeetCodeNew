import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DestinationCity {
    public static String destCity1(List<List<String>> paths) {
        String res = "";
        HashMap<String,String> map = new HashMap<>();
        List<String> listElements = new ArrayList<>();
        for (List<String> path: paths){
            map.put(path.get(0),path.get(1));
            listElements.add(path.get(0));
            listElements.add(path.get(1));
        }
        for (String checkAll: listElements){
            if (!map.containsKey(checkAll)){
                res = checkAll;
            }
        }
        return res;
    }

    public static String destCity2(List<List<String>> paths) {
        String res = "";
        HashMap<String,String> map = new HashMap<>();
        List<String> listElements = new ArrayList<>();
        for (List<String> path: paths){
            map.put(path.get(0),path.get(1));
            listElements.add(path.get(0));
            listElements.add(path.get(1));
        }
        for (String checkAll: listElements){
            if (!map.containsKey(checkAll)){
                return checkAll;
            }
        }
        return res;
    }

    public static String destCity(List<List<String>> paths) {
        String res = "";
        HashMap<String,String> map = new HashMap<>();
        for (List<String> path: paths){
            map.put(path.get(0),path.get(1));
        }
        for (int i = 0; i< paths.size();i++){
            if (!map.containsKey(paths.get(i).get(1))){
                return paths.get(i).get(1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> path = new ArrayList<>();
        List<List<String>> paths = new ArrayList<>();
        path.add("B");
        path.add("C");
        paths.add(path);
        List<String> path1 = new ArrayList<>();
        path1.add("D");
        path1.add("B");
        paths.add(path1);
        List<String> path2 = new ArrayList<>();
        path2.add("C");
        path2.add("A");
        paths.add(path2);
        System.out.println(destCity(paths));
    }

}
