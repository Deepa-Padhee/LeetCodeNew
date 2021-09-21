public class FinalPricesWithASpecialDiscountInAShop {
    public static int[] finalPrices1(int[] prices) {
        for (int i = 0;i<prices.length;i++){
            for (int j = i+1;j< prices.length;j++){
                if (prices[i]>=prices[j]){
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }

    public static int[] finalPrices(int[] prices) {
        for (int i = 0;i<prices.length;i++){
            prices[i] = prices[i] - discount(prices,i);
        }
        return prices;
    }

    public static int discount1(int[] prices, int i){
        int curr = i;
        while (i<prices.length){
            if (i+1< prices.length && prices[curr]>=prices[i+1]){
                return prices[i+1];
            }
            i++;
        }
        return 0;
    }

    public static int discount(int[] prices, int i){
        int curr = i-1;
        while (i < prices.length) {
            if (prices[i] <= prices[curr]) {
                return prices[i];
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] prices = {8,7,4,2,8,1,7,7,10,1};
        int[] res = finalPrices(prices);
        for (int i = 0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }

}
