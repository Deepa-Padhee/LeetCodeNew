import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleanList =  new ArrayList<>();
        int length = candies.length;
        int highest = 0;
        for (int i = 0; i<length; i++){
            if (candies[i] > highest){
                highest = candies[i];
            }
        }
        for (int i = 0; i<length; i++){
            int check = candies[i] +extraCandies;
            if (check >= highest ){
                booleanList.add(true);
            }
            else {
                booleanList.add(false);
            }
        }
        return booleanList;
    }

    public static void main(String[] args) {
        int arr[] = {12,1,12};
        List<Boolean> arrNew= kidsWithCandies(arr,10);
        System.out.println(arrNew);
    }
}
