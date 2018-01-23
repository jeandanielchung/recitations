public class SwitchStatements {
	public static void main(String[] args) {
		// PROBLEM: How would you write a converter from numerical to letter grades?

		double grade = 99.3;
		char letGrade = '\0'; // why this and not ''?

		// review of multi-way if else
		if (grade >= 90.0) {
			letGrade = 'A';
		} else if (grade >= 80.0) {
			letGrade = 'B';
		} else if (grade >= 70.0) {
			letGrade = 'C';
		} else if (grade >= 60.0) {
			letGrade = 'D';
		} else {
			letGrade = 'F';
		}

		System.out.printf("A %.2f is a(n) %c\n", grade, letGrade);

		// using a switch statement to print messages for each grade
		switch (letGrade) {
			case 'A':
				System.out.println("Well done! We'd love if every one of you got one of these");
			case 'B':
				System.out.println("Apply to be a TA!");
				break;
			case 'C':
				System.out.println("C's get degrees");
				break;
			case 'D':
				System.out.println("Freshman forgiveness?");
				break;
			case 'F':
				System.out.println("Oops");
				break;
			default:
				System.out.println("Invalid letter grade");
		}

		// QUESTION: what happens if you get an A?

	}
}