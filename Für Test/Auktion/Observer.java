package Auktion;

public interface Observer {
    public void alarm(int time);
    public void alarmAuctionEnd(int time);
}
