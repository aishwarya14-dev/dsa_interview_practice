package arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		
     int a1[] = {-99,1,-99,5,-99,-99,10,-99};
     int a2[] = {3,9,12,14,18};
     mergeSortedArrays(a1,a2);
     for(int i=0;i<a1.length;i++)
    	 System.out.print(a1[i]+" ");
	}
	
	public static void mergeSortedArrays(int a1[],int a2[]) {
		moveFront(a1);
		int j=a2.length-1;
		int i=a1.length-a2.length-1;
		int k=a1.length-1;
		
		while(j>=0 && i>=0) {
			if(a1[i]>a2[j]) {
				a1[k] = a1[i];
				i--;
			}
			else {
				a1[k] = a2[j];
				j--;
			}
			k--;
		}
		
	}
	
	public static void moveFront(int a1[]) {
		int i,j=0;
		for(i=0;i<a1.length;i++) {
			if(a1[i]!=-99) {
				a1[j] = a1[i];
				j++;
			}
		}
	}

}
