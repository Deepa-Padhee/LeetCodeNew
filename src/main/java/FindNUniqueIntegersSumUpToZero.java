public class FindNUniqueIntegersSumUpToZero {
    public static int[] sumZero1(int n) {
        //wrong
        int[] res = new int[n];
        if (n==1){
            res[0] = 0;
        }
        else if (n%2 == 0){
            for (int i = 0;i<n;i=i+2){
                res[i] = n/2;
                res[i+1] = -n/2;
                n--;
            }
        }
        else {
            for (int i = 0;i<n;i=i+2){
                res[i] = n/2;
                res[i+1] = -n/2;
                n=n-2;
            }
            res[res.length-1] = 0;
        }
        return res;
    }

    public static int[] sumZero(int n) {
        int [] result = new int[n];
        int i = 0;
        if(n % 2 != 0){
            result[i++] = 0;
        }
        int counter = 1;
        while(i < n){
            result[i++] = counter;
            result[i++] = - counter;
            counter++;

        }

        return result;
    }

    public static void main(String[] args) {
        int n =2;
        int[] res = sumZero(n);
        for (int i =0;i<n;i++){
            System.out.println(res[i]);
        }
    }
}
