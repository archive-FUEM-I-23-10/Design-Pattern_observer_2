package com.cc.java.subject;

import com.cc.java.observers.Observer;

public interface Observable {
    
    public abstract void attach(Observer o);
    public abstract void detatch(Observer o);
    public abstract void notifyObservers();

}
 