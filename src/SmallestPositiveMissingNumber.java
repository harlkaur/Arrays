
public class SmallestPositiveMissingNumber {

	public static void main(String[] args) {
//		int[] arr = { -25, 38, 24, -17, 7, 31, 43, 8, 20, 49, -33, -11, 19, 13, -28, 44, 23, -3, -19, 12, 32, 40, 42, 1,
//				-19, -29, -13, -10, 4, -20, 48 };
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		missingNumber(arr, n);
	}

	private static void missingNumber(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < n;) {
			if (arr[i] <= 0 || arr[i] >= n) {
				i++;
			} else if (arr[i] == (i + 1)) {
				count++;
				i++;
			} 
			while (arr[i] - 1 != i) {
				int temp = arr[arr[i] - 1];
				arr[arr[i] - 1] = arr[i];
				System.out.println(
						"Swapped: " + arr[arr[i] - 1] + " " + temp + " " + arr[i] + "  #################  " + i);
				arr[i] = temp;
				
				i =  arr[i];
				
				if(i <=0 || i>=n)
					break;
				++i;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(arr[0]);
			if (arr[i] - 1 != i) {
				System.out.println(i + 1);
				break;
			}
		}

	}

}
