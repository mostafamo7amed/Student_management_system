/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management.system;

public class Art {
    public double price;
    public String place;
    public int allowedTeamNumber;

    public Art() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getAllowedTeamNumber() {
        return allowedTeamNumber;
    }

    public void setAllowedTeamNumber(int allowedTeamNumber) {
        this.allowedTeamNumber = allowedTeamNumber;
    }

    
    public int calcAllowedTeamNumber() {
        return allowedTeamNumber;
    }

    public double calcPrice() {
        return price;
    }
    
    public void getWinnerTeam(){
        
    }

    @Override
    public String toString() {
        return "Art{" + "price=" + price + ", place=" + place + ", allowedTeamNumber=" + allowedTeamNumber + '}';
    }
    
    
}
