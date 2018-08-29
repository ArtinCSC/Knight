import java.util.Scanner;

public class Knight5x5 {
	static int topRow = 1;
	static int leftCol = 0;
	static int botRow = 4;
	static int rightCol = 3;
	static int index = -1;
	static int n = 0;
	static int bourdN = 1;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] pixMat = new int[5][5];
		KnightFunc(pixMat, 0, 0);
		System.out.println();
	}

	private static void KnightFunc(int[][] k, int row, int col) {

		if (k[row][col] != 0)
			return;
		n++;
		k[row][col] = n;
		if (n == 25) {
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
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (k[i][j] < 10) {
					System.out.print("0" + k[i][j] + " ");
					// input.next();}
				} else {
					System.out.print(k[i][j] + " ");
					// input.next();
				}
				index++;
				if (index == 5) {
					System.out.println();
					index = 0;
				}
			}
		}
	}
}
