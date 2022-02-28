package Test_Beispiel;

import java.util.ArrayList;

public class Car {
    private int speed;
    private Motorsteuerung Motor;
    private ArrayList<Observer> observers;

    public Car(int speed,Motorsteuerung Motor){
        observers = new ArrayList<Observer>();
        this.Motor = Motor;
        this.speed = speed;
    }

    public void addSteuerung(Observer observer){
        observers.add(observer);
    }

    public void accelerate(int speed){
this.speed = speed + speed;
    }

    public void capped(int speed){
      Motor.chooseAlgorythm(speed);
    }

    public void notifyall(){
        for (Observer observer: observers){
            observer.Notify(speed);
        }
    }

}
