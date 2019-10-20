import java.util.Scanner;

public class MaximumOfSubarraysOfSizeK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
			}
			MaxOfSubarrays(arr, k);
			System.out.println();
		}
	}

	private static void MaxOfSubarrays(long[] arr, int k) {
		int n = arr.length;
		int length = n - k + 1;
		long max = Integer.MIN_VALUE;
		long result[] = new long[length];
		int count = 0;

		for (int i = 0; i < arr.length - k + 1;) {
				max = arr[i];
			for (int j = i; j < i + k - 1; j++) {
				if (max < arr[j + 1]) {
					max = arr[j + 1];
				}

			}
			result[count++] = max;
			i++;
		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
