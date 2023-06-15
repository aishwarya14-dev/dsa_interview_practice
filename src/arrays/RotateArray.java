package arrays;

public class RotateArray {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70};
		rotateArray(arr,3);

	}
	
	public static void rotateArray(int arr[],int k) {
		
	 reverseArray(arr,0,arr.length-1);
	 reverseArray(arr,0,arr.length-k-1);
	 reverseArray(arr,arr.length-k,arr.length-1);	
	 for(int t=0;t<arr.length;t++) {
			System.out.print(arr[t]+" ");
		}
	
	}
	
	public static void reverseArray(int arr[],int start,int end) {		
		int i=start,j=end;
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}	
}

}
