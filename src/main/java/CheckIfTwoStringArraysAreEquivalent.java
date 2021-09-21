public class CheckIfTwoStringArraysAreEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean result = false;
        String string1 = "";
        String string2 = "";
        for (String s : word1){
            string1 = string1+s;
        }
        for (String s : word2){
            string2 = string2+s;
        }
        if (string1.equals(string2)){
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        boolean b= arrayStringsAreEqual(word1,word2);
        System.out.println(b);
    }
}
