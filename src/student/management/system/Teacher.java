/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management.system;

public class Teacher extends Admin {
    public double yearsExpirence;
    private String subjectTeach;
    private int noOfTeach;
    public Teacher() {
    }
    
    public Teacher(int id , String name ,String email ,int age ,String username ,int password ,double yearsExpirence ,String subjectTeach) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.username = username;
        this.password = password;
        this.subjectTeach = subjectTeach;
        this.yearsExpirence = yearsExpirence;
        
    }

    // getter and setter for subjectTeach 
    public String getSubjectTeach() {
        return subjectTeach;
    }

    public void setSubjectTeach(String subjectTeach) {
        this.subjectTeach = subjectTeach;
    }
   
    public void addBouns(int b){
    }
    public boolean CheckAttendance(){
        return false;
    }

    public double getYearsExpirence() {
        return yearsExpirence;
    }

    public void setYearsExpirence(double yearsExpirence) {
        this.yearsExpirence = yearsExpirence;
    }

    public int getNoOfTeach() {
        return noOfTeach;
    }

    public void setNoOfTeach(int noOfTeach) {
        this.noOfTeach = noOfTeach;
    }
    

    @Override
    public String toString() {
        return "Teacher{" + "yearsExpirence=" + yearsExpirence + ", subjectTeach=" + subjectTeach + ", noOfTeach=" + noOfTeach + '}';
    }
    
    
    
}
