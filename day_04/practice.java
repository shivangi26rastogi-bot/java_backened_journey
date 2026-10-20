package day_04;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // add two numbers method 
        System.out.println(add(3 ,4));

        //calculate an average 
        System.out.println(average(3,4,2));


    }
    
    static int add(int n1 , int n2 ){
        return n1 + n2 ;
    }

    static double average(int n1 , int n2 , int n3){
        return (n1 + n2 + n3)/3 ;
    }


}
