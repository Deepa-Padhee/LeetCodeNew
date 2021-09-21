import java.util.ArrayList;
import java.util.List;

public class OrderedStream {
    static int pointer;
    static String[] arr;
    public OrderedStream(int n) {
        arr = new String[n];
    }

    public static List<String> insert1(int idKey, String value) {
        arr[idKey-1] = value;
        if (arr[pointer] ==null){
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();
        for (int i = pointer;i< arr.length;i++){
            if (arr[i]==null){
                pointer=i;
                break;
            }
            res.add(arr[i]);
        }
        return res;
    }

    public static List<String> insert(int idKey, String value) {
        arr[idKey-1] = value;
        List<String> res = new ArrayList<>();
        while (pointer< arr.length && arr[pointer]!=null){
            res.add(arr[pointer]);
            pointer++;
        }
        return res;
    }



    public static void main(String[] args) {
        OrderedStream orderedStream = new OrderedStream(9);
        System.out.println(insert(9,"nghbm"));
        System.out.println(insert(7,"hgeob"));
        System.out.println(insert(6,"mwlrz"));
        System.out.println(insert(4,"oalee"));
        System.out.println(insert(2,"bouhq"));
        System.out.println(insert(1,"mnknb"));
        System.out.println(insert(5,"qkxbj"));
        System.out.println(insert(8,"iydkk"));
        System.out.println(insert(3,"oqdnf"));

    }
}
