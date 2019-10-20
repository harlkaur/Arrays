import java.util.Scanner;

public class DecodeThePatternLookandSaySequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String result = lookAndSaySequence(n);
			System.out.println(result);
		}
	}

	private static String lookAndSaySequence(int n) {
		if (n == 1) {
			return "1";
		}
		if (n == 2) {
			return "11";
		}
		String str = "11";
		for (int i = 3; i <= n; i++) {
			str += "$";
			int len = str.length();
			int count = 1;
			String temp = "";
			char[] arr = str.toCharArray();
			for (int j = 1; j < len; j++) {
				if (arr[j] != arr[j - 1]) {
					temp += count;
					temp += arr[j - 1];
					// reset count
					count = 1;
				} else {
					count++;
				}
			}
			str = temp;
		}
		return str;
	}

}
