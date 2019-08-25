package demo;

public class Easy1 {

	public int easy1(int []nums) {
		if (nums == null || nums.length == 0) {
			throw new IllegalArgumentException("Array nums must not be empty"); 
		}
		/* We XOR all the elements in array, all the elements which are 
		 * repeated twice will become 0 and remaining will the element 
		 * which is appearing only once*/
		int element = nums[0];
		for (int i = 1; i < nums.length; i++) {
			element ^= nums[i];
		}
		return element;
	}
}
