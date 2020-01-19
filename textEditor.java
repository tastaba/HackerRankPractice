import java.util.Scanner;
import java.util.Stack;

public class textEditor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
        String s = "";
        stack.push(s);
		int q = input.nextInt();
		int n = 0;
		for (int i = 0; i < q; i++) {
			n = input.nextInt();
			if (n == 1) {
				s = s.concat(input.next());
	               System.out.println(s);
	                stack.push(s);
			}
			else if (n == 2) {
					int k = input.nextInt();
					if(s.length()-k!=0) {
						s = s.substring(0, (s.length()-k)-1);
					} else
						s = "";
					System.out.println(s);
					stack.push(s);
				}
			else if (n == 3) {
					int k = input.nextInt();
					System.out.println(s.charAt(k-1));
				} 
			else if (n == 4) {
					stack.pop();
					s= stack.peek();
				}
			}

		}

	}

