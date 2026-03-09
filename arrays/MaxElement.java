package mycodes.arrays;


public class MaxElement {
	
	
	public static void main(String[] args) {
		int[] array= {1, 2, 3, 2, 4, 5};
		int size = array.length;
		int maxnum = array[0];
		
		for(int i=0 ; i< size;i++) {
			if(array[i] > maxnum) {
				maxnum = array[i];
			}
		}
		System.out.println(maxnum);
	}
}
