import java.util.Scanner;

public class SumOfTwoLargeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String X = sc.next();
			String Y = sc.next();
			sumOfTwoNumbers(X, Y);
		}

	}

	private static void sumOfTwoNumbers(String x, String y) {
		int sum = 0;
		String finalSum = "";
		int carry = 0, i, j;
		for (i = x.length() - 1, j = y.length() - 1; i >= 0 && j >= 0; i--, j--) {
			sum = x.charAt(i) - '0' + y.charAt(j) - '0' + carry;
			carry = sum / 10;
			sum = sum % 10;
			finalSum = sum + finalSum;
		}
		// add remaining digits of the strings which is greater

		while (j>=0) {
			// add remaining digits of y to finalSUm
			sum = y.charAt(j) - '0' + carry;
			carry = sum / 10;
			sum = sum % 10;
			finalSum = sum + finalSum;
			j--;
		}

		while (i>=0) {
			// add remaining digits of x to finalSum
			sum = x.charAt(i) - '0' + carry;
			carry = sum / 10;
			sum = sum % 10;
			finalSum = sum + finalSum;
			i--;
		}

		if (carry > 0) {
			finalSum = carry + finalSum;
		}
		if (finalSum.length() == x.length()) {
			System.out.println(finalSum);
		}
		else 
			System.out.println(x);
	}

}
