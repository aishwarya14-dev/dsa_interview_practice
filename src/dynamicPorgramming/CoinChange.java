package dynamicPorgramming;

//coin change solution using simple recursion

public class CoinChange {

	public static void main(String[] args) {
		
		int coins[] = {1,2,3};
		int n=5;
	  
		System.out.print(coinChange(coins,coins.length-1,n));

	}
	
	public static int coinChange(int coins[],int lastIndex, int n) {
		
		if(lastIndex<0) return 0;
		
		if(n==0) return 1;
		
		if(n<0) return 0;
		
		return coinChange(coins,lastIndex-1,n) + coinChange(coins,lastIndex,n-coins[lastIndex]);
		
	}

}
