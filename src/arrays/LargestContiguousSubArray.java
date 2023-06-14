package dsa_interview_practice;

public class LargestContiguousSubArray {

	public static void main(String[] args) {
		int arr[] = { 1, -2, -6, 3, -1, 2,4,8,-12 };
		   
		largestContiguousSubArray(arr);
		

	}
	
	public static void largestContiguousSubArray(int a[]) {
		int sum=0, maxsum=0;
		
		for(int i=0;i<a.length;i++) {
			sum += a[i];
			if(sum>maxsum)
				maxsum = sum;
			
			if(sum<0)
				sum=0;
		}
		System.out.println(maxsum);
	}

}
