package demo;

public class Moderate1 {

	public int[] moderate1(int[] nums) {

		int length = nums.length;
		/* Initialize three empty arrays with length of given array including 
		 * L (left) array will contain product of all elements to the left
		 * R (right) array will contain product of all elements to the right
		 * product array will contain final product of all elements
		 * */
		int[] L = new int[length];
		int[] R = new int[length];
		int[] product = new int[length];

		/* Initiate first element of L to 1 because there is no element to the left*/
		L[0] = 1;
		/* Determine value of rest elements,L[i] represents product of 
		 * all the elements to the left of element at index i */
		for (int i = 1; i < length; i++) {
			L[i] = nums[i - 1] * L[i - 1];
		}
		/* Initiate first element of R to 1 because there is no element to the right*/
		R[length - 1] = 1;
		/* Determine value of rest elements,R[i] represents product of 
		 * all the elements to the right of element at index i */
		for (int i = length - 2; i >= 0; i--) {
			R[i] = nums[i + 1] * R[i + 1];
		}
		/* Find the product except self as L[i] * R[i] */
		for (int i = 0; i < length; i++) {
			product[i] = L[i] * R[i];
		}
		return product;
	}
}
