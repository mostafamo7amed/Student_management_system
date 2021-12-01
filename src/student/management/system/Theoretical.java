/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management.system;


public class Theoretical {
    public int numberOfLeactures;
    public double passDegree;

    public Theoretical() {
    }

    public int getNumberOfLeactures() {
        return numberOfLeactures;
    }

    public void setNumberOfLeactures(int numberOfLeactures) {
        this.numberOfLeactures = numberOfLeactures;
    }

    public double getPassDegree() {
        return passDegree;
    }

    public void setPassDegree(double passDegree) {
        this.passDegree = passDegree;
    }

    
    public Theoretical(int numberOfLeactures, double passDegree) {
        this.numberOfLeactures = numberOfLeactures;
        this.passDegree = passDegree;
    }
    
    public void calcPassDegree(){
       if(passDegree < 2)
            System.out.println("Your GPA is : "+passDegree +" and position is : F" );
        else if(passDegree >= 2 && passDegree <2.5)
            System.out.println("Your GPA is : "+passDegree +" and position is : D" );
        else if(passDegree >= 2.5 && passDegree <3)
            System.out.println("Your GPA is : "+passDegree +" and position is : C" );
        else if(passDegree >= 3 && passDegree <3.5)
            System.out.println("Your GPA is : "+passDegree +" and position is : B" );
        else if(passDegree >= 3.5 && passDegree <=4)
            System.out.println("Your GPA is : "+passDegree +" and position is : A" );
    }

    @Override
    public String toString() {
        return "Theoretical{" + "numberOfLeactures=" + numberOfLeactures + ", passDegree=" + passDegree + '}';
    }
    
    
}
