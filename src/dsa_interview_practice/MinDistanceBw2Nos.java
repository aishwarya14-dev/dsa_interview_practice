package dsa_interview_practice;

public class MinDistanceBw2Nos {

	public static void main(String[] args) {
		int arr[] = {3,5,4,2,6,5};
		int x = 3;
		int y = 6;
		int min = minDist(arr,x,y);
		System.out.print(min);

	}
	
	static int minDist(int arr[] ,int x , int y) {
		int prev=0 , min_dist = Integer.MAX_VALUE ;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == x || arr[i]==y) {
				if(arr[prev] != arr[i] && (i-prev)<min_dist) {
					min_dist = i-prev;
				}
				prev = i;
			}
		}
		return min_dist;
	}

}
