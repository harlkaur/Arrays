
public class Checkifarrayissortedandrotated {

	public static void main(String[] args) {
//		int[] arr = { 10, 20, 30, 14 };
		int[] arr  = {30 ,20, 10, 50, 35};
		boolean result = checkRotatedAndSorted(arr, arr.length);
		System.out.println(result);
	}

	public static boolean checkRotatedAndSorted(int arr[], int n) {
		boolean flag = true;
		int min = arr[0];
		int min_pos = 0;
		for (int i = 0; i < arr.length; i++) { // O(n) time complexity
			if (min > arr[i]) {
				min = arr[i];
				min_pos = i;
			}
		}

		if (min_pos == 0)
			return false;

		if (arr[0] > arr[n - 1]) {
			// return flag = false;
			for (int i = 0; i < min_pos - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					return flag = false;
				}
			}

			for (int i = min_pos + 1; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					return flag = false;
				}
			}
		} else {
			for (int i = 0; i < min_pos - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					return flag = false;
				}
			}

			for (int i = min_pos + 1; i < arr.length - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					return flag = false;
				}
			}
		}

		return flag;

	}

}
