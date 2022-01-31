package Strategy_Pattern;

public class Motorcycle implements VehicleInterface {

    private int speed;
    private AccelerationStrategy acceleration;

    public Motorcycle(int speed, AccelerationStrategy accelerate){
        this.speed = speed;
        this.acceleration = accelerate;
    }

    @Override
    public void drive() {
        System.out.println("You are driving " + speed);
    }

    @Override
    public void acceleration() {
        this.speed = speed + acceleration.accelerate(20);
    }

}
