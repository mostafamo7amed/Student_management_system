/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management.system;

import java.util.Scanner;

public class Student extends Admin {
    
    public double grades;
    public String admissionYear;
    private int noOfStudent;
    Scanner input = new Scanner(System.in);

    public Student() {
    }

    
    public Student(int id , String name ,String email ,int age ,String username ,int password ,double grades ,String admissionYear) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.username = username;
        this.password = password;
        this.grades = grades;
        this.admissionYear = admissionYear;
        
        
    }
    public void countHigherGPA(){
        if(grades < 2)
            System.out.println("Your GPA is : "+grades +" and position is : F" );
        else if(grades >= 2 && grades <2.5)
            System.out.println("Your GPA is : "+grades +" and position is : D" );
        else if(grades >= 2.5 && grades <3)
            System.out.println("Your GPA is : "+grades +" and position is : C" );
        else if(grades >= 3 && grades <3.5)
            System.out.println("Your GPA is : "+grades +" and position is : B" );
        else if(grades >= 3.5 && grades <=4)
            System.out.println("Your GPA is : "+grades +" and position is : A" );
    }
    
    public void DisplayStudentInfo(){
        System.out.println("ID :"+ id);
        System.out.println("Name :"+ name);
        System.out.println("Email :"+ email);
        System.out.println("Age :"+ age);
        System.out.println("Username :"+ username);
        System.out.println("Password :"+ password);
        
        
    }

    public void updateStudentInfo(){
     System.out.println("ID :");
     id = input.nextInt();
     System.out.println("Name :");
     name = input.nextLine();
     System.out.println("Email :");
     email = input.nextLine();
     System.out.println("age :");
     age = input.nextInt();
     System.out.println("Username :");
     username = input.nextLine();
     System.out.println("Password :");
     password = input.nextInt();
          
    } 

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public String getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(String admissionYear) {
        this.admissionYear = admissionYear;
    }
    
    public void viewGrades(){
        System.out.println("Your grades is :"+grades);
    }

    @Override
    public String toString() {
        return "Student{" + "grades=" + grades + ", admissionYear=" + admissionYear + ", noOfStudent=" + noOfStudent + ", input=" + input + '}';
    }
    
    
}
