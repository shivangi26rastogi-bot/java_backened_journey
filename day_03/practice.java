package day_03;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //printing numbers from 1 to 10 
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.println(i+1);
        }

        // calculate a sum
        int[] arr = new int[n];
        for(int i= 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0; 
        for(int ele : arr){
            sum += ele;
        }
        System.out.println(sum);


        // repeat a prompt 
        while(n != 0){
            System.out.println("prompt");
            n--;
        }
    }
    
}
