import java.util.ArrayList;

public class RemoveOutermostParentheses {
    public static String removeOuterParentheses1(String s) {
        String result = "";
        int open = 0;
        int close = 0;
        int lastPos = 1;
        StringBuilder str = new StringBuilder();
        ArrayList<String> strArray = new ArrayList<>();
        for (int i = 0; i<s.length();i++){
            if (s.charAt(i)=='('){
                open++;
            }
            else {
                close++;
            }
            if (open>1 && close>1 && open==close){
                String keep = s.substring(lastPos,i);
                strArray.add(keep);
                open =0;
                close=0;
                lastPos = i+2;
            }
            else if (open==close){
                open =0;
                close=0;
                lastPos = i+2;
            }
        }
        for (String strNew:strArray){
            str.append(strNew);
        }
        result = str.toString();
        return result;
    }



    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("()()"));
    }

    private static String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int bracketCounter = 0;
        for (char c : s.toCharArray()){
            if (c == '('){
                bracketCounter++;
                if (bracketCounter == 1){
                    continue;
                }
            }
            else {
                bracketCounter--;
                if (bracketCounter==0){
                    continue;
                }
            }
            str.append(c);
        }
        return str.toString();
    }
}
