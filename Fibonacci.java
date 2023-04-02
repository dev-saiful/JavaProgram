
import java.util.Scanner;



class Fibonacci {

	
	static int fib(int n)
	{
		// Base Case
		if (n <= 1)
			return n;

		// Recursive case
		return fib(n - 1)
			+ fib(n - 2);
	}

	
	public static void
	main(String args[])
	{
		
		int N;
                 Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        N = sc.nextInt();

		
		for (int i = 0; i < N; i++) {

			System.out.print(fib(i) + " ");
		}
	}
}
