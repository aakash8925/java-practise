package mycodes.arrays;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {2,7,11,53,72,22};
		
		int target = 75;
		
		for(int i =0 ; i< nums.length ; i++) {
			for(int j= i+1 ; j < nums.length ; j++) {
				if(nums[i] + nums[j] == target) {
					System.out.println("Output is: [" + i + "," + j +"]" );
				}
			}
		}
	}

}
