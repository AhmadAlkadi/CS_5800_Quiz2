/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TrafficLight implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private Random rand = new Random();
    private String color;
    
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(color);
        }
    }
    
    String getColor(){
        return color;
    }
    
    void SignalColor(){
        int randTraffic = rand.nextInt(3);
        
        if(randTraffic == 0){
            color = "Red";
        } else if(randTraffic == 1){
            color = "Yellow";
        }else{
            color = "Green";
        }
        notifyObservers();
        this.color = color;
    }
    
}
