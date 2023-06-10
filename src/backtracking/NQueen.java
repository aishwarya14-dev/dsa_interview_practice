package backtracking;

public class NQueen {
	static int n=4;

	public static void main(String[] args) {
		int board[][] = { { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 } };
		
		solveNQueen(board,0);

	}
	
	public static boolean solveNQueen(int mat[][],int row) {
		
		if(row>=n)
			return true;
		
		for(int col=0;col<n;col++) {        // trying to place the queens in each column for a particular row
			if(isSafe(mat , row , col)) {				
				mat[row][col] = 1;
				if(solveNQueen(mat,row+1))
					return true;
			
				mat[row][col] = 0; //backtracking and continue for loop
			
			}
			
		}
		return false;
	}
	
	public static boolean isSafe(int mat[][], int row,int col) {
		
		for(int i=0;i<row;i++) {   //to check for the above rows
			if(mat[i][col]==1)
				return false;
		}
		
		for(int j=row,k=col;j>=0 && k>=0; j--,k-- ) {  //to check the left diagonal
			if(mat[j][k]==1)
				return false;
		}
		
		for(int j=row,k=col;j>=0 && k<n; j--,k++ ) {  // to check the right diagonal
			if(mat[j][k]==1)
				return false;
		}
		return true;
	}

}
