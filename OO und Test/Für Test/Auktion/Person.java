package Auktion;

public class Person implements Observer {
    @Override
    public void alarm(int time) {
        System.out.println("Neue Auktion! Zeit: " + time);
    }

    @Override
    public void alarmAuctionEnd(int time) {
        System.out.println("Ende der Auktion! Sie hat " + time + "gedauert");
    }
}
