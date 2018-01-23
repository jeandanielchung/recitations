import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your grade: ");
		int gradeIn = sc.nextInt();

		char grade = 'X';
		if (gradeIn >= 90) {
			grade = 'A';
		} else if (gradeIn >= 80) {
			grade = 'B';
		} else if (gradeIn >= 70) {
			grade = 'C';
		} else if (gradeIn >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.printf("Your letter grade: %s\n", grade);
	}
}