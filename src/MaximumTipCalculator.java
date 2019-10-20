import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MaximumTipCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int N = sc.nextInt();
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int[] a1 = new int[N];
			int[] b1 = new int[N];
			Pair14 result[] = new Pair14[N];
			for (int i = 0; i < N; i++) {
				a1[i] = sc.nextInt();
			}
			for (int i = 0; i < N; i++) {
				b1[i] = sc.nextInt();
			}
			for (int i = 0; i < N; i++) {
				result[i] = new Pair14(a1[i], b1[i]);
			}
			maximumTip(a1, b1, result, N, X, Y);
		}
	}

	private static void maximumTip(int[] a1, int[] b1, Pair14 result[], int N, int X, int Y) {
		int x = 0;
		int y = 0;
		int maxTip = 0;
		Arrays.sort(result, new Comparator<Pair14>() {
			@Override
			public int compare(Pair14 p1, Pair14 p2) {
			return Math.abs(p2.d) - Math.abs(p1.d);
//				return p2.d-p1.d;
			}
		});
		for (int i = 0; i < N; i++) {
			System.out.println(result[i]);
	    }
//		for (int i = 0, j = 0; i < N && j < N; i++, j++) {
//			if (x <= X && ((a1[i] > b1[j]) || (y > Y))) {
//				x++;
//				maxTip += a1[i];
//			} else if (y <= Y && ((b1[j] >= a1[i]) || (x > X))) {
//				y++;
//				maxTip += b1[j];
//			}
//		}
		
		int counter = 0;
		while(X>0 && Y>0 && counter<N) {
			if(result[counter].d>=0) {
				maxTip += result[counter].i;
				--X;
			}else {
				maxTip += result[counter].j;
				--Y;
			}
			++counter;
		}
		while(X > 0 && counter < N){
	 		  maxTip += result[counter].i;
	 		  --X;
	 		  ++counter;
	 	   }
	  	   while(Y > 0 && counter < N){
	  		maxTip += result[counter].j;
	  		  --Y;
	  		  ++counter;
	  	   }
		System.out.println(maxTip);// 5 /// -2 // -3 // -4
	}

}

class Pair14 {
	int i;
	int j;
	int d;

	Pair14() {

	}

	Pair14(int i, int j) {
		this.i = i;
		this.j = j;
		d = i - j;
	}

	@Override
	public String toString() {
		return "[x=" + i + ", y=" + j + "]";
	}
}

