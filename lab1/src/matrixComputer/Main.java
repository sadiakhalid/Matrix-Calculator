package matrixComputer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Matrix m1 = getNewMatrix();
		//Matrix m2=getNewMatrix();
		
		//System.out.print("Enter scalar no:");
		//int no=sc.nextInt();
		//m1.scalarMultiplication(no);
		
		//m1.matrixMultiplication(m2);
		//m1.sum(m2);
		//m1.difference(m2);
		//m1.transpose();
		m1.inverse();
		m1.print();
	}

	public static Matrix getNewMatrix() {

		Scanner sc = new Scanner(System.in);
		int r = 0, c = 0;
		System.out.print("Enter rows of matrix:");
		r = sc.nextInt();
		System.out.print("\nEnter columns of matrix:");
		c = sc.nextInt();
		sc.nextLine();
		Matrix m1 = new Matrix(r, c);
		System.out.println("\n Enter values on a single line, values separated by space:");
		String input=sc.nextLine();
		String []inp=input.split(" ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				m1.Data[i][j]=Integer.parseInt(inp[(c*i)+j]);
			}
		}
		return m1;
	}

}
