
public class MaxProfitByBuyingAShareAtmostTwice {

	public static int calc(int[] price){
		int n = price.length;
		int[] profit = new int[n];
		int i,maxPrice,minPrice;
		maxPrice = price[n-1];
		for(i=n-2;i>=0;i--){
			if(maxPrice<price[i]){
				maxPrice = price[i];
			}
			profit[i] = UtilClass.max(profit[i+1],maxPrice-price[i]);
		}
		
		minPrice = price[0];
		for(i=1;i<n;i++){
			if(minPrice>price[i]){
				minPrice = price[i];
			}
			profit[i] = UtilClass.max(profit[i-1], (price[i] - minPrice)+profit[i]);
		}
		System.out.println(profit[n-1]+"!");
		return profit[n-1];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[] = {0, 30, 15, 10, 8, 25, 80};
		calc(price);
	}

}
