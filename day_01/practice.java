package day_01;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("what is the student name ?");
        String name = sc.nextLine();

        System.out.println("what is the age of student ?");
        int age = sc.nextInt();
        // changing the name 
        name = "shivangi";
        System.out.println("change name of student " + name );
        // change the age 
        age = 32;
        System.out.println("change the age of the student " + age);
    }
    
}
