package arrays;

public class KMaxContiguousSubArrays {

	public static void main(String[] args) {
		
		int arr[] = {3,2,1,-1,-2,-7,5,2,-6,-3};
		int k=3;
		findKMaxContiguousSubArrays(arr,k);
 
	}
	
	//Kadane's algo approach
	
	public static void findKMaxContiguousSubArrays(int[] arr,int k) {		
		
		for(int i=0;i<k;i++) {
			
			int start = 0 , end = 0 ,s=0;
			int max_so_far = Integer.MIN_VALUE;
			int max_here = 0;
			
			for(int j=0;j<arr.length;j++) {
				
				max_here +=arr[j];
				
				if(max_here>max_so_far)
				{
					max_so_far = max_here;
					end = j;
					start = s;
				}
				else if(max_here<0) {
					max_here = 0;
					s = j+1;
				}
			}
			
			System.out.println(max_so_far + " starting at "+start +" ending at "+end);
			for(int j=start;j<=end;j++) {
				arr[j] = Integer.MIN_VALUE;
			}
		}
		
	}

}
