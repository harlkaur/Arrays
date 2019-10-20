import java.util.Scanner;

public class EasetheArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			easeArray(arr);
			System.out.println();
		}
	}

	private static void easeArray(int[] arr) {
	    int k = 0;
	    String ans = "";
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				arr[i] = arr[i] * 2;
				arr[i + 1] = 0;
			}
			
			if(arr[i]!=0){
				System.out.print(arr[i] + " ");
				k++;
			}else{
			    ans = ans + "0 ";
			}
		}
		
		if(arr[arr.length-1]!=0){
				System.out.print(arr[arr.length-1] + " ");
				k++;
			}else{
			    ans = ans + "0 ";
			}

        System.out.print(ans);
		
	}

//	private static void easeArray(int[] arr) {
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i] == arr[i + 1]) {
//				arr[i] = arr[i] * 2;
//				arr[i + 1] = 0;
//			}
//		}
//
//		// override the current array with new array with 0's shifted to right
//		int k = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != 0) {
//				k++;
//				System.out.print(arr[i] + " ");
//			}
//		}
//		while (k < arr.length) {
//			System.out.print(0 + " ");
//		}
//	}
	
	

}
