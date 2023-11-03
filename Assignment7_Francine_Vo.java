/*
 *Assignment7_Francine_Vo.java
 *Francine Vo
 *01253035
 *10/29/2023
 */
import java.util.Scanner;
public class Assignment7_Francine_Vo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt user to enter number of students and read input
		System.out.print("How many students are in the class? ");
		int numberOfStudents = input.nextInt();

		// Create arrays
		String[] studentNames = new String[numberOfStudents];
		int[] studentGrades = new int[numberOfStudents];

		// Use loop to read in students names and grades
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Enter students name: ");
			studentNames[i] = input.next();
			System.out.print("Enter students grade (0-100): ");
			studentGrades[i] = input.nextInt();
		}
		// Invoke descendingOrder method to output results
		descendingOrder(studentNames, studentGrades, numberOfStudents);
		input.close();
	}
	public static void descendingOrder(String[] studentNames,
			int[] studentGrades, int numberOfStudents) {

		// Loop thru and sort numbers in descending number
		for (int i = 0; i < numberOfStudents - 1; i++) {

			// Declare variables
			String currentStudent = studentNames[i];
			int currentGrade = studentGrades[i];
			int currentGradeIndex = i;

			// Find the highest grade
			for (int j = i + 1; j < numberOfStudents; j++) {
				if (currentGrade < studentGrades[j]) {
					currentGrade = studentGrades[j];
					currentStudent = studentNames[j];
					currentGradeIndex = j;
				}
			}
			// Swap studentGrades[i] and studentNames[i] with
			// studentGrades[currentGradeIndex] and
			// studentNames[currentGradeIndex] if
			// necessary:
			if (currentGradeIndex != i) {
				studentGrades[currentGradeIndex] = studentGrades[i];
				studentNames[currentGradeIndex] = studentNames[i];
				studentGrades[i] = currentGrade;
				studentNames[i] = currentStudent;
			}
		}
		// Display Header
		System.out.println(
				"Here is the report of the students' performance in the test: ");
		System.out.printf("%-10s%20s\n", "Students name", "Test score");
		// Loop through and display names and grades from highest to lowest
		for (int i = 0; i < numberOfStudents; i++)
			System.out.printf("%-10s%15d\n", studentNames[i], studentGrades[i]);

	}
}