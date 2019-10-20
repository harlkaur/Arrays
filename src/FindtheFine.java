import java.util.Scanner;

public class FindtheFine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int date = sc.nextInt();
			int[] arr = new int[n];
			int penalty[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				penalty[i] = sc.nextInt();
			}
			calculateFine(arr, penalty, date);
		}
	}

	private static void calculateFine(int[] arr, int[] penalty, int date) {
		int fine = 0;
		if (date % 2 == 0) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 != 0) {
					fine += penalty[i];
				}
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0) {
					fine += penalty[i];
				}
			}
		}
		System.out.println(fine);
	}

}
