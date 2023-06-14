package arrays;

public class MaxOccuredInteger {

	public static void main(String[] args) {
		
		int l[] = {2,3,1,0};
		int r[] = {20,7,5,4};
		int max = maxOccuredInteger(l,r,4);
		System.out.print(max);

	}
	
	public static int maxOccuredInteger(int left[],int right[],int n) {
		
		int maxn = right[0];
		
		for(int i=1;i<n;i++) {
			if(right[i]>maxn)
				maxn = right[i];
		}
		
		int arr[] = new int[maxn+2];
		
		
		for(int i=0;i<n;i++) {
			arr[left[i]]++; ;
			arr[right[i]+1]--;
		}
		
		
		for(int i=1;i<=maxn;i++) {
			arr[i] = arr[i] + arr[i-1];
		}
		
		int maxVal=0 ;
		for(int j=0;j<maxn;j++) {
			if(arr[j]>maxVal)
				maxVal = arr[j];
		}
		
		return maxVal;
		
	}

}
