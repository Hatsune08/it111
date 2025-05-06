import java.util.Scanner;

public class GradeAveraging {

    public static void main(String[] args) {

        int counter = 1;
        int grade;
        double total = 0;
        double average;

        Scanner input = new Scanner(System.in);

        while (counter <= 5) {
            System.out.print("Please enter your grade #" + counter + ": ");
            grade = input.nextInt();
            total += grade;
            counter += 1;
        }
        char letterGrade;
        String message;

        counter -= 1;
        average = total / counter;

        System.out.println("You have earned at average grade of " + average);

        if (average >= 90) {
            letterGrade = 'A';
            message = "Excellent work!";
        } else if (average >= 80 && average < 90) {
            letterGrade = 'B';
            message = "Solid work!";
        } else if (average >= 70 && average < 80) {
            letterGrade = 'C';
            message = "More studying necessary.";
        } else if (average >= 65 && average < 70) {
            letterGrade = 'D';
            message = "Sneaking by!";
        } else {
            letterGrade = 'F';
            message = "Not a passing grade.";
        }

        System.out.println("You have earned the following letter grade " +letterGrade + ", and here is the message" + message);
    }
}