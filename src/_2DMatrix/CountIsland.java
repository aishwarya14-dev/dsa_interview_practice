package _2DMatrix;

public class CountIsland {
	static int r = 7;
	static int c = 7;

	public static void main(String[] args) {
		int mat[][] = {{1,1,0,0,0,1,1},
                { 0,1,0,0,0,1,1 },
                { 0,0,0,0,0,1,0},
                { 0,0,0,0,0,0,0},
                { 0,0,0,0,0,0,0},
                { 1,1,0,0,1,1,0},
                { 0,1,1,0,0,1,0},
                { 0,0,0,0,0,1,0}
		};
		
		countIsland(mat,7,7);

	}
	
	public static void countIsland(int mat[][],int r,int c) {
		int visited[][] = {{0,0,0,0,0,0,0},
                { 0,0,0,0,0,0,0},
                { 0,0,0,0,0,0,0},
                { 0,0,0,0,0,0,0},
                { 0,0,0,0,0,0,0},
                { 0,0,0,0,0,0,0},
                { 0,0,0,0,0,0,0},
                { 0,0,0,0,0,0,0}
		};
        
		int countIsl =0;
		
		for(int i=0;i<r;i++) {
			
			for(int j=0;j<c;j++) {
				
				if(mat[i][j]==1 && !(visited[i][j]==0)) {
					
					visited[i][j] = 1;
					processNeighbours(mat,visited,i,j);
					countIsl++;
				}
			}
		}
		
		System.out.print(countIsl);
		
	}
	
	public static void processNeighbours(int mat[][],int visited[][],int i,int j) {
		
		visited[i][j] = 1;
		int x[] = {0,-1,0,1};
		int y[] = {-1,0,1,0};
		
		for(int k=0;k<x.length;k++) {
			
			int NI= i+x[k];
			int NJ= j+y[k];
			
			if(isSafe(mat,visited,NI,NJ))
				processNeighbours(mat,visited,NI,NJ);
		}
	}
	
	public static boolean isSafe(int mat[][],int visited[][],int I,int J) {
		if(visited[I][J]==0 && mat[I][J]==1 && I<7 && I>=0 && J<7 && J>=0) {
			return true;
		}
		else
			return false;
	}

}
