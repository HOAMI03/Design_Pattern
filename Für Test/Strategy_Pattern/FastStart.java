package Strategy_Pattern;

public class FastStart implements AccelerationStrategy{
    @Override
    public int accelerate(int speed) {
        return speed;
    }
}
