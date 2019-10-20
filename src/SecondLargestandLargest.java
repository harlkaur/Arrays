import java.util.Arrays;

public class SecondLargestandLargest {

	public static void main(String[] args) {
		int[] arr = {2,1,2};
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		int n = arr.length;
		Arrays.sort(arr);
		max = arr[n-1];
		
		for(int i=n-2;i>=0;i--) {
			if(arr[i] != arr[i+1]) {
				max2 = arr[i];
				break;
			}
		}
		
		if(max2 == Integer.MIN_VALUE) {
			max2 = -1;
		}
		
//		for(int i=0;i<arr.length;i++) {
//			if((arr[i] > max2) && (max2 != max)) {
//				max2=arr[i];
//			}else {
//				max2 = -1;
//			}
//		}
		System.out.println(max + " " + max2);
	}

}
