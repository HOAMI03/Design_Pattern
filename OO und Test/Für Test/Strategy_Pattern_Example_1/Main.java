package Strategy_Pattern_Example_1;

public class Main {
    public static void main(String[] args) {

        Encrypter R1 = new Reverse();
        Cäsar C1 = new Cäsar();

        GUI G1 = new GUI(R1,"Drip");
        GUI G2 = new GUI(C1, "Snens");

        G1.Encript();
        G2.Encript();

    }
}
