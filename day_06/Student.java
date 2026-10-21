package day_06;

public class Student{

    String name ;
    int roll_n;
    int[] marks ;

    public Student(String name , int roll_n , int[] marks){
        this.name = name ;
        this.roll_n = roll_n ;
        this.marks = marks;
    }

    public int total(){
        int sum = 0;
        for(int mark : marks ){
            sum += mark;
        }
        return sum;
    }

    public double percentage(){
        return (double)total()/marks.length;
    }

    public boolean hasPassed(){
        for(int mark : marks){
            if(mark < 33){
                return false;
            }
        }
        return percentage() >= 40;
    }

    public boolean isValid(){
        for(int i = 0 ; i < marks.length ; i++){
            if(marks[i] < 0 && marks[i] > 100){
                return false;
            }
        }
        return true;
    }

    public void displayResult(){
        System.out.println("Student Report");
        if(isValid()){
            System.out.println("name :" + name);
            System.out.println("roll_number :" + roll_n);
            System.out.println("total_marks :" + total());
            System.out.println("percentage :" + percentage());
            System.out.println("hasPassed :" + (hasPassed() ? "yes" : "no"));

        }
        else{
            System.out.println("enter valid marks .");
        }
    
    }

    
}
