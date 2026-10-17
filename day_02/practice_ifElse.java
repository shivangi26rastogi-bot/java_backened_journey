package day_02;

import java.util.Scanner;

public class practice_ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String state = sc.nextLine();
        
        if(state  == "uttarPradesh"){
            System.out.println("we are in our home state .");
        }
        else if (state == "noida"){
            System.out.println("we are in college .");
        }
        else{
            System.out.println("we are not in our hoomie place .");
        }
    }

    
    
}
