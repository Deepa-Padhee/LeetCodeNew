public class RobotReturnToOrigin {
    public static boolean judgeCircle1(String moves) {
        boolean res = false;
        int u = 0;
        int d = 0;
        int l = 0;
        int r = 0;
        for (int i =0;i<moves.length();i++){
            switch (moves.charAt(i)){
                case 'U':
                    u++;
                    break;
                case 'D':
                    d++;
                    break;
                case 'L':
                    l++;
                    break;
                case 'R':
                    r++;
                    break;
                default:
                    break;
            }
        }

        if ((u == d) && (l == r)){
            res = true;
        }
        return res;
    }

    public static boolean judgeCircle(String moves) {
        boolean res = false;
        int ud = 0;
        int lr = 0;
        for (int i =0;i<moves.length();i++){
            switch (moves.charAt(i)){
                case 'U':
                    ud++;
                    break;
                case 'D':
                    ud--;
                    break;
                case 'L':
                    lr++;
                    break;
                default:
                    lr--;
                    break;
            }
        }

        if ((ud ==0) && (lr == 0)){
            res = true;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("LL"));
    }

}
