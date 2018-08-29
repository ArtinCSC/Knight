import java.util.Scanner;

public class Knight8x8 {
	static int topRow = 1;
	static int leftCol = 0;
	static int botRow = 7;
	static int rightCol = 6;
	static int index = -1;
	static int n = 0;
	static int bourdN = 1;

	public static void main(String[] args) {

		int[][] pixMat = new int[8][8];
		KnightFunc(pixMat, 0, 0);
		System.out.println();
	}

	private static void KnightFunc(int[][] k, int row, int col) {

		if (k[row][col] != 0)
			return;
		n++;
		k[row][col] = n;
		if (n == 64) {
			arrayPrinter(k);
			System.out.println();
			System.out.println("Bourd Number: " + bourdN);
			bourdN++;
			System.out.println();
		}
		if (row < botRow && col < rightCol)
			KnightFunc(k, row + 1, col + 2);
		if (row < rightCol && col < botRow)
			KnightFunc(k, row + 2, col + 1);
		if (row < rightCol && col > leftCol)
			KnightFunc(k, row + 2, col - 1);
		if (row < botRow && col > topRow)
			KnightFunc(k, row + 1, col - 2);
		if (row > leftCol && col > topRow)
			KnightFunc(k, row - 1, col - 2);
		if (row > topRow && col > leftCol)
			KnightFunc(k, row - 2, col - 1);
		if (row > topRow && col < botRow)
			KnightFunc(k, row - 2, col + 1);
		if (row > leftCol && col < rightCol)
			KnightFunc(k, row - 1, col + 2);

		k[row][col] = 0;
		n--;
	}

	private static void arrayPrinter(int[][] k) {
		int index = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (k[i][j] < 10)
					System.out.print("0" + k[i][j] + "  ");
				else
					System.out.print(k[i][j] + "  ");
				index++;
				if (index == 8) {
					// System.out.println();
					index = 0;
					System.out.println();
				}

			}

		}
	}
}
