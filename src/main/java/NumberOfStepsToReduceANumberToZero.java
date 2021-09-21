public class NumberOfStepsToReduceANumberToZero {
    public static int numberOfSteps (int num) {
        int result = 0;
        while (num > 0) {
            if (num%2 == 0){
                num = num/2;
                result = result +1;
            }
            else {
                num = num - 1;
                result = result +1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result = numberOfSteps(123);
        System.out.println(result);
    }
}
