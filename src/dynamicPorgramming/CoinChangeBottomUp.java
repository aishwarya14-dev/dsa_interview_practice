package dynamicPorgramming;

public class CoinChangeBottomUp {
	static int coins[] = {1,2,3};
	static int n=5;

	public static void main(String[] args) {
		coinChange(n,coins);	
	}
    
	static void coinChange(int n,int coins[]) {
		
		int dpt[][] = new int[n+1][coins.length+1];
		
		for(int i=0;i<n+1;i++)
			dpt[i][0] = 0;
		
		for(int j=0;j<coins.length;j++)
			dpt[0][j] = 1;
		
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<coins.length+1;j++) {
				dpt[i][j] = dpt[i][j-1] + dpt[i-coins[j]][j];
			}
		}
		
	}
}
