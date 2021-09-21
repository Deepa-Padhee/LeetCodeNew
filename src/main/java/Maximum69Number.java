public class Maximum69Number {
    public static int maximum69Number (int num) {
        String backup = String.valueOf(num);
        StringBuilder str = new StringBuilder();
        int len = backup.length();
        for (int i = 0;i<len;i++){
            if (backup.charAt(i) == '6'){
                str.append('9');
                if (i+1<backup.length()){
                    str.append(backup.substring(i+1));
                    break;
                }
                break;
            }
            else {
                str.append(backup.charAt(i));
            }
        }
        int result = Integer.parseInt(str.toString());
        return result;
    }


    public static int maximum69Number1 (int num) {
        String backup = String.valueOf(num);
        backup = backup.replaceFirst("6","9");
        return Integer.parseInt(backup);
    }


    public static void main(String[] args) {
        System.out.println(maximum69Number(666));
    }
}
