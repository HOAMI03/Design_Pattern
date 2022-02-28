package Strategy_Pattern;

public class FastEnd implements AccelerationStrategy{
    @Override
    public int accelerate(int speed) {
        return 30;
    }
}
