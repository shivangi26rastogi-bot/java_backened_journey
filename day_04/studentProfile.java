package day_04;

import java.util.Scanner;

public class studentProfile {

    public static boolean isValid(double m1 , double m2 , double m3 ){
        return (m1 >= 0 && m1 <=100 )
            && (m2 >= 0 && m2 <= 100 )
            && (m3 >= 0 && m3 <=100);
    }

    public static double totalMarks(double m1 , double m2 , double m3){

        return m1 + m2 + m3 ;
    }

    public static double calPercentage(double total){
        return total/3.0;
    }

    public static boolean hasPassed(double m1 , double m2 , double m3 , double percentage){
        if(m1 >= 33 && m2 >= 33 && m3 >= 33 && percentage >= 40 ){
            return true ;
        }
        return false;
    }

    public static void displayResult(String name , int roll_n ,  double total ,double percentage  , boolean passed){
        System.out.println("student report ");
        System.out.println("name of the student :" + name );
        System.out.println("roll number of the student :" + roll_n);
        System.out.println("total marks student got  :" + total);
        System.out.println("percentage student got :" + percentage );

        if(passed){
            System.out.println("student is passed .");
        }
        else{
            System.out.println("student is failed .");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student_count = 0;
        String choice ;

        do{
            System.out.println(" student number :" + (student_count +1));

            System.out.println("student name :");
            String name = sc.nextLine();

            System.out.println("student roll number :");
            int roll_n = sc.nextInt();

            System.out.println("marks of first subject  :");
            double m1  = sc.nextInt();

            System.out.println("marks of second subject  :");
            double m2  = sc.nextInt();

            System.out.println("marks of third subject  :");
            double m3 = sc.nextInt();


            if(isValid( m1 ,  m2 ,  m3 )){
                double total = totalMarks(m1 , m2 , m3 );
                double percentage = calPercentage(total);
                boolean passed = hasPassed( m1 ,  m2 ,  m3 , percentage);
                displayResult(
                    name, roll_n, total, percentage, passed
                );

                student_count++;
            } else {
                System.out.println( "Invalid marks! Enter values from 0 to 100.");
            }

            System.out.println("another student  : (yes or no) ");
            choice = sc.next();

            sc.nextLine();


        }while(choice.equalsIgnoreCase("yes"));

        System.out.println("successfully :" + student_count);

        sc.close();
    
    }
    
}
