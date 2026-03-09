package mycodes.arrays;

import java.util.Scanner;

public class ReverseArray {
	
	static void Reverse(int[] array) {
		int left =0;
		int right=array.length-1;
		int temp=0;
		
		while(left < right) {
			temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			
			left++;
			right--;
			
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array= {1, 2, 3, 4, 5};
		int size = array.length;
		int j=size-1;
		
		int[] newarray = new int[size];

		for(int i=0 ; i<size ; i++) {
			newarray[j] = array[i];
			j--;
		}
		
		for(int n : newarray) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		int[] array2= {1, 2, 3, 4, 5};
		Reverse(array2);
		
		for(int n : array2) {
			System.out.print(n + " ");
		}	}

}
