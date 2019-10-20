import java.util.Scanner;

public class Elementwithleftsidesmallerandrightsidegreater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			rearrangeArray(arr);
//			System.out.println();
		}
	}

	private static void rearrangeArray(int[] arr) {
		int n = arr.length;
		boolean flag = false;
		for (int i = n - 1; i >= 0; i--) {
			if ((i-1>=0) && (arr[i - 1] > arr[i])) {
				if ((i + 1) < n - 1) {
					flag = true;
					System.out.println(arr[i + 1]);
					break;
				} 
			}
		}
		if (!flag) {
			System.out.println("-1");
		}
	}

}
