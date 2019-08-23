package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static int[] parseInputValue(String input) {
		int[] values = {};
		String[] arrNameValue = input.split("=");
		String[] arrVal = arrNameValue[1].split(",");
		values = new int[arrVal.length];
		for (int i = 0; i < arrVal.length; i++) {
			values[i] = Integer.valueOf(arrVal[i].trim());
		}
		return values;
	}

	public static void main(String[] args) {
		String line;
		ArrayInt easyArr = new ArrayInt();
		ArrayInt moderateArr = new ArrayInt();
		boolean isReadEasy = false, isReadModerate = false;
		try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
			while ((line = br.readLine()) != null) {
				String[] arrNameValue = line.split("=");
				if ("easy".equals(arrNameValue[0]) && !isReadEasy) {
					easyArr.setArrInt(parseInputValue(line));
					isReadEasy = true;
				} else if ("moderate".equals(arrNameValue[0]) && !isReadModerate) {
					moderateArr.setArrInt(parseInputValue(line));
					isReadModerate = true;
				}
			}
			if(!isReadEasy || !isReadModerate) {
				System.out.println("Missing easy or moderate paramter or both !");
				return;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

 		//QUESTION EASY#1
		System.out.println("QUESTION EASY#1");
		int num = easyArr.findElementAppearOneTimeInArray();
		System.out.println("Element appear only once in array: " + num);

 		//QUESTION MODERATE#1
		System.out.println("QUESTION MODERATE#1");
		int[] productArr = moderateArr.productOfArrayExceptSelf();
		System.out.print("{");
		for (int i = 0; i < productArr.length; i++) {
			System.out.print(productArr[i]);
			if (i != productArr.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("}");
	}

}
