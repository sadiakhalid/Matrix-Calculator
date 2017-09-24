package unittest;

import static org.junit.Assert.*;
import matrixComputer.Matrix;

import org.junit.Test;

public class ScalarMultiplicationTest {

	@Test
	public void test() {
		Matrix m1 = new Matrix(2,3);
		m1.Data=new int[][]{ {1, 2, 3} , { 4, 5, 6} };
		int no=4;
		int [][]original=m1.Data;
		m1.scalarMultiplication(no);
		assertArrayEquals(new int[][]{{4, 8, 12} , { 16, 20, 24}}, m1.Data);
	}

}
