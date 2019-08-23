package demo;

public class ArrayInt {

	private int []arrInt;

	public ArrayInt() {
		
	}
	
	public int[] getArrInt() {
		return arrInt;
	}

	public void setArrInt(int[] arrInt) {
		this.arrInt = arrInt.clone();
	}
	
	public int findElementAppearOneTimeInArray() {
		if (arrInt.length == 0) {
			System.out.println("Array is empty !");
			return 0;
		}
		int element = arrInt[0];
		for (int i = 1; i < arrInt.length; i++) {
			element ^= arrInt[i];
		}
		return element;
	}
	
	public int[] productOfArrayExceptSelf() {
		int length = arrInt.length;
		int[] L = new int[length];
		int[] R = new int[length];
		int[] product = new int[length];

		L[0] = 1;
		for (int i = 1; i < length; i++) {
			L[i] = arrInt[i - 1] * L[i - 1];
		}
		R[length - 1] = 1;
		for (int i = length - 2; i >= 0; i--) {
			R[i] = arrInt[i + 1] * R[i + 1];
		}
		for (int i = 0; i < length; i++) {
			product[i] = L[i] * R[i];
		}
		return product;
	}
	
}
