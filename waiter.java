import java.util.Scanner;
import java.util.Stack;

public class waiter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int Q = input.nextInt();
		Stack<Integer> A0 = new Stack<Integer>();
		Stack<Integer> A1 = new Stack<Integer>();
		Stack<Integer> B1 = new Stack<Integer>();
		for(int i =0; i<N; i++) {
			A0.push(input.nextInt());
			System.out.println("Initial Stack: " + A0);
		}
		for(int i =2; i<=Q; i++) {
			int d = A0.peek();
			System.out.println(d);
			if(d%i == 0) {
				A1.push(d);
			} else {
				B1.push(d);
			}
			System.out.println("Initial Stack: " + A1);
			System.out.println("Initial Stack: " + B1);
		}

	}

}
