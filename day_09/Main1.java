package day_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

    public static int readInt(Scanner sc , String message){
        while(true){
            System.out.println(message);
            String input = sc.nextLine().trim();

            try{
                return Integer.parseInt(input);
            }
            catch(IllegalArgumentException e){
                System.out.println("invalid !" + e);
            }
        }
    }

    public static boolean isDuplicateRollNo(ArrayList<Student> students , int roll_n){
        int searchRoll = roll_n;
        for(Student stud : students){
            if(stud.getRollNo() == searchRoll){
                return true;
            }
        }
        return false;
        
    }

    public static int readMark(Scanner sc , int subjectNumber){
        while(true){
            int mark = readInt(sc , "enter the number of subject :" + (subjectNumber + 1));

            if(mark >= 0 || mark <= 100){
                return mark;
            }
            System.out.println("enter the valid marks .");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Student> students = new ArrayList<>();

        while(true){
            System.out.println("student management report");
            System.out.println("1 : add a student");
            System.out.println("2 : view all student ");
            System.out.println("3 : search student");
            System.out.println("4 : exit");

            int choice = readInt(sc , " enter your choice :");

            switch(choice){

                case 1 : {
                    String name ;

                    do{
                        System.out.println("enter the name :");
                        name = sc.nextLine().trim();
                        if(name.isEmpty()){
                            System.out.println("name is not blank.");
                        }
                    }while(name.isEmpty());

                    int rollNo;

                    while(true){
                        rollNo = readInt(sc, "enter the rollNo");

                        if(rollNo <= 0){
                            System.out.println("eenter the valid value");
                        }
                        else if(isDuplicateRollNo(students , rollNo)){
                            System.out.println("duplicate roll number ");
                        }
                        else{
                            break;
                        }
                    }

                    int subjects ;

                    do{
                        subjects = readInt(sc, "enter the number of subjects .");

                        if(subjects < 1 || subjects >= 11){
                            System.out.println("enter between the range .");
                        }
                    }while(subjects < 1 || subjects > 10);

                    int[] marks = new int[subjects]; 

                    for(int i = 0 ; i < subjects ; i++){
                        marks[i] = readMark(sc , (i+1));
                    }

                    Student student = new Student(name, rollNo, marks);
                    students.add(student);

                    System.out.println("successfully add a student.");
                    break;
                }
                case 2 : {// view all student .

                    if(students.isEmpty()){
                        System.out.println("no student added yet.");
                    }
                    else{
                        for(Student stud : students){
                            stud.displayResult();
                            System.out.println("---------------------------");
                        }
                    }
                    break;
                }
                case 3 : {//search student 
                    int searchRoll = readInt(sc,"enter the roll number to search");
                    boolean found  = false;

                    for(Student stud : students){
                        if(stud.getRollNo() == searchRoll){
                            found = true;
                            System.out.println("founded ");
                            stud.displayResult();
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("not found");
                    }
                    break;
                }
                case 4 : {// exit
                    System.out.println("succesfully exit ");
                    sc.close();
                    return;

                }
                default :{
                    System.out.println("choose between 1 to 4");
                }

            }
        }



    }
    
}
