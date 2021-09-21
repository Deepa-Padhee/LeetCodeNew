import java.util.HashMap;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public static int minPartitions1(String n) {//numberformatexception
        int res = 0;
        if (n.contains("9")){
            return 9;
        }
        int number = Integer.parseInt(n);
        while (number>0){
            int num = number%10;
            res = Math.max(num,res);
            number = number/10;
        }
        return res;
    }

    public static int minPartitions2(String n) {
        int res = 0;
        if (n.contains("9")){
            return 9;
        }

        HashMap<Integer,Character> map = new HashMap<>();
        for (int i = 0;i<n.length();i++){
            map.put(Integer.parseInt(String.valueOf(n.charAt(i))),n.charAt(i));
        }
        Object newRes = map.keySet().toArray()[map.size()-1];
        res = Integer.parseInt(String.valueOf(newRes));
        return res;
    }

    public static int minPartitions(String n) {
        int res=0;

        char digits[]=n.toCharArray();
        for(int i=0;i<digits.length;i++){
            int digit=digits[i]-'0';
            if(digit>res) res=digit;
        }


        return res;
    }

    public static void main(String[] args) {
        System.out.print(minPartitions("0"));
    }

}
