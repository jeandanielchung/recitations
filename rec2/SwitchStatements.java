public class SwitchStatements {
	public static void main(String[] args) {
	
	// PROBLEM: How would you write a converter from numerical to letter grades?

		double grade = 99.3;
		char letGrade = '\0'; // why this and not ''?

	// REVIEW: multi-way if else
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

	// CONCEPT: switch statement (to print messages for each grade)
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

	// QUESTION: what will be printed if you get a B? What about an A?

		System.out.println();

	// EXERCISE: turn the following multi-way if-else statement into a switch statement
		String taName = "Viren";
		System.out.printf("TA: %s\n", taName);

		// if-else
		if (taName.equals("Harsh")) {
			System.out.println("I'm going to grad school after graduation!");
		} else if (taName.equals("Viren") || taName.equals("Daniel")) {
			if (taName.equals("Viren")) {
				System.out.println("I took this class last Fall");
			}
			System.out.println("My major is CS");
		} else {
			System.out.println("I'm not a TA for this section :/");
		}

		// your code starts here


		// your code ends here
	}
}