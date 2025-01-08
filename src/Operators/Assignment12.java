package Operators;
//The total number of students in a class are 90 out of which 45 are boys.
//If 50% of the total students secured grade 'A' out of which 20 are boys,
// then write a program to calculate the total number of girls getting grade 'A'.

public class Assignment12 {
    public static void main(String[] args) {
        int total_student =90;
        int gradeA_boys = 20;
        int gradeA = total_student / 2;
        int GradeA_girls = gradeA -gradeA_boys;
        System.out.println("Grade A Student:- "+gradeA);
        System.out.println("Total Numbers Of girls getting Grade A:- "+GradeA_girls);
    }
}
