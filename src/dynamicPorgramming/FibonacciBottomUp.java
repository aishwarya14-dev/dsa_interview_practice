package dynamicPorgramming;

public class FibonacciBottomUp {
	static int n = 5;
	static int fibArr[] = new int[n+1];

	public static void main(String[] args) {
		
		//filling the dp table using bottom up 
		
		fibArr[0] = 1;
		fibArr[1] = 1;
		for(int i=2;i<fibArr.length;i++) {
			fibArr[i] = fibArr[i-1] + fibArr[i-2];
		}
		

	}

}
