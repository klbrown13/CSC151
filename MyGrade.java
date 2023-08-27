import java.util.Scanner;

/** This program calculates the final grade for a class
 * @author Kurt Brown
 */

public class MyGrade {

	public static void main(String[] args) {
		double labsAvg, quizAvg, revelAvg, midtermAvg, projectAvg, finalAvg, courseAvg;
		final double LABSWEIGHT = .20;
		final double QUIZWEIGHT = .10;
		final double REVELWEIGHT = .15;
		final double MIDTERMWEIGHT = .20;
		final double PROJECTWEIGHT = .15;
		final double FINALWEIGHT = .20;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Labs average in percent: ");
		labsAvg = input.nextDouble();

		System.out.print("Enter Quizzes average in percent: ");
		quizAvg = input.nextDouble();

		System.out.print("Enter Revel average in percent: ");
		revelAvg = input.nextDouble();

		System.out.print("Enter Midterm average in percent: ");
		midtermAvg = input.nextDouble();

		System.out.print("Enter Project average in percent: ");
		projectAvg = input.nextDouble();

		System.out.print("Enter Final average in percent: ");
		finalAvg = input.nextDouble();

		courseAvg = (labsAvg * LABSWEIGHT) + (revelAvg * REVELWEIGHT) + (quizAvg * QUIZWEIGHT)
				+ (midtermAvg * MIDTERMWEIGHT) + (projectAvg * PROJECTWEIGHT) + (finalAvg * FINALWEIGHT);

		System.out.print("Your average is " + courseAvg + "%");

	}

}
