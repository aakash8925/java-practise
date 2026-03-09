package mycodes.arrays;

public class MinElement {
	public static void main(String[] args) {
		int[] array= {1, 2, 3, 2, 0, 5};
		int size = array.length;
		int minnum = array[0];
		
		for(int i=1 ; i< size;i++) {
			if(array[i] < minnum) {
				minnum = array[i];
			}
		}
		System.out.println(minnum);
	}
}
