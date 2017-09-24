package matrixComputer;

public class Matrix {
	public int[][] Data;

	public Matrix(int r, int c) {
		// TODO Auto-generated constructor stub
		Data = new int[r][c];
	}

	public void scalarMultiplication(int no) {
		// TODO Auto-generated method stub

		int r = Data.length;
		int c = Data[0].length;
		int[][] data = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				data[i][j] = no * Data[i][j];
			}
		}
		Data = data;
	}

	public void matrixMultiplication(Matrix m2) {
		int r = Data.length;
		int c = Data[0].length;
		int r2 = m2.Data.length;
		int c2 = m2.Data[0].length;
		if (c != r2) {
			System.out.println("Matrix are not compatible");
			return;
		}
		int[][] data = new int[r][c2];
		int sum = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c2; j++) {
				for (int k = 0; k < c; k++) {
					data[i][j] = data[i][j] + Data[i][k] * m2.Data[k][j];
				}
			}
		}
		Data = data;

	}

	public void sum(Matrix m2) {

		int r = Data.length;
		int c = Data[0].length;
		int r2 = m2.Data.length;
		int c2 = m2.Data[0].length;
		if (r != r2 || c != c2) {
			System.out.println("Matrix are not compatible");
			return;
		}
		int[][] data = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				data[i][j] = Data[i][j] + m2.Data[i][j];
			}
		}
		Data = data;

	}

	public void difference(Matrix m2) {
		// TODO Auto-generated method stub

		int r = Data.length;
		int c = Data[0].length;
		int r2 = m2.Data.length;
		int c2 = m2.Data[0].length;
		if (r != r2 || c != c2) {
			System.out.println("Matrix are not compatible");
			return;
		}
		int[][] data = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				data[i][j] = Data[i][j] - m2.Data[i][j];
			}
		}
		Data = data;
	}

	public void transpose() {
		// TODO Auto-generated method stub
		int r = Data.length;
		int c = Data[0].length;
		int[][] data = new int[c][r];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				data[j][i] = Data[i][j];
			}
		}
		Data = data;

	}

	public void inverse() {
		// TODO Auto-generated method stub
		int r = Data.length;
		int c = Data[0].length;
		if (r != c) {
			System.out.println("Matrix is not compatible");
			return;
		}
		int[][] data = new int[c][r];
		int det=0;
		for(int i = 0; i < c; i++)
	        det = det + (Data[0][i] * (Data[1][(i+1)%c] * Data[2][(i+2)%c] - Data[1][(i+2)%c] * Data[2][(i+1)%c]));
		

		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++)
				data[i][j]=(((Data[(j+1)%c][(i+1)%c] * Data[(j+2)%c][(i+2)%c]) - (Data[(j+1)%c][(i+2)%c] * Data[(j+2)%c][(i+1)%c]))/ det) ;
			
		}
		Data = data;
	}

	public void print() {
		int r = Data.length;
		int c = Data[0].length;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(Data[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
