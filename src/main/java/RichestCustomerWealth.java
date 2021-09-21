public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
    int richest =0;
    int rich =0;
    for (int row =0; row<accounts.length; row++){
        for (int col = 0; col<accounts[row].length; col++){
            rich = rich + accounts[row][col];
        }
        if (rich>richest){
            richest = rich;
        }
        rich = 0;
    }
    return richest;
    }

    public static void main(String[] args) {
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(maximumWealth(accounts));
    }
}
