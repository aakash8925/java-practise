package mycodes;

public class CountNumbers2 {
	public static void main(String[] args) {
		int number = 133;
		int og_number = number;
		
		while(number > 0){
			
			int digit = number % 10;
			int count=0;
			int check =0;
			int temp =og_number;
			
			boolean Iscounted = false;
			
			check = number/10;
			
			
			if(!Iscounted) {
				while(temp > 0) {
					if(temp % 10 == digit) {
						count++;
					}
					temp = temp/10;
				}
				System.out.println(digit + "-->" + count);
			}
			
			number = number/10;
		}
	}
}
