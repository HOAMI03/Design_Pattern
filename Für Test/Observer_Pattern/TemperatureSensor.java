package Observer_Pattern;
import java.util.ArrayList;

public class TemperatureSensor {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private Observer observer;


    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void alarm(){
        for(Observer observer:observers){
            observer.alarm(-2);
        }
    }

}
