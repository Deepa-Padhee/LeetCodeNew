import java.util.ArrayList;

public class Fibonacci {
    public static int fib(int n) {
        int result = 0;
        ArrayList<Integer> outArr = new ArrayList<>();
        outArr.add(0);
        outArr.add(1);
        for (int i = 1; i < n; i++){
            outArr.add(outArr.get(i) + outArr.get(i-1));
        }
        result = outArr.get(n);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
