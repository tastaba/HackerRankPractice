import java.util.Scanner;

public class HourGlassSum {

	public static int maxSum(int[][] array) {
		int sum = 0;
		int max = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum = array[i][j] + array[i][j + 1] + array[i][j + 2] + array[i + 1][j + 1] + array[i + 2][j]
						+ array[i + 2][j + 1] + array[i + 2][j + 2];
				max = Math.max(sum, max);
			}
		}
		return max;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] array = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				array[i][j] = input.nextInt();
			}
		}
		// Printing the array
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		int max = maxSum(array);
		System.out.println(max);

	}
}