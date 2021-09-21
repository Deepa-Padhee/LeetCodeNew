public class SplitAStringInBalancedStrings {
    public static int balancedStringSplit(String s) {
        int result = 0;
        int check = 0;
        for (Character c : s.toCharArray()){
            if (c.equals('L')){
                check = check+1;
            }
            else {
                check = check -1;
            }
            if (check ==0){
                result = result+1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result = balancedStringSplit("LLLLRRRR");
        System.out.println(result);
    }
}
