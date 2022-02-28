package Observer_Pattern;

public class Main {

    public static void main(String[] args) {
        Salt s1 = new Salt();
        Heating h1 = new Heating();
        TemperatureSensor t1 = new TemperatureSensor();
        t1.addObserver(s1);
        t1.addObserver(h1);
        t1.alarm();
    }

}
