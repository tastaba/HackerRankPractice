import java.util.Scanner;
import java.util.Stack;

public class count {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		int[] cyl1 = new int[n1];
		int[] cyl2 = new int[n2];
		int[] cyl3 = new int[n3];
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for (int i = 0; i < n1; i++) {
			cyl1[i] = input.nextInt();
			System.out.println("Initial Cylinder 1: " + cyl1[i]);
			sum1 += cyl1[i];
			System.out.println("Sum of Cylinder 1: " + sum1);
		}
		for (int i = 0; i < n2; i++) {
			cyl2[i] = input.nextInt();
			System.out.println("Initial Cylinder 2: " + cyl2[i]);
			sum2 += cyl2[i];
			System.out.println("Sum of Cylinder 2: " + sum2);
		}
		for (int i = 0; i < n3; i++) {
			cyl3[i] = input.nextInt();
			System.out.println("Initial Cylinder 3: " + cyl3[i]);
			sum3 += cyl3[i];
			System.out.println("Sum of Cylinder 3: " + sum3);
		}
		while (true) {
			if (sum1 == sum2 && sum2 == sum3) {
				System.out.println("Max: " + sum1);
				break;
			}
			for (int j = 0; j < cyl1.length; j++) {
				if (sum1 > sum2 || sum1 > sum3) {
					sum1 -= cyl1[j];
				}
			}
			for (int j = 0; j < cyl2.length; j++) {
				if (sum2 > sum3 || sum2 > sum1) {
					sum2 -= cyl2[j];
				}
			}
			for (int j = 0; j < cyl3.length; j++) {
				if (sum3 > sum2 || sum3 > sum1) {
					sum3 -= cyl1[j];
				}
			}
			int max1 = Math.max(sum1, sum2);
			int result = Math.max(max1, sum3);
			System.out.println("result: " + result);
			break;

		}

	}
}