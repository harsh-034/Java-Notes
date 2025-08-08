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




- What is an Array?

An array is a linear data structure used to store elements of the same type in contiguous memory locations.

- Key Characteristics:

Fixed size (declared at creation)

Indexed (0 to n-1)

Homogeneous elements

Fast access using index



---

- Types of Arrays:

1. 1D Array – Single row of elements
→ Example: int[] arr = {10, 20, 30};


2. 2D Array – Like a matrix
→ Example: int[][] matrix = new int[3][3];




---

 - Basic Operations in DSA (Time Complexities):

Operation	Time Complexity

Access (arr[i])	O(1)
Insert at End	O(1)
Insert at Index	O(n)
Delete at Index	O(n)
Search (linear)	O(n)
Search (binary)*	O(log n)

*/
