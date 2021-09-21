public class SumOfDigitsInBaseK {
    public static int sumBase(int n, int k) {
        int res = 0;
        int changeBase = Integer.parseInt(Integer.toString(Integer.parseInt(String.valueOf(n), 10), k));
        while (changeBase!=0){
            int take = changeBase%10;
            res = res+take;
            changeBase = changeBase/10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sumBase(10,10));
    }

}
