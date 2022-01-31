package Test_Beispiel;

public class main {
    public static void main(String[] args) {

        Algorythm TS1 = new TopSpeed();
        Algorythm S1 = new SuperSpar();
        Algorythm E1 = new Economy();

        Motorsteuerung M1 = new Motorsteuerung(TS1);
        Motorsteuerung M2 = new Motorsteuerung(S1);
        Motorsteuerung M3 = new Motorsteuerung(E1);

        M1.useAlgorythm();
        M2.useAlgorythm();
        M3.useAlgorythm();

        System.out.println("Steuerung");

        Car C1 = new Car(20,M1);
        C1.addSteuerung(M1);
        C1.addSteuerung(M1);
        C1.notifyall();
        C1.accelerate(40);
        C1.notifyall();

    }
}
