import java.util.Arrays;
import java.util.Scanner;

public class ThreeGreatCancidatesBySorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long[] arr = new long[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			long result = threeGreatCandidates(arr);
			System.out.println(result);
		}
	}

	private static long threeGreatCandidates(long[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		long product = Math.max(arr[n - 1] * arr[n - 2] * arr[n - 3], arr[0] * arr[1] * arr[n - 1]);
		System.out.println(" arr[n - 1]  " + arr[n - 1]);
		System.out.println(" arr[n - 2] " + arr[n - 2]);
		System.out.println("arr[n - 3 ] : " + arr[n - 3]);
		System.out.println("arr[0] " + arr[0]);
		System.out.println("arr[1] " + arr[0]);

		return product;
	}
}
