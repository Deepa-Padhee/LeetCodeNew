public class MinimumCostToMoveChipsToTheSamePosition {
    public static int minCostToMoveChips(int[] position) {
        int odd = 0;
        int even = 0;
        for (int num : position){
            if (num%2 ==0){
                even++;
            }
            else {
                odd++;
            }
        }
        return odd>even?even:odd;
    }

    public static void main(String[] args) {
        int[] position = {1,1000000000};
        System.out.print(minCostToMoveChips(position));
    }

}
