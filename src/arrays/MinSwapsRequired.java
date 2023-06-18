package arrays;

public class MinSwapsRequired {

	public static void main(String[] args) {
		
		int arr[] = {2,7,9,5,8,7,4};
		findMinSwaps(arr,5);
	}
	
	public static void findMinSwaps(int arr[],int k) {
		
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=k)
				count++;
		}
        int min_swaps = 0;
        int countgreaterthank = 0;
        
        for(int i=0;i<count;i++) {
        	if(arr[i]>k)
        		countgreaterthank++;
        }
        
        min_swaps = countgreaterthank;
        
		for(int i=1;i<=arr.length-count;i++) {
		    
			countgreaterthank=0;
			for(int j=i;j<i+count;j++) 
			{
				if(arr[j]>k)
				 countgreaterthank++;
			}
			if(min_swaps>countgreaterthank) {
				min_swaps = countgreaterthank;
			}
			
		}
		
		System.out.print("min swaps "+ min_swaps);
	}

}
