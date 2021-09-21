import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static String removeDuplicates1(String s) {
        int l =0;
        int r = 1;
        while (r<s.length()){
            if (s.charAt(l) == s.charAt(r)) {
                s = s.substring(0,l) + s.substring(r+1);
                l = Math.max(0,l-1);
                r = l+1;
            }
            else {
                l = l+1;
                r = r+1;
            }
        }
        return s;
    }

    public static String removeDuplicates(String s) {
        Stack<Character> sk = new Stack();
        for(int i = 0; i <s.length();i++){
            char ch = s.charAt(i);
            if(sk.empty()){
                sk.push(ch);
            }else if(sk.peek() == ch){
                sk.pop();
            }else{
                sk.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< sk.size();i++){
            sb.append(sk.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.print(removeDuplicates("abbaca"));
    }

}
