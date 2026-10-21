package day_07;

public class Student {

    private String name ;
    private int roll_n ;
    private int[] marks;

    public Student(String name , int roll_n , int[] marks){
        this.name = name;
        this.roll_n = roll_n ;
        this.marks = marks ;
    }
    
    public String getName(){
        return name;
    }

    public int[] getMarks(){
        return marks.clone(); // to protect the original array
    }

    public int getRollNo(){
        return roll_n;
    }

    public void setName(String name){
        if(name != null && !name.trim().isEmpty()){
            this.name = name ;
        }
        else{
            System.out.println("name cannot be empty .");
        }
    }

    public void setMarks(int[] marks){
        if(marks == null || marks.length == 0){
            System.out.println("marks cannot be empty .");
            return;
        }

        for(int mark : marks){
            if(mark < 0 || mark > 100){
                System.out.println("marks are not in range .");
                return;
            }
        }

        this.marks = marks.clone();
    }

    public void setRollNo(int roll_n){
        this.roll_n = roll_n;
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
            System.out.println("name :" + getName());
            System.out.println("roll_number :" + getRollNo());
            System.out.println("total_marks :" + total());
            System.out.println("percentage :" + percentage());
            System.out.println("hasPassed :" + (hasPassed() ? "yes" : "no"));

        }
        else{
            System.out.println("enter valid marks .");
        }
    
    }
}
