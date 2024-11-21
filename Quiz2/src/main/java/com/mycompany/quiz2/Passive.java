/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

public class Passive implements DrivingBehaviors, Observer{
    String color;
    
    @Override
    public void update(String color) {
        this.color = color;
    }
    
    public String behavior(){
        if(color.equals("Red")){
            return "Stop";
        }
        if(color.equals("Yellow")){
            return "Slower";
        }
        if(color.equals("Green")){
            return "Go Slow";
        }
        return "";
    }
}
