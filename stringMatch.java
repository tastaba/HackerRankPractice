import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class stringMatch {

	static int matchingStrings(String[] search, String s) {
		int count = 0;
		for (int i = 0; i < search.length; i++) {
				if (s.equals(search[i])) {
					count++;
					//System.out.println(count);
				}
		}

		return count;
	}
	
	 static void answerQueries(String[] search, String[] queries) 
	    { 
	        for (int i=0;i<queries.length; i++) 
	            System.out.print(matchingStrings(search, queries[i]) + " "); 
	    } 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] search = new String[n];
		for (int i = 0; i < n; i++) {
			search[i] = input.next();
			//System.out.println(search[i] + " ");
		}
		int q = input.nextInt();
		String[] queries = new String[q];
		for (int j = 0; j < q; j++) {
			queries[j] = input.next();
			//System.out.println(queries[j] + " ");
		}
		answerQueries(search, queries);
	}

}
