import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();

			}
			boolean flag = pythagoreanTriplet(arr);
			if (flag)
				System.out.println("Yes");
			else
				System.out.println("No");
		}

	}

	private static boolean pythagoreanTriplet(int[] arr) {
		boolean flag = false;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
			map.put(arr[i], 1);
		}
		// verify the target in map
		for(int i=0;i<arr.length;i++) {
			int target = arr[i];
			for(int j=0;j<arr.length;j++) {
			int a = arr[j];
			if(map.containsKey(target-a)) {
				return flag=true;
			  }
		   }
		}
		
		return flag;
	}

//	private static boolean pythagoreanTriplet(int[] arr) {
//		boolean flag = false;
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = arr[i] * arr[i];
//			map.put(arr[i], 1);
//		}
////		Arrays.sort(arr,Collections.reverseOrder());// 4 9 16 25 36
//		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			int target = arr[i];
//			int left = 0;
//			int right = arr.length - 1;
//			while (left < right) {
//				if (arr[right] + arr[left] == target) {
//					return (flag = true);
//				} else if (arr[left] + arr[right] < target) {
////					right--;
//					left++;
//				} else
////					left++;
//					right--;
//			}
//		}
//		return flag;
//	}

}
