import java.util.ArrayList;

public class AdjacentPair {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(4);
		int k=3;
		int start=0;
		int end=k-1;
		while(start<=end) {
			int s1 = list.get(start);
			int e1 = list.get(end);
			int temp=s1;
			s1=e1;
			e1=temp;
			s1++;
			e1--;
		}
		
		System.out.println(" printing later ");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
