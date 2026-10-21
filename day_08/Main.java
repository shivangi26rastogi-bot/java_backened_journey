package day_08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Student> students =  new ArrayList<>();

        Student s1 = new Student("sona", 23, new int[]{23,45,67,78,99});
        Student s2 = new Student("shivangi", 26, new int[]{90,45,88,78,99});
        Student s3 = new Student("shanaya", 27, new int[]{93,45,67,78,99});

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("size of arraylist : " +students.size());

        for(Student stud : students){
            stud.displayResult();
            System.out.println();
        }

        // check found student via roll number 

        int searchRoll = 96 ;
        boolean found = false;

        for(Student stud : students){
            if(stud.getRollNo() == searchRoll){
                System.out.println("found");
                found = true ;
                stud.displayResult();
                break;
            }
        }

        if(!found){
            System.out.println("not found");
        }

        // adding fourth student 

        Student s4 = new Student("rahul", 88 ,new int[]{34,57,89,90,53});
        students.add(s4);
        students.get(3).displayResult();

        // print all students name only 
        for(Student stud : students){
            String n  = stud.getName();
            System.out.println(n);
        }



    }
    
}
