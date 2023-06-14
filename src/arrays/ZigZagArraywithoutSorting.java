package dsa_interview_practice;

import java.util.Scanner;

public class ZigZagArraywithoutSorting {

	public static void main(String[] args) {
		

		ZigZagArraywithoutSorting ins = new ZigZagArraywithoutSorting();
		Scanner sc = new Scanner(System.in);
		int a[] = { 4,3,7,8,6,2,1 };
		ins.convertIntoZigZag(a);

	}
	
	public void convertIntoZigZag(int a[]) {
		
		for(int i=0;i<a.length-2;i=i+2) {
			
			if(a[i]>a[i+1] && a[i]>a[i+2]) {
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
			else if(a[i+2]>a[i+1] && a[i+2]>a[i]) {
				int temp = a[i+1];
				a[i+1] = a[i+2];
				a[i+2] = temp;
			}
		}
		
		for(int j=0;j<a.length;j++)
			System.out.print(a[j]+" ");
	}
	
	public static void swap(int x , int y) {
		int temp = x;
		x = y;
		y = temp;
	}

}
