package day_02;
import java.util.Scanner;

public class even_odd_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("write the value of n :");
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    
}
