// @anuja.nagare@uga.edu

public class AppleStockProfit {

	public static int get_max_profit(int[] spy) {

		int minV = spy[0];
		int current_Profit = spy[1] - spy[0];

		for (int i=1; i <spy.length ; i++) {
			minV = Math.min(minV, spy[i]);
			current_Profit = Math.max(current_Profit, (spy[i] - minV));			
		}//for

		return current_Profit;
	}//get_max_profit

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stock_prices_yesterday = {10, 7, 5, 8, 11, 9};

		System.out.println(get_max_profit(stock_prices_yesterday));


	}

}
