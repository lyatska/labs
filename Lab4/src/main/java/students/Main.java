package students;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void writeStudentToFile(Student[] s) {
        try {
            PrintWriter outputStream = new PrintWriter("Students.txt");
            outputStream.println(String.format("%-10s %-10s %-10s %-20s %-10s %-10s %-10s", "Number", "Surname", "Course", "Specialty", "Physics", "Math", "Computer Science"));
            for (Student student : s) {
                outputStream.println(String.format("%-10s %-10s %-10s %-20s %-10s %-10s %-10s", student.number, student.surname, student.course, student.specialty, student.physicsMark, student.mathMark, student.compScienceMark));
            }
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printStudentsFile(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        System.out.println();
    }

    public static void countMathAndPhysicsMark(Student[] students) {
        int counter = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].mathMark == 5) {
                counter++;
            }
            if (students[i].physicsMark == 5) {
                counter++;
            }
        }
        System.out.println("Кількість студентів, які отримали з фізики і математики оцінку 5: " + counter);
    }

    public static void countExcellentMarks(Student[] students) {
        int counterMath = 0;
        int counterPhysics = 0;
        int counterComputerScience = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].mathMark == 5) {
                counterMath++;
            }
            if (students[i].physicsMark == 5) {
                counterPhysics++;
            }
            if (students[i].compScienceMark == 5) {
                counterComputerScience++;
            }
        }
        System.out.println("Кількість оцінок 'відмінно' з математики: " + counterMath);
        System.out.println("Кількість оцінок 'відмінно' з фізики: " + counterPhysics);
        System.out.println("Кількість оцінок 'відмінно' з інформатики: " + counterComputerScience);
    }


    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Будь ласка, введіть кількість студентів, яких потрібно внести до списку: ");
        int amountOfStudents = scan.nextInt();
        Student[] students = new Student[amountOfStudents];
        for (int i = 0; i < amountOfStudents; i++) {
            System.out.println("Введіть, будь ласка, прізвище студента: ");
            String surname = scan.next();
            System.out.println("Введіть, будь ласка, курс: ");
            int course = scan.nextInt();
            System.out.println("Введіть, будь ласка, спеціальність(Computer_Science або Business_Analysis): ");
            String specialty = scan.next();
            System.out.println("Введіть, будь ласка, оцінку з фізики: ");
            int physics = scan.nextInt();
            System.out.println("Введіть, будь ласка, оцінку з математики: ");
            int math = scan.nextInt();
            System.out.println("Введіть, будь ласка, оцінку з інформатики: ");
            int computer_science = scan.nextInt();
            students[i] = new Student(i+1, surname, course, Specialty.valueOf(specialty), physics, math, computer_science);
        }
        writeStudentToFile(students);
        countExcellentMarks(students);
        countMathAndPhysicsMark(students);
        printStudentsFile("Students.txt");
    }
}
