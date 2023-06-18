package arrays;

import java.util.Arrays;

public class ChocolateDistribution {

	public static void main(String[] args) {
		
		int arr [] = {1,3,4,7,9,9,12,56};
		chocolateDistribution(arr,5);
	}
	
	public static void chocolateDistribution(int packets[],int children) {
		
		Arrays.sort(packets);
		int min_dif = Integer.MAX_VALUE;
				
			for(int first=0;first<packets.length-children;first++) {
				
				int lastpacket = first+children;
				
				int dif = packets[lastpacket-1] - packets[first];
				
				if(dif<min_dif) {
					
					min_dif = dif;
				}
			}	
			
			System.out.print("min difference is: "+ min_dif);
	}

}
