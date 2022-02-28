package Diagramm_Observer;

public class main {
    public static void main(String[] args) {

        Tabelle T1 = new Tabelle(1);
        Tabelle T2 = new Tabelle(2);

        Diagramm D1 = new Diagramm();

        D1.addDiagramm(T1);
        D1.addDiagramm(T2);
        D1.notifyall();
    }
}
