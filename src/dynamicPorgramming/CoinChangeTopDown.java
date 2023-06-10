package dynamicPorgramming;

//solution using dp table

public class CoinChangeTopDown {
	
	static int coins[] = {1,2,3};
	static int n=5;
	static int dpTable[][] = new int[6][4];
	static int count = 0 ;

	public static void main(String[] args) {
		
		coinChange(coins,n,3);
		System.out.print(count);

	}
	
	public static int coinChange(int coins[],int n,int lastIndex) {
		int x,y;
		
		if(n==0) return 1;
		
		if(lastIndex<=0 || n<0) return 0;
		
		if(dpTable[n][lastIndex-1]!=0)
			x = dpTable[n][lastIndex-1];
		else
			x = coinChange(coins,n,lastIndex-1);
		
		if(dpTable[n-lastIndex][lastIndex]!=0)
			y = dpTable[n-lastIndex][lastIndex];
		else
			y = coinChange(coins,n-lastIndex,lastIndex);
		
		dpTable[n][lastIndex] = x+y;
		if(dpTable[n][lastIndex]==n)
			count++;
		
//		System.out.print(dpTable[n][lastIndex]+" ");
		return dpTable[n][lastIndex];
		
	}

}
