
public class Equilibriumpoint {

	public static void main(String[] args) {
		long[] arr = { 1 };
		int result = equilibriumPoint(arr, arr.length);
		System.out.println(result);
	}

	public static int equilibriumPoint(long arr[], int n) {
		int i = 0;
		int j = n - 1;
		long startSum = 0;
		long endSum = 0;
		while (i < j) {
			startSum += arr[i];
			endSum += arr[j];
			i++;
			j--;
			if (startSum == endSum) {
//				System.out.println(i+1);
				return i + 1;
			}
		}
		return -1;
	}
}
