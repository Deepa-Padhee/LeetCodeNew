public class ReplaceAllDigitsWithCharacters {
    public static String replaceDigits1(String s) {
        String result = "";
        int len = s.length();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i<len; i++){
            if ((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57){
                String str = String.valueOf(s.charAt(i));
                int ind  = Integer.parseInt(str);
                int index = (int)s.charAt(i-1) +ind;
                char newChar = (char) index;
                ans.append(newChar);
            }
            else {
                ans.append(s.charAt(i));
            }
        }
        result = String.valueOf(ans);
        return result;
    }

    public static String replaceDigits(String s) {
        String result = "";
        int len = s.length();
        StringBuilder ans = new StringBuilder(s);
        for (int i = 1; i<len; i+=2){
            ans.setCharAt(i, (char) (s.charAt(i-1) +Character.getNumericValue(s.charAt(i))));
        }
        result = String.valueOf(ans);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1"));
    }
}
