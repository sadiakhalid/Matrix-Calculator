package unittest;

import static org.junit.Assert.*;
import matrixComputer.Matrix;

import org.junit.Test;

public class SumTest {

	@Test
	public void test() {
		Matrix m1 = new Matrix(2,3);
		m1.Data=new int[][]{ {1, 2, 3} , { 4, 5, 6} };
		Matrix m2 = new Matrix(2,3);
		m2.Data=new int[][]{ {1, 2, 3} , { 4, 5, 6} };
		m1.sum(m2);
		assertArrayEquals(new int[][]{{2, 4, 6} , { 8, 10, 12}}, m1.Data);
	}

}
