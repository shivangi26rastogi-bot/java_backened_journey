package day_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int readInt(Scanner sc , String message){

            while(true){
                System.out.println(message);
                String input = sc.nextLine().trim();

                try{
                    return Integer.parseInt(input);
                }
                catch(NumberFormatException e){
                    System.out.println("invalid input !");
                }
            }
    }

    public static int readMark(Scanner sc , int subjectNumber){
        while (true) {
            int mark = readInt(sc,"enter the marks :" +subjectNumber);

            if(mark >=0 || mark <= 100){
                return mark;
            }
            System.out.println("marks should be between the 0 to 100");
            
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        try{
            int count = readInt(sc,"how many students");

            if(count <= 0){
                throw new IllegalArgumentException("count should be greater than zero");
            }

            for(int i = 0 ; i < count ; i++){
                System.out.println("student :" +(i +1));

                System.out.println("eneter the name :");
                String name = sc.nextLine().trim();

                if(name.isEmpty()){
                    System.out.println("name cannot be empty");
                    name = sc.nextLine().trim();
                }

                int rollNo ;
                while(true){
                    rollNo = readInt(sc,  "enter the roll number");
                    if(isDuplicateRollNo(students, rollNo)){
                        System.out.println("enter the unique roll num");
                    }
                    else{
                        break;
                    }
                }
    

                int[] marks = new int[5];
                for(int j = 0 ; j <marks.length ; j++){
                    marks[j] = readMark(sc, (j+1));
                }


                students.add(new Student(name, rollNo, marks));
            }

            System.out.println("all student reports");
            for(Student stud : students){
                stud.displayResult();
            }

            System.out.println();

            boolean found = false;
            int searchRoll = readInt(sc,"enter roll number to search");

            for(Student stud : students){
                if(stud.getRollNo() == searchRoll){
                    found = true;
                    System.out.println("found");
                    stud.displayResult();
                    break;
                }
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("error" + e.getMessage());
        }
        finally{
            sc.close();
            System.out.println("program finished .");
        }
    

    }

    public static boolean isDuplicateRollNo(ArrayList<Student> students , int roll_n){
        for(Student stud : students){
            if(stud.getRollNo() == roll_n){
                return true;
            }

        }
        return false;
    }
    
}
