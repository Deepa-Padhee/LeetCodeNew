public class DeleteColumnsToMakeSorted {
    public static int minDeletionSizeDiscussion(String[] strs) {
        if (strs == null || strs.length <= 1) {
            return 0;
        }

        int numToDelete = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            int curVal = 0;
            for (String s : strs) {
                char val = s.charAt(i);
                if (val - 'a' >= curVal) {
                    curVal = val - 'a';
                } else {
                    numToDelete++;
                    break;
                }
            }
        }

        return numToDelete;
    }































    public static int minDeletionSize(String[] strs) {
        int res = 0;
        if (strs ==null || strs.length<=1){
            return 0;
        }

        for (int i =0;i<strs[0].length();i++){
            int value = 0;
            for (String str : strs){
                char alph = str.charAt(i);
                if (alph - 'a' >= value){
                    value =alph - 'a';
                }else {
                    res++;
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String[] strs = {"cba","daf","ghi"};
        System.out.println(minDeletionSize(strs));
    }

}
