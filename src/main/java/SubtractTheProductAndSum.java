public class SubtractTheProductAndSum {
    public static int subtractProductAndSum(int n) {
        int result = 0;
        int prod = 1;
        int sum = 0;
        while (n != 0){
            int num = n%10;
            prod = prod * num;
            sum = sum + num;
            n= n/10;
        }
        result = prod - sum;
        return result;
    }

    public static void main(String[] args) {
        int result = subtractProductAndSum(705);
        System.out.println(result);
    }
}
