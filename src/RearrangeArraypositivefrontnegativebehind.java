
public class RearrangeArraypositivefrontnegativebehind {

	public static void main(String[] args) {
		int[] arr2 = { -47, 1, 4, 49, -18, 10, 26, 18, -11, -38, -24};
		rearrageArray(arr2, arr2.length);
	}

	private static void rearrageArray(int[] arr, int n) {

		int j = 0, temp; 
        for (int i = 0; i < n; i++) { 
            if (arr[i] > 0) { 
                if (i != j) { 
                    temp = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = temp; 
                } 
                j++; 
            } 
        } 
        
        for (int k = 0; k < arr.length; k++) {
    		System.out.print(arr[k] + " ");
    	}
	}

//	private static void rearrageArray(int[] arr, int length) {
//		int i = 0, j = length - 1;
//		for (; i < j; i++, j--) {
//			if (arr[i] < 0 && arr[j] > 0) {
//				int temp = arr[i];
//				arr[i] = arr[j];
//				arr[j] = temp;
//			}
//		}
//		for (int k = 0; k < arr.length; k++) {
//			System.out.print(arr[k] + " ");
//		}
//	}

	
}
