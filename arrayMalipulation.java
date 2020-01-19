import java.util.Scanner;

public class arrayMalipulation {
	
	static void max(long[] initial) {
		long max = 0;
		for(long i = 0; i< initial.length; i++) {
			if(initial[(int) i]>max) {
				 max = initial[(int) i];
			}
		}
		System.out.println("Max: " + max);
	}
         
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		long n = input.nextLong();
		System.out.println("Enter the value of m:");
		long m = input.nextLong();
		long[] initial = new long[(int) n];
		for(long i = 0; i < n; i++) {
			initial[(int) i] = 0;
			System.out.print(initial[(int) i] + " ");
		}
		System.out.println();
		
		for(long i =0; i<m; i++) {
			long a = input.nextLong();
			long b = input.nextLong();
			long k = input.nextLong();
			for(long j = a-1; j<b; j++) {
				initial[(int) j]+= k;
			}
		}
		
		for(int i=0;i<initial.length;i++) {
			System.out.print(initial[i] + " ");
		}
		System.out.println();
		max(initial);
	}
}
