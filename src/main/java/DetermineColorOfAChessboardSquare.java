public class DetermineColorOfAChessboardSquare {
    public static boolean squareIsWhite(String coordinates) {
        boolean res = true;
        int check1 = coordinates.charAt(1)%2;
        int check2 = coordinates.charAt(0)%2;
        if (check1==0){
            if (check2==0){
                res = false;
            }
        }
        else {
            if (check2!=0){
                res = false;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(squareIsWhite("c7"));
    }
}
