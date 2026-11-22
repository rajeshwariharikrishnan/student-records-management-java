
public class StudentManagement {
    public static void main(String[] args) {

        System.out.println("Welcome to Student Management System!");

        String name = "Arun";
        int marks = 85;

        String name2 = "Priya";
        int marks2 = 90;

        String name3 = "Kumar";
        int marks3 = 78;

        String name4 = "Divya";
        int marks4 = 95;

        String name5 = "Ravi";
        int marks5 = 88;

        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);

        System.out.println("Student Name: " + name2);
        System.out.println("Student Marks: " + marks2);

        System.out.println("Student Name: " + name3);
        System.out.println("Student Marks: " + marks3);

        System.out.println("Student Name: " + name4);
        System.out.println("Student Marks: " + marks4);

        System.out.println("Student Name: " + name5);
        System.out.println("Student Marks: " + marks5);

        double average = (marks + marks2 + marks3 + marks4 + marks5) / 5.0;

        System.out.println("Average Marks: " + average);
    }
}

