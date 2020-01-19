import java.util.Scanner;
import java.util.Stack;

public class poisonousPlants {
	public static void daysCount(int[] array) {
		int num_deaths = 1;
		int day = 0;
		if (num_deaths > 0) {
			num_deaths = 0;
			day++;
			for (int i = array.length - 1; i >= 0; i--) {
				if (array[i] > array[i - 1]) {
					num_deaths++;
					System.out.println(num_deaths);
					Stack<Integer> resizedArray = new Stack<Integer>();
					while (resizedArray.size() > 0 && resizedArray.peek() > array[i]) {
						resizedArray.pop();
						resizedArray.push(array[i--]);
					}
				}
			}
			System.out.print("Days: " + day);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int pesticide[] = new int[n];
		for (int i = 0; i < n; i++) {
			pesticide[i] = input.nextInt();
		}
		daysCount(pesticide);
	}
}
