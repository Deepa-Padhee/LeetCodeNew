public class CountingBits {
    public static int[] countBits1(int n) {//error
        int[] res = new int[n+1];
        int add = 0;
        for (int i = 0;i<=n;i++){
            int binary = Integer.parseInt(Integer.toBinaryString(i));
            while (binary>0){
                int num = binary%10;
                add = add+num;
                binary = binary/10;
            }
            res[i] = add;
            add = 0;
        }
        return res;
    }

    public static int[] countBits2(int n) {
        int[] res = new int[n+1];
        int add = 0;
        for (int i = 0;i<=n;i++){
            String binary = Integer.toBinaryString(i);
            for (int j =0;j<binary.length();j++){
                if (binary.charAt(j) == '1'){
                    add++;
                }
            }
            res[i] = add;
            add = 0;
        }
        return res;
    }

    public static int[] countBits3(int n) {
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++)
            dp[i] = dp[i & i-1]+1;
        return dp;
    }

    public static int[] countBits(int n) {
        int[] dp = new int[n + 1];
        if (n < 2) {
            for (int i = 0;i < n + 1;i++){
                dp[i] = i;
            }
            return dp;
        }
        dp[0] = 0;
        dp[1] = 1;
        int step = 2;
        for (int i = 2;i < n + 1;i++) {
            if (i / step == 2) step = i;
            dp[i] = 1 + dp[i - step];
        }
        return dp;
    }

    public static void main(String[] args) {
        int[] res = countBits(2);
        for (int i = 0;i< res.length;i++){
            System.out.print(res[i] + " ");
        }
    }

}
