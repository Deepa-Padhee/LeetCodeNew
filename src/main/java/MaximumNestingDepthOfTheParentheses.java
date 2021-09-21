public class MaximumNestingDepthOfTheParentheses {
    public static int maxDepth(String s) {
        int max=0,count=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            switch(c){
                case '(':
                    count++;
                    if(count>max){
                        max=count;
                    }
                    break;
                case ')': count--;
                    break;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int result = maxDepth("1");
        System.out.println(result);
    }
}
