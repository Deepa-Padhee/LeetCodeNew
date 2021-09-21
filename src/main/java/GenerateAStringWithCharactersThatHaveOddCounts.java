public class GenerateAStringWithCharactersThatHaveOddCounts {
    public static String generateTheString1(int n) {
        StringBuilder sb = new StringBuilder();
        if (n%2 !=0){
            for (int i = 0;i<n;i++){
                sb.append("a");
            }
        }
        else {
            sb.append("a");
            for (int i = 0;i<n-1;i++){
                sb.append("b");
            }
        }
        return sb.toString();
    }

    /*public static String generateTheString(int n) {
        *//*StringBuilder sb = new StringBuilder();
        if (n%2 ==0){
            return sb.append("a".repeat(n-1)).append("b").toString();
        }
        else {
            return sb.append("a".repeat(n)).toString();
        }*//*
    }*/

    public static void main(String[] args) {
        System.out.println(generateTheString1(2));
    }

}
