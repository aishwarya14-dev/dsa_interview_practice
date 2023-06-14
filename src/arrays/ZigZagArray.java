package dsa_interview_practice;
import java.util.*;

public class ZigZagArray {

	public static void main(String[] args) {
	    
		ZigZagArray ins = new ZigZagArray();
		Scanner sc = new Scanner(System.in);
		int a[] = { 4,3,7,8,6,2,1 };
		ins.convertIntoZigZag(a);
	}
	
	public void convertIntoZigZag(int a[]) {
		
		Arrays.sort(a);
	  
		for(int i=0;i<a.length-2;i=i+2) {
			int temp = a[i+1];
			a[i+1] = a[i+2];
			a[i+2] = temp;
		}
		
		for(int j=0;j<a.length;j++)
			System.out.print(a[j]+" ");
		
	}

}
