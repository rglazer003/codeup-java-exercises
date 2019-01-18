package grades;

import java.util.ArrayList;

public class Student {
    private ArrayList<Integer> grades = new ArrayList<>();
    private String name;

    public Student (String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }
    public void addGrade (int newGrade){
        this.grades.add(newGrade);
    }

    public double average(){
        int length = this.grades.size();
        double hold = 0;
        for (int i = 0;i<length;i++){
            hold += this.grades.get(i);
        }
        return (hold/length);
    }
    public void listGrades(){
        int length = this.grades.size();
        for (int i = 0; i<length;i++){
            System.out.println(this.grades.get(i));
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("Test");
        student1.addGrade(70);
        student1.addGrade(80);
        student1.addGrade(90);
        System.out.println(student1.getName());
        System.out.println(student1.average());
    }
}
