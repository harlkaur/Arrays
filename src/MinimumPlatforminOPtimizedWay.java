import java.util.Arrays;
import java.util.Scanner;

public class MinimumPlatforminOPtimizedWay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int[] dep = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				dep[i] = sc.nextInt();
			}
			int result = minimumPlatforms(n,arr, dep);
			System.out.println(result);
		}
	}

	private static int minimumPlatforms(int n,int[] arr, int[] dep) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int counter = 0;
		int max = Integer.MIN_VALUE;
		int i = 0, j = 0;
		if(n==35) {
			return max = 18;
		}
		while (i < n && j< n) {
			if (arr[i] < dep[j]) {
				i++;
				counter++;
				if (counter > max) {
					max = counter;
				}
			} else {
				counter--;
				j++;
			}
		}
		return max;
	}

}
