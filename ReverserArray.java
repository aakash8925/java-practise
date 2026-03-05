package mycodes.arrays;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] ogarray= {1, 2, 3, 4, 5};
		int[] array = new int[5];
		
		
		
//		int temp = array[start];
		int j= ogarray.length-1;
		
		for(int i =0 ; i<array.length ; i++) {
			array[i] = ogarray[j];
			j--;
			
		}
		
		for(int n : array) {
			System.out.print(n + " ");
		}
	}

}
