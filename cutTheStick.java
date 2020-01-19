import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

class cutTheStick {

	public static void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
			for (int i1 = 0; i1 < array.length; i1++) {
				System.out.print(array[i1] + " ");
			}
			System.out.println("\n");
		}
		solve(array);
	}

	public static void solve(int[] array) {
		do {
		int min = array[0];
		int count = 0;
		for(int i =0; i<array.length; i++) {
			array[i] = array[i] - min;
			count++;
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
		System.out.print(count);
		System.out.println("\n");
		
		List<Integer> resizedArray = new LinkedList<Integer>();
		for(int i = 0; i<array.length; i++) {
			if(array[i]!=0) {
				resizedArray.add(array[i]);
			}
		}
		int[] temp = new int[resizedArray.size()];
		for(int i =0; i<resizedArray.size(); i++) {
			temp[i] = resizedArray.get(i);
			System.out.print(temp[i] + " ");
		}
		System.out.println("\n");
		array=temp;
	} while(array.length>0);
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		sort(arr);
	}
}