package arrays;

public class PetrolBunks {

	public static void main(String[] args) {
		
		int petrol[] = {5,3,12,1,7};
		int distance[] = {8,4,7,4,5};
		int position = findStartingPosition(petrol,distance,5);
		System.out.print(position);

	}
	
	public static int findStartingPosition(int petrol[],int distance[],int noOfStations) {
		
		 float lastRemainingPetrol = 0;
		 int position = 0;
		 float maxRemainingPetrol = Integer.MIN_VALUE;
		 int min_position = 0;
		 
		 while(position < noOfStations) {
			 lastRemainingPetrol += petrol[position] ; 
			 lastRemainingPetrol -= distance[position];
			 position++;
		     
			 if(lastRemainingPetrol > maxRemainingPetrol) {
				 maxRemainingPetrol = lastRemainingPetrol;
				 min_position = position % noOfStations;
			 }
		 }
		 return min_position;
	}

}
