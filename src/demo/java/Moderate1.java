package demo.java;

public class Moderate1 {

	public int[] moderate1(int[] nums) {
		
		if (nums == null || nums.length == 0) {
			throw new IllegalArgumentException("Array nums must not be empty"); 
		}
		int length = nums.length;
		/* Initialize three empty arrays with length of given array including 
		 * leftArr (left) array will contain product of all elements to the left
		 * rightArr (right) array will contain product of all elements to the right
		 * productArr array will contain final product of all elements
		 * */
		int[] leftArr = new int[length];
		int[] rightArr = new int[length];
		int[] productArr = new int[length];

		/* Initiate first element of leftArr to 1 because there is no element to the left*/
		leftArr[0] = 1;
		/* Determine value of rest elements,leftArr[i] represents product of 
		 * all the elements to the left of element at index i */
		for (int i = 1; i < length; i++) {
			leftArr[i] = nums[i - 1] * leftArr[i - 1];
		}
		/* Initiate first element of rightArr to 1 because there is no element to the right*/
		rightArr[length - 1] = 1;
		/* Determine value of rest elements,rightArr[i] represents product of 
		 * all the elements to the right of element at index i */
		for (int i = length - 2; i >= 0; i--) {
			rightArr[i] = nums[i + 1] * rightArr[i + 1];
		}
		/* Find the productArr except self as leftArr[i] * rightArr[i] */
		for (int i = 0; i < length; i++) {
			productArr[i] = leftArr[i] * rightArr[i];
		}
		return productArr;
	}
}
