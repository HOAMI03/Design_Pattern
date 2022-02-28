package Strategy_Pattern;

public class Main {

    public static void main(String[] args) {

        FastStart FS = new FastStart();
        FastEnd FE = new FastEnd();
        FastEqual FEQ = new FastEqual();

        Motorcycle m1 = new Motorcycle(20,FS);
        Car c1 = new Car(20,FE);
        Motorcycle m2 = new Motorcycle(20,FEQ);



        System.out.println("--Motorcyle 1--");
        m1.drive();
        m1.acceleration();
        m1.drive();
        System.out.println("--Car 1--");
        c1.drive();
        c1.acceleration();
        c1.drive();
        System.out.println("--Motorcyle 2--");
        m2.drive();
        m2.acceleration();
        m2.drive();
        System.out.println("--Irgendein vehicle--");








    }

}
