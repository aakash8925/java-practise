package mycodes.arrays;

public class SecondLargeNumber {
	public static void main(String[] args) {
		int[] array = {22, 33, 44, 55, 66};
		
		int size = array.length;
		
		int firstmax=array[0];
		int secondmax=0;
		int thirdmax =0;
		for(int i=0 ; i<size ;i++) {
			if(array[i] > firstmax) {
				thirdmax = secondmax;
				secondmax=firstmax;
				firstmax=array[i];
			}
		}
		System.out.println(thirdmax);
	}
}
