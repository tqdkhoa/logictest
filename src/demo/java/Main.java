package demo.java;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
 		//QUESTION EASY#1
		System.out.println("QUESTION EASY#1");
		int []easyNums = {-1, 2, 4, 2, -1};
		System.out.println("Easy1 Input: " + Arrays.toString(easyNums));
		Easy1 easyProg = new Easy1();
		int num = easyProg.easy1(easyNums);
		System.out.println("Element appear only once in array: " + num);

 		//QUESTION MODERATE#1
		System.out.println("QUESTION MODERATE#1");
		int []moderateNums = {1, 2, 3, 4};
		System.out.println("Moderate1 Input: " + Arrays.toString(moderateNums));
		Moderate1 moderateProg = new Moderate1();
		int[] productArr = moderateProg.moderate1(moderateNums);
		System.out.println("Product of array: " + Arrays.toString(productArr));
	}

}
