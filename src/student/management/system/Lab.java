/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management.system;

public class Lab {
   public int numberofLabs ; 
   public String labLocation;
   public boolean finalExamRequierd;

    public Lab() {
    }

    public int getNumberofLabs() {
        return numberofLabs;
    }

    public void setNumberofLabs(int numberofLabs) {
        this.numberofLabs = numberofLabs;
    }

    public String getLabLocation() {
        return labLocation;
    }

    public void setLabLocation(String labLocation) {
        this.labLocation = labLocation;
    }

    public boolean isFinalExamRequierd() {
        return finalExamRequierd;
    }

    public void setFinalExamRequierd(boolean finalExamRequierd) {
        this.finalExamRequierd = finalExamRequierd;
    }
   
   public void avarageScoure(){
   
   }

    @Override
    public String toString() {
        return "Lab{" + "numberofLabs=" + numberofLabs + ", labLocation=" + labLocation + ", finalExamRequierd=" + finalExamRequierd + '}';
    }
   
   
}
