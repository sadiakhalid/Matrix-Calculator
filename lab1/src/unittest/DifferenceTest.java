package unittest;

import static org.junit.Assert.*;
import matrixComputer.Matrix;

import org.junit.Test;

public class DifferenceTest {

	@Test
	public void test() {
		Matrix m1 = new Matrix(2,3);
		m1.Data=new int[][]{ {1, 2, 3} , { 4, 5, 6} };
		Matrix m2 = new Matrix(2,3);
		m2.Data=new int[][]{ {1, 2, 3} , { 4, 5, 6} };
		m1.difference(m2);
		assertArrayEquals(new int[][]{{0, 0, 0} , { 0, 0, 0}}, m1.Data);
	}

}
