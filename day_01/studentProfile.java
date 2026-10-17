package day_01;

import java.util.Scanner;

public class studentProfile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("what is the student name ?");
        String name = sc.nextLine();

        System.out.println("what is the age of student ?");
        int age = sc.nextInt();

        System.out.println("what are the total marks ?");
        double marks = sc.nextDouble();

        System.out.println("student maths marks :");
        double marks_maths = sc.nextDouble();

        System.out.println("student science marks :");
        double marks_science = sc.nextDouble();

        System.out.println("student sst marks :");
        double marks_sst = sc.nextDouble();

        System.out.println("student machine learning marks :");
        double marks_machineLearning = sc.nextDouble();

        System.out.println("Student_name  :"  + name );
        System.out.println("Student_age  :"  + age );
        System.out.println("Student_marks (total)  :"  +  marks );

        double average = (marks_maths + marks_science + marks_machineLearning + marks_sst)/ 4 ;

        System.out.println("Student_average of four subjects  :" + average);

        

    }
    
}
