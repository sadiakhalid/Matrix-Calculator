package unittest;

import static org.junit.Assert.*;
import matrixComputer.Matrix;

import org.junit.Test;

public class MatrixMultiplicationTest {

	@Test
	public void test() {
		Matrix m1 = new Matrix(2,3);
		m1.Data=new int[][]{ {1, 2, 3} , { 4, 5, 6} };
		Matrix m2 = new Matrix(2,3);
		m2.Data=new int[][]{ {7,8} ,{9,10}, {11, 12} };
		m1.matrixMultiplication(m2);
		assertArrayEquals(new int[][]{{58, 64} , {  139, 154}}, m1.Data);
	}

}
