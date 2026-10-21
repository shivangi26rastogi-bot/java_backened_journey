package day_07;

public class Main {
    public static void main(String[] args) {
        
        int[]  marks1 = {45,67,77,89,99};

        Student s1 = new Student("sona", 34 ,  marks1);

        s1.displayResult();

        System.out.println();
        System.out.println("through get name :" + s1.getName());

        s1.setName("shivangi");
        System.out.println("update name :" + s1.getName());

        s1.setMarks(new int[]{80, 75, 50, 85, 70});

        System.out.println("\nFinal report:");
        s1.displayResult();


    }
    
}
