import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinimumPlatforms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			ArrayList<Integer> dep = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				arr.add(sc.nextInt());
			}
			for(int i=0;i<n;i++) {
				dep.add(sc.nextInt());
			}
			
			minimumPlatforms(arr, dep);
		}
	}

	private static void minimumPlatforms(ArrayList<Integer> arr, ArrayList<Integer> dep) {
		int internaCount = 1;
		boolean flag = false;
		Collections.sort(arr);
		Collections.sort(dep);
		for (int i = 0; i < arr.size() - 1;) {
			if (arr.get(i + 1) < dep.get(i)) {

				int j = i;
				while (i >= 0) {
					if (arr.get(i + 1) < dep.get(i)) {
//						internaCount++;
						i--;
					} else {
						flag = true;
						i--;
					}
				}
				if (!flag) {
					internaCount++;
				}
				i = j;
				i++;
			} else {
				arr.remove(i);
				dep.remove(i);
			}
//			i++;
		}
		System.out.println(internaCount);
	}

}
