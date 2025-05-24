import java.util.Scanner;

class Grade {
    public String grade(int avgp) {
        switch (avgp / 10) {
            case 10: return "A+";
            case 9: return "A";
            case 8: return "B+";
            case 7: return "B";
            case 6: return "C";
            case 5: return "D";
            default: return "F";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Grade gradeCalculator = new Grade();
        Scanner sc = new Scanner(System.in);

        // Taking input for number of subjects
        System.out.print("Enter the number of subjects: ");
        int totalSubjects = sc.nextInt();
        int totalMarks = 0;

        // Taking and adding all the marks
        for (int i = 0; i < totalSubjects; i++) {
            int marks;
            do {
                System.out.print("Enter marks obtained in subject " + (i + 1) + " (0-100): ");
                marks = sc.nextInt();
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                }
            } while (marks < 0 || marks > 100);
            totalMarks += marks;
        }

        // Calculating average percentage
        int averagePercentage = totalMarks / totalSubjects;

        // Getting grade
        String grade = gradeCalculator.grade(averagePercentage);

        // Displaying results
        System.out.println("\nResults:");
        System.out.println("Total marks obtained: " + totalMarks);
        System.out.println("Average percentage: " + averagePercentage + "%");
        System.out.println("Grade obtained: " + grade);

        sc.close();
    }
}