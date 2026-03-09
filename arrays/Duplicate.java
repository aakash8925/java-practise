package mycodes.arrays;


public class Duplicate {
	public static void main(String[] args) {
				
		int[] array= {1, 2, 3, 1, 2, 3};
		int count =0;
		//single duplicate value in a array
		for(int i=0 ; i < array.length ; i++) {
			for(int j=i+1 ; j< array.length ;j++) {
				if(array[i] == array[j] && count == 0) {
				System.out.println(array[i] + "true" + j);
				count++;
				}
				
			}
		}
		
	}
}
