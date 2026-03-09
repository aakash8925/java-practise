package mycodes.arrays;

public class Count {
	static void counteven(int[] array) {
		int count=0;
		int size = array.length;
		
		for(int i = 0 ; i<size ;i++) {
			if (array[i] %2 == 0) {
				count++;
			}
		}
		System.out.println("Count of Even Numbers are: " + count);
	}
	
	static void countodd(int[] array) {
		int count=0;
		int size = array.length;
		
		for(int i = 0 ; i<size ;i++) {
			if (array[i] %2 != 0) {
				count++;
			}
		}
		System.out.println("Count of Odd Numbers are: " + count);
	}
	public static void main(String[] args) {
		int[] array = {1,2, 4, 3, 5, 6, 8, 10, 12};
		
		counteven(array);
		countodd(array);
	}
}
