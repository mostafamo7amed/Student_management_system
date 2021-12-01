/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management.system;


public class Admin {
    
    //declatation of entitey
    public int id ;
    public String name;
    public String username;
    public String email;
    public int age;
    public int password;
    private String gender;

    //  constractor 
    public Admin() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    
    // getter and setter for gender entity becuse its private 
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    // method for manage teacher
    public void addNewTeacher(){
    }
    public void removeTeacher(){
    }
    
    // method for manage student
    public void addNewStudent(){
        
    }
    public void removeStudent(){
    }
    public void enrollStudentForCourse(){
    }

    @Override
    public String toString() {
        return "Admin{" + "name=" + name + ", username=" + username + ", email=" + email + ", age=" + age + ", password=" + password + ", gender=" + gender + '}';
    }
    
    
   
}
