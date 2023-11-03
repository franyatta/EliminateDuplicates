/*
 * Lab8_Task2_Francine_Vo.java
 * Francine Vo
 * 01253035
 * 10/28/2023
 */
import java.util.Scanner;
public class Lab8_Task2_Francine_Vo {

	public static void main(String[] args) {
		// Declare array for 10 integers
		int[] numbers = new int[10];

		// Prompt user to enter 10 integers
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");

		// Create loop to read input
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		input.close();

		// Invoke eliminateDuplicates method
		int[] result = eliminateDuplicates(numbers);

		// Output results
		System.out.printf("Number of distinct values: %d\n", result.length);
		System.out.print("Unique values are: ");
		// Loop and display the unique values
		for (int element : result) {
			System.out.printf("%d ", element);
		}
	}
	public static int[] eliminateDuplicates(int[] numbers) {
		// Create temporary array and unique value counter
		int[] temp = new int[numbers.length];
		int uniqueIndex = 0;

		// Iterate thru each element of og array
		for (int i = 0; i < numbers.length; i++) {
			// Invoke boolean method isInArray
			if (!isInArray(temp, numbers[i])) {
				temp[uniqueIndex] = numbers[i];
				uniqueIndex++;
			}
		}
		// Copy values from temporary array into new array
		int[] result = new int[uniqueIndex];
		for (int i = 0; i < uniqueIndex; i++) {
			result[i] = temp[i];
		}
		return result; // Return new array
	}
	// Create boolean isInArray method to check
	public static boolean isInArray(int[] array, int key) {
		for (int element : array)
			if (element == key)
				return true;
		return false;
	}
}
