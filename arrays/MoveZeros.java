package mycodes.arrays;

public class MoveZeros {
	public static void main(String[] args) {
		
		int[] array= {0,1,0,3,12};
		int[] newarray = new int[array.length];
		int index = 0;
		
		for(int i=0 ; i<array.length ; i++) {
			if(array[i] != 0) {
				newarray[index]=array[i];
				index++;
			}
		}
		
		for(int n : newarray) {
			System.out.print(n + " ");
		}
	}
}
