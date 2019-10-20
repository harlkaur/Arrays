
public class KadaneAlgorithm {

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, -2, 5 };
		int[] arr= {-1, -2, -3, -4};
//		int[] arr = {-2 ,5 ,-1};
//		int result = maxSubarraySum(arr, arr.length);
		int result = maxSum(arr, arr.length);
		System.out.println(result);
	}

	static int maxSubarraySum(int arr[], int n) {
		int max_so_far = 0, max_initialization = 0;
		for (int i = 0; i < n; i++) {
			max_initialization += arr[i];
			if(max_initialization < 0) {
				max_initialization = 0;
			}
			if(max_initialization > max_so_far) {
				max_so_far = max_initialization;
			}
		}
		if(max_so_far == 0) {
			max_so_far = arr[0];
		}
		
		return max_so_far;
	}


// OPTIMIZED APPROACH
  static int maxSum(int arr[], int n) {
	  int max = arr[0], max_1  = arr[0];
	  for(int i = 1;i<n;i++) {
		  max_1 = (max_1>0)? max_1+arr[i]:arr[i];
		  max = max_1>max ? max_1:max;
	  }
	  return max;
  }

}