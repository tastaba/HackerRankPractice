import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class stack {
	static void queryOne(Stack<Integer> STACK, int x) {
		STACK.push(x);
		System.out.println("Initial Stack: " + STACK);
	}
	
	static void queryTwo(Stack<Integer> STACK) {
		STACK.pop();
		System.out.println("Final Stack: " + STACK);
	}
	
	static void queryThree(Stack<Integer> STACK) {
		int max = (int) Collections.max(STACK);
		System.out.println("max element: " + max);
	}

	public static void main(String[] args) {
		int queryNum;
		Scanner input = new Scanner(System.in);
		Stack<Integer> STACK = new Stack<Integer>();
		int N = input.nextInt();
		for(int i = 0; i<N; i++) {
			queryNum = input.nextInt();
		
if(queryNum==1) {
	int x = input.nextInt();
	queryOne(STACK, x);
}

if(queryNum==2) {
	queryTwo(STACK);
}
if(queryNum==3) {
	queryThree(STACK);
}
		}
	}

}
