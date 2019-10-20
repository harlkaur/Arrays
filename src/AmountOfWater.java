import java.util.Scanner;

public class AmountOfWater {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = sc.nextInt();
			}
			amountOfWater(arr);
		}
	}

	private static void amountOfWater(int[] arr) {
		int n = arr.length;
		int[] leftMax = new int[n];
		leftMax[0] = arr[0];
		int[] rightMax = new int[n];
		rightMax[n - 1] = arr[n - 1];
		for (int i = 1; i < n; i++) {
			leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
		}
		for (int i = n - 2; i >= 0; i--) {
			rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
		}
		int units = 0;
		for (int i = 0, j = 0; i < leftMax.length && j < rightMax.length; i++, j++) {
			units = units + Math.abs((Math.min(leftMax[i], rightMax[i])) - arr[i]);
		}
		System.out.println(units);
	}

}
