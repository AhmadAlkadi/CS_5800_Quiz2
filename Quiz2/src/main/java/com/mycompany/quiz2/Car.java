/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

public class Car extends Vechicle implements Observer {
    String colorChange;
    
    @Override
    public void update(String colorChange) {
        this.colorChange = colorChange;
        displayChange();
    }
    
    public void DrivingBehaviors(DrivingBehaviors behavior){
        System.out.println("Car:" +behavior.behavior() + "Color" +colorChange);
    }
    
    
    void displayChange(){
        System.out.println("Traffic Light has been changed :" + colorChange);
    }
}
