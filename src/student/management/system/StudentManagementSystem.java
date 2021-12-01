/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management.system;

import java.util.Scanner;

public class StudentManagementSystem {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean x,y,z,d;
        int n ,password ,nA,nT,nS;
        String username;
        Admin[] admin =new Admin[1];  // array of object
        // inicialize admin 1
        admin[0] = new Admin();
        admin[0].id = 1;
        admin[0].name = "D.Irfan";
        admin[0].username = "admin";
        admin[0].password = 12345;
        admin[0].age = 23;
        admin[0].email = "admin1@gmail.com";
       
        
        //inicialize teacher with damy data
        Teacher[] teacher = new Teacher[100];   // array of object
        teacher[0] = new Teacher();
        teacher[0].name ="asd";
        teacher[0].email="asd@gmail.com";
        teacher[0].username="asd";
        teacher[0].password=123;
        teacher[0].age=43;
        teacher[1] = new Teacher();
        teacher[1].name ="dd";
        teacher[1].email="ddd@gmail.com";
        teacher[1].username="dd";
        teacher[1].password=123;
        teacher[1].age=43;
        for(int i=2;i<100;i++){
            teacher[i] = new Teacher();
        }
        
        // inicialize student data
        Student[] student = new Student[1000];  // array of object
        student[0] = new Student();
        student[0].name = "ahmed";
        student[0].email ="ahmed@gmail.com";
        student[0].age = 20;
        student[0].username = "ahmed";
        student[0].password=123;
        student[0].id=0;
        student[0].grades=2.3;
        student[1] = new Student();
        student[1].name = "ali";
        student[1].email ="ali@gmail.com";
        student[1].age = 20;
        student[1].username = "ali";
        student[1].password=123;
        student[1].id=0;
        student[1].grades=3.4;
        for(int i=2;i<1000;i++){
            student[i] = new Student();
        }
        //inicialize corses with damy data
        Course[] course = new Course[6];   // array of object
        course[0] = new Course(0, "math", "Dr.amged");
        course[1] = new Course(1, "Logic", "Dr.safoat");
        course[2] = new Course(2, "oop", "Dr.ramy");
        course[3] = new Course(3, "programming language C++", "Dr.marwa");
        course[4] = new Course(4, "Software management", "Dr.Ali");
        course[5] = new Course(5, "Aotumata", "Dr.zakaria");
        
        // lab data
        Lab[] lab = new Lab[1];
        lab[0] = new Lab();
        lab[0].labLocation = "first";
        lab[0].numberofLabs = 1;
        lab[0].finalExamRequierd = true;
        // Art
        Art[] art =new Art[1];
        art[0] = new Art();
        art[0].place = "teapa";
        art[0].price = 500;
        art[0].allowedTeamNumber = 5;
        
        // theroetical
        Theoretical[] theoreticals = new Theoretical[1];
        theoreticals[0] = new Theoretical();
        theoreticals[0].numberOfLeactures = 6;
        theoreticals[0].passDegree =50;
        for(;;){
            System.out.println("------------------Welcome to Student Management System-------------------");
            System.out.println("1- Admin");
            System.out.println("2- Teacher");
            System.out.println("3- Student");
            System.out.println("4- Exit");

            x=true;
	    do{
              System.out.print("Enter your choice number :");
	      n=input.nextInt();
	      if(n>=5 || n<=0){
	         System.out.println("#####  Wrong Entry! .... Please Try Again ....  #####");
	         n=input.nextInt();
	      }else{
                  x=false;
              }
	    }while(x);
            
            if (n==1){
                    System.out.println("------------------Welcome to Administration system-------------------");
                    boolean checkU = false, checkP = false, pass = false ; 
                    int adminid=0;
	            do{
                        System.out.print("Enter Username:"); 
                        username = input.next();
                        System.out.print("Enter Password:"); 
                        password = input.nextInt();
                        for (int i = 0 ; i< admin.length; i++){
                           if (username.trim().equals(admin[i].username)){
                               checkU =true; 
                           }
                           if (password == admin[i].password) {
                               checkP =true;
                               adminid=i;
                            }    
                         }
                         if (checkU == true && checkP == true ){
                              System.out.println("------------✔✔✔✔ Log in SUCCESSFULLY ✔✔✔✔--------------------");
                              pass= true;
                              
                           }
                         else{
                             pass=false ; 
                             System.out.println("#####  Wrong Entry! ... Please Try Again  #####");
                          }
	            
                        }
                    while(pass== false ); 
                    for(;;){
                            System.out.println("------------------Welcome "+admin[0].name+"-------------------");
                            System.out.println("1- Add Teacher");
                            System.out.println("2- Remove Teacher");
                            System.out.println("3- Add Student");
                            System.out.println("4- Remove Student");
                            System.out.println("5- Exit");
                            
                              y=true;
	                    do{
                                System.out.print("Enter your choice number :");
	                        nA=input.nextInt();
	                        if(nA>=6 || nA<=0){
	                        System.out.println("#####  Wrong Entry! ... Please Try Again  #####");
	                        nA=input.nextInt();
	                        }else{
                                    y=false;
                                }
	                    }while(y);
                            if(nA == 1){
                                String tName,tEmail,tUsername;
                                double tYearOfExperiance;
                                int tID ,tAge ,tPassword;
                                System.out.print("Enter Teacher id : ");
                                tID= input.nextInt();
                                System.out.print("Enter Teacher name : ");
                                tName = input.next();
                                System.out.print("Enter Teacher age : ");
                                tAge = input.nextInt();
                                System.out.print("Enter Teacher email : ");
                                tEmail = input.next();
                                System.out.println("Enter number of year experiance  : ");
                                tYearOfExperiance = input.nextDouble();
                                System.out.println("Enter Teacher username : ");
                                tUsername = input.next();
                                System.out.println("eNTER Teacher password : ");
                                tPassword = input.nextInt();
                                teacher[tID] = new Teacher(tID, tName, tEmail, tAge, tUsername, tPassword, tYearOfExperiance, null);
                                System.out.println("--------------✔✔✔✔ Teacher Added SUCCESSFULLY ✔✔✔✔-------------");
                            }
                            if(nA==2){
                                int num;
                                System.out.print("Enter teacher Id : ");
                                num = input.nextInt();
                                teacher[num].name ="";
                                teacher[num].email ="";
                                teacher[num].age = 0;
                                teacher[num].yearsExpirence = 0.0;
                                System.out.println("--------------✔✔✔✔ Teacher Removed SUCCESSFULLY ✔✔✔✔--------------");             
                                
                            }
                            if(nA==3){
                                String sName,sEmail,sUsername;
                                int sID ,sAge ,sPassword;
                                System.out.print("Enter Student id : ");
                                sID= input.nextInt();
                                System.out.print("Enter Student name : ");
                                sName = input.next();
                                System.out.print("Enter Student age : ");
                                sAge = input.nextInt();
                                System.out.print("Enter Student email : ");
                                sEmail = input.next();
                                System.out.println("Enter Student username : ");
                                sUsername = input.next();
                                System.out.println("eNTER Student password : ");
                                sPassword = input.nextInt();
                                student[sID] = new Student(sID, sName, sEmail, sAge, sUsername, sPassword, 0.0, null);
                                System.out.println("--------------✔✔✔✔ Student Added SUCCESSFULLY ✔✔✔✔--------------");
                            }
                            if(nA==4){
                                int num;
                                System.out.print("Enter teacher Id : ");
                                num = input.nextInt();
                                student[num].name ="";
                                student[num].email ="";
                                student[num].age =0;
                                System.out.println("--------------✔✔✔✔ Student Removed SUCCESSFULLY ✔✔✔✔--------------");}
                            if(nA == 5){
                                break;
                            }
                            
                        }
                       
            }
            if(n==2){
                    System.out.println("------------------Welcome to Teacher system-------------------");
                    boolean checkU = false, checkP = false, pass = false ; 
                    int teacherid=0;
	            do{
                        System.out.print("Enter Username:"); 
                        username = input.next();
                        System.out.print("Enter Password:"); 
                        password = input.nextInt();
                        for (int i = 0 ; i< teacher.length; i++){
                           if (username.trim().equals(teacher[i].username)){
                               checkU =true; 
                           }
                           if (password == teacher[i].password) {
                               checkP =true;
                               teacherid=i;
                            }    
                         }
                         if (checkU == true && checkP == true ){
                              System.out.println("------------✔✔✔✔ Log in SUCCESSFULLY ✔✔✔✔--------------------");
                              pass= true;
                              
                           }
                         else{
                             pass=false ; 
                             System.out.println("#####  Wrong Entry! ... Please Try Again  #####");
                          }
	            
                        }
                    while(pass== false );
                    for(;;){
                            System.out.println("------------------Welcome------------------------");
                            System.out.println("1- Personal information ");
                            System.out.println("2- Add Course");
                            System.out.println("3- Remove Course");
                            System.out.println("4- Exit");
                            
                              z=true;
	                    do{
                                System.out.print("Enter your choice number :");
	                        nT=input.nextInt();
	                        if(nT>=5 || nT<=0){
	                            System.out.println("#####  Wrong Entry! ... Please Try Again  #####");
	                            nT=input.nextInt();
	                        }else{
                                    z=false;
                                }
	                    }
                            while(z);
                            if(nT==1){
                                System.out.println("Name : "+teacher[teacherid].name);
                                System.out.println("Age : "+teacher[teacherid].age);
                                System.out.println("Email : "+teacher[teacherid].email);
                                System.out.println("Username : "+teacher[teacherid].username);
                                System.out.println("Password : "+teacher[teacherid].password);
                                System.out.println("Year of experiance : "+teacher[teacherid].yearsExpirence);
                            }
                            if(nT==2){
                                int cId;
                                String cName;
                                String tName = teacher[teacherid].name;
                                System.out.print("Enter Course id : ");
                                cId= input.nextInt();
                                System.out.print("Enter Course name : ");
                                cName= input.next();
                                course[cId] = new Course(cId, cName, tName);
                                System.out.println("--------------✔✔✔✔ Course Add SUCCESSFULLY ✔✔✔✔-------------- ");
                            }
                            if(nT==3){
                               int cId;
                               System.out.print("Enter Course id : ");
                               cId= input.nextInt();
                               course[cId] = new Course(0, null, null);
                               System.out.println("--------------✔✔✔✔ Course Removed SUCCESSFULLY ✔✔✔✔--------------  ");
                            
                            }
                            if(nT==4){
                                break;
                            }

                            
                    }
            
          
                            
                    
                    
            }
            if(n==3){
                 System.out.println("------------------Welcome to Student system-------------------");
                    boolean checkU = false, checkP = false, pass = false ; 
                    int studentid=0;
	            do{
                        System.out.print("Enter Username:"); 
                        username = input.next();
                        System.out.print("Enter Password:"); 
                        password = input.nextInt();
                        for (int i = 0 ; i< student.length; i++){
                           if (username.trim().equals(student[i].username)){
                               checkU =true; 
                           }
                           if (password == student[i].password) {
                               checkP =true;
                               studentid=i;
                            }    
                         }
                         if (checkU == true && checkP == true ){
                              System.out.println("------------✔✔✔✔ Log in SUCCESSFULLY ✔✔✔✔--------------------1");
                              pass= true;
                              
                           }
                         else{
                             pass=false ; 
                             System.out.println("#####  Wrong Entry! ... Please Try Again  #####");
                          }
	            
                        }
                    while(pass== false );
                    for(;;){
                            System.out.println("------------------Welcome -------------------");
                            System.out.println("1- Personal Information");
                            System.out.println("2- View GPA");
                            System.out.println("3- Update personal Informatio");
                            System.out.println("4- View Courses");
                            System.out.println("5- Exit");
                            
                              d=true;
	                    do{
                                System.out.print("Enter your choice number :");
	                        nS=input.nextInt();
	                        if(nS>=6 || nS<=0){
	                            System.out.println("#####  Wrong Entry! ... Please Try Again  #####");
	                            nS=input.nextInt();
	                        }else{
                                    d=false;
                                }
	                    }
                            while(d);
                            if(nS==1){
                                student[studentid].DisplayStudentInfo();
                            }
                            if(nS==2){
                                student[studentid].countHigherGPA();
                            }
                            if(nS==3){
                               String sName,sEmail,sUsername;
                                int sID ,sAge ,sPassword;
                          
                                System.out.println("Enter Student name : ");
                                sName = input.next();
                                System.out.println("Enter Student age : ");
                                sAge = input.nextInt();
                                System.out.println("Enter Student email : ");
                                sEmail = input.next();
                                System.out.println("Enter Student username : ");
                                sUsername = input.next();
                                System.out.println("Enter Student password : ");
                                sPassword = input.nextInt();
                                student[studentid] = new Student(studentid, sName, sEmail, sAge, sUsername, sPassword, 0.0, null);
                               System.out.println("--------------✔✔✔✔ Student data updated SUCCESSFULLY ✔✔✔✔--------------  ");
                            }
                            if(nS==4){
                               for(int i = 0 ;i<course.length;i++){
                                   System.out.println(i+"- Course Name : "+ course[i].courseName);
                                   System.out.println(i+"- Course Teacher : "+ course[i].getTeacherName());
                                   System.out.println("----------------------------------------------------------------------------");
                               }
                               System.out.println(lab[0].toString());
                               System.out.println("----------------------------------------------------------------------------");
                               
                                System.out.println(art[0].toString());
                               System.out.println("----------------------------------------------------------------------------");
                               
                                System.out.println(theoreticals[0].toString());
                            }
                            if(nS==5){
                               break;
                            }
                   }
            }
            if(n==4)
                 break;
                
        
        }
        
        
        
    }
}  

