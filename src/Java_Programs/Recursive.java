package Java_Programs;
public class Recursive {

	public static void main(String[] args) {

		int n = 3;
		System.out.println("Factorial of " + n + " is " + factorial(n));

	}

	static int factorial(int n) {
		if (n == 1)
			return 1;
		else {
			return n * factorial(n - 1);
		}
		

	}
}
