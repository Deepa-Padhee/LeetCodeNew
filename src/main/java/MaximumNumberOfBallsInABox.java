import java.util.Collections;
import java.util.HashMap;

public class MaximumNumberOfBallsInABox {
    public static int countBalls1(int lowLimit, int highLimit) {
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = lowLimit;i<=highLimit;i++){
            int total = addNum(i);
            if (map.containsKey(total)){
                map.replace(total, map.get(total)+1);
            }
            else {
                map.put(total,1);
            }
        }
        res = Collections.max(map.values());
        return res;
    }

    public static int addNum(int num){
        int res = 0;
        while (num!=0){
            int digit  = num%10;
            res = res+digit;
            num = num/10;
        }
        return res;
    }

    private static int count(int n) {
        int s=0;
        while(n>0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
    public static int countBalls(int l, int h) {
        if(l==h)
            return 1;
        int []H = new int[h+1];
        int s=count(l), m=1;
        H[s]++;
        for(int i=l+1;i<=h;i++){
            if(i%10==0)
                s=count(i);
            else
                s++;
            H[s]++;
            m=Math.max(m, H[s]);
        }
        return m;
    }


    public static void main(String[] args) {
        System.out.println(countBalls(19,28));
    }
}
