package day_05;

import java.util.Scanner;

public class studentProfile {

    public static boolean isValid(int[] marks){
        for(int mark : marks){
            if(mark < 0 || mark > 100){
                return false;
            }
        }
        return true;
    }


    public static double total(int[] marks){
        int sum = 0;
        for(int mark : marks ){
            sum += mark;
        }
        return sum;
    }

    public static void displayResult(int[] marks , int total_marks , String name , int roll_n , boolean passed , double percentage){
        System.out.println("name of the student :" + name );
        System.out.println("roll number of the student :" + roll_n);
        System.out.println("marks of each subject :");
        for(int mark : marks ){
            System.out.print(mark + " ");
        }
        System.out.println("total marks :" + total_marks);
        System.out.println("percentage the student got : "+ percentage);
        System.out.println("passed or failed :" + passed);
    }

    public static double calpercentage (int n , double total_marks){
        return total_marks / n;
    }

    public static boolean hasPassed(int[] marks , double percentage){
        for(int i =0 ; i <marks.length ; i++){
            if(marks[i] < 33){
                return false;
            }
        }
        return percentage >= 40;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the total subjects :");
        int n = sc.nextInt();

        sc.nextLine();
        
        int[] marks = new int[n];

        int studentCount = 0;
        String choice ;
       

        do{

            System.out.println("student number :" + (studentCount +1));

            System.out.println("enter the student name :");
            String name = sc.nextLine();

            System.out.println("enter student roll number :");
            int roll_n = sc.nextInt();

            System.out.println("enter the marks of the student :");
            for(int i = 0 ; i < marks.length ; i++){
                marks[i] = sc.nextInt();
            }

            if(isValid(marks)){
                System.out.println("valid marks");
                double total_marks = total(marks);
                double percentage = calpercentage(n, total_marks);
                boolean passed = hasPassed(marks, percentage);
                displayResult(marks,(int) total_marks, name, roll_n, passed, percentage);
                
                studentCount++;
            }
            else{
                System.out.println("invalid marks : enter between 0 to 100.");
            }



            System.out.println("enter your choice to add other srudent data or not : (yes/no");
            choice = sc.next();

            sc.nextLine();

        }while(choice.equalsIgnoreCase("yes"));


        System.out.println("successfully :" + studentCount);
        sc.close();
        
        
    }
    
}
