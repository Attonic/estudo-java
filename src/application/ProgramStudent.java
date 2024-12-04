package application;

import entities.Student;
import jdk.jshell.Snippet;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Name of Student: ");
        student.nome = sc.nextLine();

        System.out.println("Tree Grades of student: ");
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.printf("Final Grade = %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.00){
            System.out.println("Failed");
            System.out.printf("Missing %.2f points", student.calcAprovad());
        }else {
            System.out.println("Pass");
        }
    }
}
