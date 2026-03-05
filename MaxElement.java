
public class MaxElement {
	
	
	public static void main(String[] args) {
		int[] array= {1, 2, 3, 4, 4, 5};
		int maxnum= array[0];
		
		for(int i =1 ; i< array.length ; i++) {
			if(array[i] > maxnum) {
				maxnum = array[i];
			}
		}
		System.out.println(maxnum);
	}
}
