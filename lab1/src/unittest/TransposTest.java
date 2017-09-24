package unittest;

import static org.junit.Assert.*;
import matrixComputer.Main;
import matrixComputer.Matrix;

import org.junit.Test;

public class TransposTest {

	@Test
	public void test() {
		Matrix m1 = new Matrix(2,3);
		m1.Data=new int[][]{ {1, 2, 3} , { 4, 5, 6} };
		int [][]original=m1.Data;
		m1.transpose();
		assertArrayEquals(new int[][]{{1,4},{2,5},{3,6}}, m1.Data);
	}

}
