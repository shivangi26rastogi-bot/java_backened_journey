package day_03;

import java.util.Scanner;

public class studentProfile {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int student_count = 0;
        String choice ;

        int passed = 0;
        int failed = 0;

        do{
            System.out.println(" student number :" + student_count +1);

            System.out.println("student name :");
            String name = sc.nextLine();

            System.out.println("student roll number :");
            int roll_n = sc.nextInt();

            System.out.println("total marks :");
            double n = sc.nextInt();

            double percentage = n / 5.0;


            if(n > 500 || n < 0){
                System.out.println("invalid marks");
            }
            else{
                System.out.println("name :" + name);
                System.out.println("roll_n :"+ roll_n);
                System.out.println("total marks :" + n);

                if(n >= 33 ){
                    System.out.println("pass");
                    passed++;
                    if(percentage <= 100 && percentage > 90){
                    System.out.println("garde : A");
                    }
                    else if(percentage <= 90 && percentage > 80){
                        System.out.println("grade : B");
                    }
                    else if(percentage <= 80 && percentage > 75){
                        System.out.println("garde : C");
                    }
                    else{
                        System.out.println("grade :D");
                    }
                }
                else{
                    System.out.println("fail");
                    failed++;
                }

                student_count++;
            }

            System.out.println("another student  : (yes or no) ");
            choice = sc.next();

            sc.nextLine();


        }while(choice.equalsIgnoreCase("yes"));

        System.out.println("successfully :" + student_count);
        System.out.println("passed student :" + passed);
        System.out.println("failed student :" + failed);

        sc.close();
    
    }
    
}
