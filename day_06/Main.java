package day_06;

public class Main {
    public static void main(String[] args){

        int[] marks1 = {23,34,56,78,90};
        int[] marks2 = {56,67,89,90,80};

        Student s1 = new Student("sona" , 34 ,marks1);
        Student s2 = new Student("shivangi" , 33 , marks2);

        s1.displayResult();
        s2.displayResult();

    }
    
}
