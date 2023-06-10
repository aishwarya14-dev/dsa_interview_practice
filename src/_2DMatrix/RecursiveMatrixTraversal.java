package _2DMatrix;

public class RecursiveMatrixTraversal {
	
	static int R = 4;
	static int C = 4;

	public static void main(String[] args) {
		int mat[][] = { { 0, 1, 2, 3 },
                { 4, 5, 6, 7 },
                { 8, 9, 10, 11 },
                { 12, 13, 14, 15 } };
		
		traverseMatrixRecursively(mat,0,0);
	}
	
	public static void traverseMatrixRecursively(int mat[][],int i,int j) {
		if(j==C)
		{
			j=0;
			i++;
		}
		
		if(i==R)
			return;
		
		System.out.print(mat[i][j]+" ");
		traverseMatrixRecursively(mat,i,j+1);
		
	}

}
