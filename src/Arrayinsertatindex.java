
public class Arrayinsertatindex {

	public static void main(String[] args) {
		int size = 6;
		int[] arr = {1,2,3,4,5,0};
		int index = 2;
		int element = 90;
		System.out.println(" Before modifying ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i=arr.length-2;i>=index;i--) {
			arr[i+1] = arr[i];
		}
		arr[index] = element;
		System.out.println(" after ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
