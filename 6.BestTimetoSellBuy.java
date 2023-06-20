public class 6.BestTimetoSellBuy {
    
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int max = 0;
        int min = prices.get(0);

        for(int i = 1; i < prices.size(); i++){
            min = Math.min(min, prices.get(i));
            max = Math.max(max, prices.get(i) - min);
        }

        return max;
    }
}
