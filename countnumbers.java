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


//working code

public class CountNumbers {
	public static void main(String[] args) {
		
        int num = 123;
        int original = num;
        
        while (num > 0) {

            int digit = num % 10;
            int temp = original;
            int count = 0;
            boolean alreadyCounted = false;

            // Check if digit already processed
            int check = num / 10;
            while (check > 0) {
                if (check % 10 == digit) {
                    alreadyCounted = true;
                    break;
                }
                check = check / 10;
            }
            
            if (!alreadyCounted) {
                // Count occurrences
                while (temp > 0) {
                    if (temp % 10 == digit) {
                        count++;
                    }
                    temp = temp / 10;
                }

                System.out.println(digit + " -> " + count);
            }
            
            num = num / 10;
        }
    }
}
