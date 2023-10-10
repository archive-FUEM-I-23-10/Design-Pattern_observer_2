package com.cc.java;

import com.cc.java.observers.*;
import com.cc.java.subject.Subject;

public class App {
    
    public static void main(String[] args) {

      Subject s = new Subject();

      Observer_1 o1 = new Observer_1(s, "observer_1");
      Observer_2 o2 = new Observer_2(s, "observer_2");


      /*
      s.setState("state 1");
      Logger.ausgabe("-------------");
      s.setState("state 2");
      Logger.ausgabe("------------");
      s.setState("state 3");
      Logger.ausgabe("------------");
      s.detatch(o1);
      s.setState("state 2");
      Logger.ausgabe("------------");
      s.attach(o1);
      s.setState("state 4");
      Logger.ausgabe("------------");
      */

      s.setState("Neues Video von Walulis!");


    }

}
