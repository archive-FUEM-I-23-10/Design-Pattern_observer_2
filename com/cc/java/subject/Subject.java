package com.cc.java.subject;

import java.util.ArrayList;
import java.util.List;

import com.cc.java.Logger;
import com.cc.java.observers.Observer;

public class Subject implements Observable{

    private List<Observer> observers = new ArrayList<>();
    private String state;

     // registration interface ...
    @Override
    public void attach(Observer o) {
       observers.add(o);
    }

    // deregistration interface()
    @Override
    public void detatch(Observer o) {
        observers.remove(o);
    }

    // Notification interface
    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            //o.update(); // Pull
            o.update(state); // Push
        }  
    }

    // Bei Push() eigentlich nicht notwendig ....
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        Logger.ausgabe("The subject's state is now: " + state);
        notifyObservers();
    }

    

    
}
