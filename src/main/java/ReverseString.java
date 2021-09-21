public class ReverseString {
    public static void reverseString1(char[] s) {
        int len = s.length;
        int funLen = 0;
        if (len%2 == 0 ){
            funLen = (s.length/2)-1;
        }
        else {
            funLen = s.length/2;
        }
        for (int i = 0;i<=funLen;i++){
            char temp = s[i];
            s[i] = s[len-1];
            s[len-1] = temp;
            len--;
        }
    }

    public static void reverseString(char[] s) {
        int first = 0;
        int last = s.length-1;
        while (first<last){
            char temp = s[first];
            s[first] = s[last];
            s[last] = temp;
            first++;
            last--;
        }
    }


    public static void main(String[] args) {
        char[] s = {'a'};
        reverseString(s);
        for (int i = 0;i<s.length;i++){
            System.out.print(s[i] + " ");
        }
    }

}