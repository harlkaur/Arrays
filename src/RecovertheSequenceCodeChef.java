import java.util.Scanner;

public class RecovertheSequenceCodeChef {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = sc.nextInt();
			}
			recoverTheSequence(arr, n);
			System.out.println();
		}
	}

	private static void recoverTheSequence(int[] arr, int n) {
		int diff = 0;
		if ((arr[1] - arr[0]) == (arr[2] - arr[1])) {
			diff = arr[1] - arr[0];
		} else if ((arr[3] - arr[2]) == (arr[2] - arr[1])) {
			diff = arr[3] - arr[2];
		} else if ((arr[3] - arr[0]) / 3 == (arr[3] - arr[2])) {
			diff = arr[3] - arr[2];
		} else if ((arr[3] - arr[0]) / 3 == (arr[2] - arr[1])) {
			diff = (arr[2] - arr[1]);
		} else if ((arr[3] - arr[0]) / 3 == (arr[1] - arr[0])) {
			diff = (arr[1] - arr[0]);
		}

		for (int i = 0; i < n - 1; i++) {
			if ((arr[i + 1] - arr[i]) != diff) {
				if ((i + 2 < n) && (arr[i + 2] - arr[i + 1] != diff)) {
					// defect is in arr[i+1]
					arr[i + 1] = arr[i] + diff;
				} else if ((i + 1 == n - 1)) {
					// last element is modified
					arr[n - 1] = arr[i] + diff;
				} else {
					arr[i] = arr[i + 1] - diff;
				}
			}
		}

		// printing final array
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

//	private static void recoverTheSequence(int[] arr, int n) {
//		int diff1 = Math.abs(arr[1] - arr[0]);
//		int diff2 = Math.abs(arr[2] - arr[1]);
//		int diff3 = Math.abs(arr[3] - arr[2]);
//		int count1 = 0;
//		int count2 = 0;
//		int count3 = 0;
//
//		for (int i = 0; i < n - 1; i++) {
//			if (arr[i + 1] - arr[i] != diff1) {
//				if(arr[i+1] - arr[i] != diff2) {
//					if(arr[i+1] - arr[i] == diff3) {
//						count3++;
//					}
//				}else {
//					count2++;
//				}
//			}else {
//				count1++;
//			}
//		}
//		
//		if(count3>count2 && count3>count1 && count2>count1) {
//			// defect count is count1, perfect count is count3
//			for(int i=0;i<n-1;i++) {
//				if(arr[i+1]-arr[i] == diff1) {
//					arr[i+1] = arr[i] + diff3; 
//				}
//			}
//		}else if(count3>count2 && count3>count1 && count2<count1) {
//			// defect count is count2 , perefct count is count3
//			for(int i=0;i<n-1;i++) {
//				if(arr[i+1]-arr[i] == diff2) {
//					arr[i+1] = arr[i] + diff3; 
//				}
//			}
//		}
//
//		// printing final array
//		for (int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}
