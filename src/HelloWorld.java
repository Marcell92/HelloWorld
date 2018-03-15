
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello world!"); //first task

		String b = "hello world!"; // assignment

		System.out.println(b); // assignment still

		System.out.println(HelloWorld.method1()); //parameters

		System.out.println(HelloWorld.returntypes());

		System.out.println(method2(5, 6));

		// conditional1
		System.out.println(operators(5, 6, false));

		// conditional2
		System.out.println(lastconditional(0, 8));

		// iteration one
		for (int i = 0; i < 10; i++)

			System.out.println(lastconditional(5, i));

		// array1
		int[] A = { 32, 56, 22, 3, 24, 5, 6, 7, 8, 9 };

		for (int i = 0; i < 10; i++) {

			System.out.println(lastconditional(1, A[i]));
		}
		// ITERATION/ARRAYS
		for (int i = 0; i < 10; i++) {

			System.out.println(A[i]);
		}

		// ITERATION/ARRAYS 2
		int[] B = new int[10];
		for (int i = 0; i < 10; i++) {
			B[i] = A[i] * 10;

			System.out.print(B[i] + ", ");
		}

	}

	public static String method1() { //parameters

		return "Marcell";

	}

	// return types Marcell
	public static String returntypes() {
		return "Hello World";
	}

	// parameters and operators
	public static int method2(int number1, int number2) {

		return number1 + number2;
	}

	// conditionals 1
	public static int operators(int number3, int number4, boolean a) {

		if (a == true) {

			return number3 + number4;
		}

		else {

			return number3 * number4;
		}
	}

	// last conditional or conditional 2
	public static int lastconditional(int number5, int number6) {

		if (number5 == 0) {
			return number6;
		}

		if (number6 == 0) {
			return number5;
		}

		else {
			return number5 + number6;

		}

	}
}
