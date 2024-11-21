/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

public class Aggressive implements DrivingBehaviors, Observer{
    String color;
    
    @Override
    public void update(String color) {
        this.color = color;
    }
    
    public String behavior(){
        if(color.equals("Red")){
            return "Slam Brake";
        }
        if(color.equals("Yellow")){
            return "Faster";
        }
        if(color.equals("Green")){
            return "Need4Speed";
        }
        return "";
    }
}
