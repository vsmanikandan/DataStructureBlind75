package problems.sectionslidingwindow;

public class TimeToSellStock {

    public int calcMaxProfit(int[] array) {
        int buyPrice = array[0];
        int profit = 0;
        for(int i=1; i<array.length; i++) {
            if(buyPrice> array[i]) {
                buyPrice = array[i];
            } else {
                int currentProfit = array[i] - buyPrice;
                profit = Math.max(profit,currentProfit);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        TimeToSellStock t = new TimeToSellStock();
        System.out.println(t.calcMaxProfit(new int[] {7,1,5,3,6,4}));
    }
}
