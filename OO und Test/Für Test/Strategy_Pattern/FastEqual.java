package Strategy_Pattern;

public class FastEqual implements AccelerationStrategy{
    @Override
    public int accelerate(int speed) {
        return 40;
    }
}
