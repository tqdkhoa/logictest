package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public int findElementAppearOneTimeInArray(int[] arrInt) {
		if (arrInt.length == 0) {
			System.out.println("Array is empty !");
			return 0;
		}
		int xor = arrInt[0];
		for (int i = 1; i < arrInt.length; i++) {
			xor ^= arrInt[i];
		}
		return xor;
	}

	public int[] productOfArrayExceptSelf(int[] nums) {
		int length = nums.length;
		int[] L = new int[length];
		int[] R = new int[length];
		int[] answer = new int[length];

		L[0] = 1;
		for (int i = 1; i < length; i++) {
			L[i] = nums[i - 1] * L[i - 1];
		}
		R[length - 1] = 1;
		for (int i = length - 2; i >= 0; i--) {
			R[i] = nums[i + 1] * R[i + 1];
		}
		for (int i = 0; i < length; i++) {
			answer[i] = L[i] * R[i];
		}
		return answer;
	}

	private int[] parseInputValue(String input) {
		int[] values = {};
		String[] arrNameValue = input.split("=");
		String[] arrVal = arrNameValue[1].split(",");
		values = new int[arrVal.length];
		for (int i = 0; i < arrVal.length; i++) {
			values[i] = Integer.valueOf(arrVal[i].trim());
		}
		return values;
	}

	public void main(String[] args) {
		String line;
		int[] easyArr = {};
		int[] moderateArr = {};
		try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
			while ((line = br.readLine()) != null) {
				String[] arrNameValue = line.split("=");
				if ("easy".equals(arrNameValue[0])) {
					easyArr = parseInputValue(line).clone();
				} else if ("moderate".equals(arrNameValue[0])) {
					moderateArr = parseInputValue(line).clone();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

// 		QUESTION EASY#1
		System.out.println("QUESTION EASY#1");
		int num = findElementAppearOneTimeInArray(easyArr);
		System.out.println("Element appear only once in array: " + num);

// 		QUESTION MODERATE#1
		System.out.println("QUESTION MODERATE#1");
		int[] answer = productOfArrayExceptSelf(moderateArr);
		System.out.print("{");
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
			if (i != answer.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("}");
	}

}
