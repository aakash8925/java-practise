package mycodes.arrays;

import java.util.Scanner;

public class StockBuySell {
	public static void main(String[] args) {
		
		int[] array= {7, 1, 5, 3, 6, 4};
		int size = array.length;
		
		int minprice = array[0];
		int maxProfit =0;
		
		for(int i=1 ; i< size; i++) {
			if(array[i] < minprice) {
				minprice = array[i];
			}
			
			int profit = array[i] - minprice;
		    if (profit > maxProfit) {
		        maxProfit = profit;
		    }
		}
		System.out.println(maxProfit);
	}
}
