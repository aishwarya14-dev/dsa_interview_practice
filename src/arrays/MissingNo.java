package dsa_interview_practice;

public class MissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int arr[] = { 1, 3, 7, 5, 6, 2 };
		   
		   int missing = findMissing(arr,arr.length);
		   
		   System.out.println(missing);
		   
	   }
	   
	   public static int findMissing(int arr[] , int n) {
		   int N = n + 1;
		    
		    int total = (N) * (N + 1) / 2;
		    for (int i = 0; i < n; i++)
		        total -= arr[i];
		    return total;
		
	}

}
