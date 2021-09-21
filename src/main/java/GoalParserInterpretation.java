public class GoalParserInterpretation {
    public static String interpret(String command) {
        String result = "";
        for (int i = 0; i<command.length(); i++){
            if (command.charAt(i) == 'G'){
                result = result + 'G';
            }
            else if (command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                result = result + 'o';
            }
            else if (command.charAt(i) == '(' && command.charAt(i+1) == 'a'){
                result = result + "al";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String result = interpret("(al)G(al)()()G");
        System.out.println(result);
    }
}
