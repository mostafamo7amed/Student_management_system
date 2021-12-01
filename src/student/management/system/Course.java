/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management.system;

public class Course {
    
    public int idCourse;
    public String courseName;
    private String teacherName;
    public int courseTimePerWeek;

    public Course(int idCourse, String courseName, String teacherName) {
        this.idCourse = idCourse;
        this.courseName = courseName;
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseTimePerWeek() {
        return courseTimePerWeek;
    }

    public void setCourseTimePerWeek(int courseTimePerWeek) {
        this.courseTimePerWeek = courseTimePerWeek;
    }
    
    public void getEnrolledStudents(){
        
    }

    @Override
    public String toString() {
        return "Cource{" + "idCourse=" + idCourse + ", courseName=" + courseName + ", teacherName=" + teacherName + ", courseTimePerWeek=" + courseTimePerWeek + '}';
    }
    
}
