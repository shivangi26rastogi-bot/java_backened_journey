package day_02;

import java.util.Scanner;

public class studentProfile {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("what is the student name ?");
        String name = sc.nextLine();
        System.out.println("what is the student maths marks :");
        double marks_1 = sc.nextDouble();
        System.out.println("what is the student english marks :");
        double marks_2 = sc.nextDouble();
        System.out.println("what is the student science marks :");
        double marks_3 = sc.nextDouble();

        double total  = marks_1 + marks_2 + marks_3 ;

        double percentage = total / 3.0;

        if(total <= 300){
            System.out.println("valid marks .");

            if(marks_1 >= 33 && marks_2 >= 33 && marks_3 >=33 ){
                System.out.println("passs.");

                System.out.print("grade :");

                if(percentage <=100 && percentage >=90){
                    System.out.println("A");
                }
                else if(percentage < 90 && percentage >= 80){
                    System.out.println("B");
                }
                else if(percentage < 80 && percentage >= 70){
                    System.out.println("C");
                }
                else{
                    System.out.println("D");
                }
            }
            else{
                System.out.println("may be fail in one atleast .");
            }
        }
        else{
            System.out.println("invalid marks .");
        }

    }
    
}
