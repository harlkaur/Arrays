import java.util.Scanner;

public class StockBuyandSell {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			stockBuynSell(arr);
			System.out.println();
		}
	}

	private static void stockBuynSell(int[] arr) {
		int k = 0;
		boolean flag = false;
		String first = null, second = null;
		while (k != arr.length - 1) {
			first = null;
			second = null;
			for (int i = k; i < arr.length - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					// buy stock at index i
					k = i;
					first = "(" + i + " ";
					break;
				}
			}

			int i = k + 1;
			while (i != arr.length - 1) {
				if (arr[i] > arr[i + 1]) {
					k = i + 1;
					// System.out.print(i + ")" + " ");
					second = i + ")" + " ";
					if (first != null && second != null) {
						System.out.print(first + second);
						flag = true;
					}
					break;
				} else
					i++;
			}
			if (i == arr.length - 1) {
				// assuming it has reached end of array and no stock price further is found to
				// be dec.
				// System.out.print(i + ")" + " ");

				second = i + ")" + " ";

				if (first != null && second != null) {
					System.out.print(first + second);
					flag = true;
					k = -1;
					// System.out.println(" k:: " + k);
					return;
				}
				break;
			}

		}

		if (!flag) {
			System.out.print("No Profit");
			return;
		}

	}
}
