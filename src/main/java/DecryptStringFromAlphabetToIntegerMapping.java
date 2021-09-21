public class DecryptStringFromAlphabetToIntegerMapping {
    public static String freqAlphabets1(String s) {
        String res = "";
        for (int i = 0; i< s.length();){
            if (i+2<s.length() && i+2 != 0 && s.charAt(i+2) == '#'){
                String subStr = s.substring(i,i+2);
                int intVal = Integer.parseInt(subStr)+96;
                char addVal = (char) intVal;
                res = res + addVal;
                i = i+3;
            }
            else {
                int intVal = Integer.parseInt(String.valueOf(s.charAt(i)))+96;
                char addVal = (char) intVal;
                res = res + addVal;
                i++;
            }
        }
        return res;
    }

    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< s.length();){
            if (i+2<s.length() && i+2 != 0 && s.charAt(i+2) == '#'){
                String subStr = s.substring(i,i+2);
                int intVal = Integer.parseInt(subStr)+96;
                char addVal = (char) intVal;
                sb.append(addVal);
                i = i+3;
            }
            else {
                int intVal = Integer.parseInt(String.valueOf(s.charAt(i)))+96;
                char addVal = (char) intVal;
                sb.append(addVal);
                i++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }
}
