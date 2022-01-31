package Strategy_Pattern;

public class Car extends Vehicle {

    @Override
    public void drive() {
        this.acceleration.accelerate(40);
    }

    @Override
    public void acceleration() {
        super.acceleration();
    }   //Unnötig

    public Car(int speed, AccelerationStrategy accelerate){
        super(speed, accelerate);

    }

}
