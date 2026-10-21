package day_10;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static int readInt(Scanner sc , String message){
        while(true){
            System.out.println(message);
            String input = sc.nextLine().trim();
            try{
                return Integer.parseInt(input);
            }
            catch(Exception e){
                System.out.println("invalid input .");
            }
        }
    }

    public static int readMark(Scanner sc , int subjectNumber){
        while(true){
            int mark = readInt(sc , "enter the marks of subject :" + (subjectNumber +1));

            if (mark >= 0 && mark <= 100) {
                return mark;
            }

            System.out.println("Marks must be between 0 and 100.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Student> students = new HashMap<>();
        
        while(true){

            System.out.println("---Student Management Report---");
            System.out.println("1 : add a new student .");
            System.out.println("2 : view all the student details .");
            System.out.println("3 : search for a student .");
            System.out.println("4 : exit");

            int choice = readInt(sc , "enter your choice :");

            switch(choice){

                case 1 : {
                    String name ;

                    do{
                        System.out.println("enter the name of the student :");
                        name = sc.nextLine().trim();

                        if(name.isEmpty()){
                            System.out.println("name cannot be empty");
                        }
                        
                    }while(name.isEmpty());

                    int rollNo ;

                    while(true){

                        rollNo = readInt(sc,"enter the roll number :");
                        if(rollNo <= 0){
                            System.out.println("roll number must be positive .");
                        }else if(students.containsKey(rollNo)){
                            System.out.println("donot enter the duplicate value.");
                        }
                        else{
                            break;
                        }
                    }

                    int subjects ;

                    do {
                        subjects = readInt(
                            sc, "Enter number of subjects (1-10): ");

                        if (subjects < 1 || subjects > 10) {
                            System.out.println("Enter between 1 and 10 subjects.");
                        }
                    } while (subjects < 1 || subjects > 10);

                    int[] marks = new int[subjects];

                    for (int i = 0; i < subjects; i++) {
                        marks[i] = readMark(sc,i + 1);
                    }

                    Student student = new Student(name, rollNo, marks);

                    students.put(rollNo, student);

                    System.out.println("Student added successfully!");
                    break;

                }
                case 2 : {
                    if(students.isEmpty()){
                        System.out.println("no students added yet.");
                    }
                    else{
                        for(Student stud : students.values()){
                            stud.displayResult();
                            System.out.println("-------------------");
                        }  
                    }
                    break;

                }
                case 3 : {
                    int searchRoll = readInt(sc, "enter the roll number for searching .");
                    Student student = students.get(searchRoll);
                    if(student != null){
                        student.displayResult();
                    }
                    else {
                        System.out.println("student not found.");
                    }
                    break;

                }
                case 4 : {
                    System.out.println("successfully exit .");
                    sc.close();
                    return;
                }
                default : {
                    System.out.println("invalid choice : 1 to 4");
                }
            }
        }
    }
    
}
