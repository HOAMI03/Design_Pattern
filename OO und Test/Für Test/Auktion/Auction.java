package Auktion;

import java.util.ArrayList;
import java.util.List;

public class Auction {

    private ArrayList<Observer> observers = new ArrayList<Observer>();


    public void placeBid(){
        for (Observer observer: observers)
            observer.alarm(25);
        {

        }
    }

    public void endAuction(){
        for (Observer observer: observers)
        observer.alarmAuctionEnd(25);
             {

        }

    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
