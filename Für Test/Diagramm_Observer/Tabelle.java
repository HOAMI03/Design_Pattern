package Diagramm_Observer;

public class Tabelle extends Abstract_Diagramm{

    public Tabelle(int Seriennummer) {
        super(Seriennummer);
    }

    @Override
    public void notify(int x, int y) {
    System.out.println("Tabelle " + Seriennummer);
    }
}
