package Observer_Pattern;

public class Salt implements Observer {

    @Override
    public void alarm(int temperature) {
        System.out.println("Salt: "+temperature);
    }

}
