package Strategy_Pattern;

public abstract class Vehicle {

    private int speed;
    protected AccelerationStrategy acceleration;

    public Vehicle(int speed, AccelerationStrategy accelerate){
        this.speed = speed;
        this.acceleration = accelerate;
    }

  public abstract void drive();

  public void acceleration(){
        this.speed = speed + acceleration.accelerate(20);
  }


}
