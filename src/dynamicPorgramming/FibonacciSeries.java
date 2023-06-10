package dynamicPorgramming;

// using top-down approach

public class FibonacciSeries {
	static int n = 5;
	static int fibArr[] = new int[n+1];
   

	public static void main(String[] args) {
		 fibArr[0] = 1;
		 fibArr[1] = 1;
		 System.out.print(fib(n));
	}
	
	static int fib(int n) {
		if(n==0 || n==1)
	      return fibArr[n];
		
		int x,y;
		
		if(fibArr[n-1]!=0)
			x=fibArr[n-1];
		else
			x=fib(n-1);
		
		if(fibArr[n-2]!=0)
			y=fibArr[n-2];
		else
			y=fib(n-2);
		
		fibArr[n] = x+y;
		
		return fibArr[n];
	}

}
