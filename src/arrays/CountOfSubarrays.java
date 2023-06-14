package dsa_interview_practice;

public class CountOfSubarrays {

	public static void main(String[] args) {
		
		CountOfSubarrays ct = new CountOfSubarrays();
		
		int a[] = { 1,3,4,1,2,5 };
		
		ct.countOfSubarrays(a,2);

	}
	
	public void countOfSubarrays(int a[],int k) {
		int n = a.length;
		int totalSubArrays = (n *(n+1))/2;
		int count;
		int countLessThanK =0 ;
		int i=0;
		
		while(i<n)
		{
		   if(a[i]>k)	
		   {
			   i++;
			   continue;
		   }
		   
		   count =0;
		   
		   while(i<n && a[i]<=k) {
			  count ++;
			  i++;
		   }
		  countLessThanK += count * (count+1)/2;	
		}
		
		System.out.print(totalSubArrays - countLessThanK);
	}

}

//count less than k is number of possible subarrays with max element less than or equal to k.