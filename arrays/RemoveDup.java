package mycodes.arrays;

public class RemoveDup {
	public static void main(String[] args) {
		int[] dupnums= {1, 2, 3, 4, 4, 5};
		
		for (int i = 0 ; i< dupnums.length;i++) {
			for(int j=1 ; j< dupnums.length-1 ; j++) {
				if(dupnums[i] == dupnums[j]) {
					
				}
			}
		}
		
		for(int num : dupnums) {
			System.out.print(num);
		}
	}
}
