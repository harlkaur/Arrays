import java.util.Arrays;
import java.util.Scanner;

public class ThreeGreatCandidates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			long result = threeGreatCandidates(arr);
			System.out.println(result);
		}
	}

	private static long threeGreatCandidates(int[] arr) {
		long max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE,
				min2 = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max1) {
				max3 = max2;
				max2 = max1;
				max1 = arr[i];
			} else if (arr[i] > max2) {
				max3 = max2;
				max2 = arr[i];
			} else if (arr[i] > max3) {
				max3 = arr[i];
			}
			if (arr[i] < min1) {
				min2 = min1;
				min1 = arr[i];
			} else if (arr[i] < min2) {
				min2 = arr[i];
			}
		}
		return Math.max(max1 * max2 * max3, min1 * min2 * max1);
	}

}
