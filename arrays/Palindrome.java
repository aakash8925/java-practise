package mycodes.arrays;

public class Palindrome {
	public static void main(String[] args) {
			int[] array = {1, 5, 3, 2, 1};
			
			int left = 0; 
			int right = array.length-1;
			int count =0;
			
			while (left < right) {
				if(array[left] != array[right]) {
					count++;
				}
				left++;
				right--;
			}
			if(count !=0) {
				System.out.println("not A Palindrome");
			}else {
				System.out.println("This Array is palindrome");
			}
			
			
	}
}
