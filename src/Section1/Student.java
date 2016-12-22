/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section1;

/**
 *
 * @author ejgo
 */
public class Student implements Comparable<Student>{
    private String name;
    private Integer age, grade;
    private Double average;
    
    public Student (String name, Integer age, Integer grade, Double average){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.average = average;
    }
    
    public String getName(){
        return name;
    }
    
    public Integer getAge(){
        return age;
    }
    
    public Integer getGrade(){
        return grade;
    }
    
    public Double getAverage(){
        return average;
    }
    
    public int compareTo(Student s){
        return age.compareTo(s.getAge());
    }
    
    @Override
    public String toString(){
        return "Name: " + name +
                "\nAge: " + age +
                "\nGrade: " + grade +
                "\nAverage: " + average;
    }
    
}
