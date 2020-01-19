import java.util.Scanner;
import java.util.Stack;

public class balancedBrackets {
	public static boolean check(String brackets) {
		if ((brackets.length() % 2) == 1)
			return false;
		else {
			Stack<Character> s = new Stack<>();
			for (char bracket : brackets.toCharArray())
				switch (bracket) {
				case '{':
					s.push('}');
					break;
				case '(':
					s.push(')');
					break;
				case '[':
					s.push(']');
					break;
				default:
					if (s.isEmpty() || bracket != s.peek()) {
						return false;
					}
					s.pop();
				}
			return s.isEmpty();
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for (int i = 0; i < N; i++) {
			String brackets = input.next();
			boolean answer = check(brackets);
			if (answer) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
