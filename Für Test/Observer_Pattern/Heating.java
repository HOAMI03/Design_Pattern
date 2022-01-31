package Observer_Pattern;

public class Heating implements Observer {

    @Override
    public void alarm(int temperature) {
        System.out.println("Heating: "+temperature);
    }

}
