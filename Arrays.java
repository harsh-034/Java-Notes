// A college stores the marks of students for a particular subject in an array. You are required to:

import java.util.Arrays;
import java.util.Scanner;

public class StudentMarksAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int sum = 0;

        // Input marks
        System.out.println("Enter marks of 5 students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i+1) + ": ");
            marks[i] = scanner.nextInt();
            sum += marks[i];
        }

        // Calculate average
        double average = (double) sum / marks.length;

        // Find highest and lowest
        int max = marks[0], min = marks[0];
        for (int mark : marks) {
            if (mark > max) max = mark;
            if (mark < min) min = mark;
        }

        // Sort marks
        Arrays.sort(marks);

        // Output
        System.out.println("\nAverage Marks: " + average);
        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
        System.out.println("Marks in Ascending Order: " + Arrays.toString(marks));
    }
}

/*output 
Enter marks of 5 students:
Student 1: 75
Student 2: 82
Student 3: 90
Student 4: 68
Student 5: 88

Average Marks: 80.6
Highest Marks: 90
Lowest Marks: 68
Marks in Ascending Order: [68, 75, 82, 88, 90]
*/
