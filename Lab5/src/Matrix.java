
public class Matrix {
	
	private int[][] matrix;
	private final int NUMROW;
	private final int NUMCOL;
	
	public Matrix(int[][] m) {
		NUMROW = m.length;
		NUMCOL = m[0].length;
		matrix = m;
	}
	
	//print matrix as string
	public String toString() {
		String output = "[";
		
		//iterate through matrix and add to output
		for (int i = 0; i < NUMROW;i++) {
			for (int j = 0; j< NUMCOL; j++) {
				output += matrix[i][j]+", ";
			}
			output = output.substring(0,output.length()-2) + "\n";
		}
		output = output.substring(0,output.length()-1);
		output += "]";
		return output;
	}
	
	//returns transposed matrix
	public Matrix transposeMatrix() {
		int[][] tmpMatrix = new int[NUMCOL][NUMROW];
		for (int i = 0; i < NUMROW; i++) {
			for (int j = 0; j < NUMCOL; j++) {
				tmpMatrix[j][i] = matrix[i][j];
			}
		}
		Matrix m = new Matrix(tmpMatrix);
		return m;
		
	}
	
	//returns boolean to check if NxN matrix
	public boolean isSquareMatrix() {
		return NUMROW == NUMCOL;
	}
	
	//returns matrix rotated 90 degrees clockwise
	public Matrix rotateClockwise() {
		int[][] tmpMatrix = new int[NUMCOL][NUMROW];
		for (int i = NUMROW; i > 0; i--) {
			for (int j = 0; j < NUMCOL; j++) {
				tmpMatrix[NUMROW - i][j] = matrix[i][j];
			}
		}
		
		Matrix m = new Matrix(tmpMatrix);
		return m;
	}
	
	//add 2 matrix of equal dimensions
	public Matrix add(Matrix m) {
		int[][] tmpMatrix = new int[NUMROW][NUMCOL];
		if (m.NUMCOL == NUMCOL && m.NUMROW == NUMROW) {
			for (int i = 0; i < NUMROW; i++) {
				for (int j = 0; j < NUMCOL; j++) {
					tmpMatrix[i][j] = matrix[i][j] + m.matrix[i][j];
				}
			}
			
		}
		//throw exception if dimensions do not match
		else {
			throw new RuntimeException("Matrix Dimensions not equal");
		}
		Matrix newM = new Matrix(tmpMatrix);
		return newM;
	}
	
	//multiply matrix with matrix m
	public Matrix multiply(Matrix m) {
		
		//throw exception if product is undefined
		if (NUMCOL != m.NUMROW) {
			throw new RuntimeException("Matrix columns and rows to not match");
		}
		int[][] tmpMatrix = new int[NUMROW][m.NUMCOL];
		for (int i = 0; i < NUMROW; i++) {
			for (int j = 0; j < m.NUMCOL; j++) {
				for (int k = 0; k < NUMCOL; k++) {
					tmpMatrix[i][j] += matrix[i][k] * m.matrix[k][j];
				}
			}
		}
		Matrix newM = new Matrix(tmpMatrix);
		return newM;
	}
	

}



