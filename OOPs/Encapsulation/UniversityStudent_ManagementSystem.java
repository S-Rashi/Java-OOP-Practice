/*
Project: University Student Management System
Concept: Encapsulation

Key Features:
- Student record management
- CGPA validation
- Age and roll number validation
- Secure data access

OOP Concepts:
- Data hiding
- Validation logic
- Getter/Setter usage
- Class modeling
*/

package OOPs.Encapsulation;

class Student {
    private String name;
    private int age;
    private int rollNumber;
    private double cgpa;

    public void setName( String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age>0){
           this.age = age; 
        }else{
            System.out.println("Invalid age");
        }
        
    }
    public void setRollNumber(int rollNumber){
        if(rollNumber>0){
            this.rollNumber = rollNumber;
        }else{
            System.out.println("Invalid");
        }
        
    }
    public void setCgpa(double cgpa){
        if(cgpa>=0 && cgpa<=10){
            this.cgpa = cgpa;
        }
        else{
            System.out.println("Invalid CGPA");
        }
    }  

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public double getCgpa(){
        return cgpa;
    }

    public void displayDetails(){
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
    }
}
public class UniversityStudent_ManagementSystem{
    public static void main(String[] args){
        Student s1 = new Student();

        s1.setName("Rashi");
        s1.setAge(19);
        s1.setRollNumber(45);
        s1.setCgpa(8.9);

        s1.displayDetails();

    }
}
