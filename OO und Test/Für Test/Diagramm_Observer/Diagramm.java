package Diagramm_Observer;

import java.util.ArrayList;

public class Diagramm {

    private ArrayList<Observer> observers;

    public Diagramm(){
        observers = new ArrayList<Observer>();
    }

    public void addDiagramm(Observer observer){
        observers.add(observer);
    }

    public void notifyall(){
        for (Observer observer: observers){
            observer.notify(1,2);
        }
    }

}
