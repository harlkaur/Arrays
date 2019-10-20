import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class FourElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int target = sc.nextInt();
		fourElements(arr, target);
		}
	}

	private static void fourElements(int[] arr, int target) {
		Arrays.sort(arr);
		HashMap<Integer,Pair3> map = new HashMap<Integer,Pair3>();
		boolean flag = false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				int sum = arr[i]+arr[j];
				if((target-sum)>=0) {
					map.put(target-sum, new Pair3(i,j));
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				int sum = arr[i]+arr[j];
				if((map.containsKey(sum)) ) {
					// verify for Pair values of i and j
					Pair3 pair = map.get(sum);
					if((pair.i != i && pair.j != j) && (pair.i != j && pair.j != i)) {
					flag = true;
					break;
					}
				}
			}
		}
		if(flag) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}

class Pair3{
	int i;
	int j;
	
	Pair3(int i,int j){
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "Pair3 [i=" + i + ", j=" + j + "]";
	}
	
}