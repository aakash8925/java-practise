package mycodes.arrays;

public class Median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int[] mergedarray = new int[nums1.length + nums2.length];
    	int size = mergedarray.length;
    	
    	System.arraycopy(nums1, 0, mergedarray, 0, nums1.length);
    	
    	System.arraycopy(nums2, 0, mergedarray, nums1.length, nums2.length);
    	
    	if(size %2 ==1) {
    		return mergedarray[size / 2];
    	}else {
    		int mid1 = mergedarray[(size-1 )/ 2];
    		int mid2 = mergedarray[size / 2];
    		return (double)(mid1 + mid2)/2;
    	}
    }
    
    
    public static void main(String[] args) {
    	int[] array1 = {1, 2, 3};
    	int[] array2 = {4, 5, 6};
    	
    	System.out.println(findMedianSortedArrays(array1, array2));
    }
}
