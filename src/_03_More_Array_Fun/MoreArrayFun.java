package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	static // 1. Create a main method to test the other methods you write.
	String[] a = { "Test", "The", "New", "Methods", "Because", "It", "Is", "The", "Project" };

	public static void main(String[] args) {
		randomOrderArray(a);

	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	static void printArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	static void rPrintArray(String[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}

	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	static void everyOtherArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.println(array[i]);
			}
		}

	}

	static void randomOrderArray(String[] array) {
		Random r = new Random();
	for (int i = 0; i<array.length;i++) {
		
		int random = r.nextInt(array.length);
		String holder = array[random];
		array[random] = array[i];
		array[i] = holder;
		
		
	}
	for(int i = 0; i < array.length;i++) {
		System.out.println(array[i]);
	}
		
	
	}
		
	
	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.

}
