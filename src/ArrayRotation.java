
public class ArrayRotation {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
//		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		// rotateArr(arr, 3, arr.length);
		rotate(arr, 2, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// FIRST WAY
	static void rotateArr(int arr[], int d, int n) {
		int[] temp = new int[d];
		int s = 0;
		while (s != d) {
			temp[s] = arr[s];
			s++;
		}
		int i = 0;
		for (; i < (n - d); i++) {
			arr[i] = arr[i + d];
		}

		int k = 0;
		while (k <= temp.length - 1) {
			arr[i++] = temp[k];
			k++;
		}
	}

	// SECOND WAY
	static void rotate(int arr[], int d, int n) {
		int i = 0;
		while (i < d) {
			int temp = arr[0];
			int j = 0;
			for (; j < n - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = temp;
			i++;
		}
	}

}
