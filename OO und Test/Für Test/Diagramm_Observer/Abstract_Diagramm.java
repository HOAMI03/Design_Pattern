package Diagramm_Observer;

public abstract class Abstract_Diagramm implements Observer {

    protected int Seriennummer;

    public Abstract_Diagramm(int Seriennummer){
        this.Seriennummer = Seriennummer;
    }

    public int getSeriennummer(){
       return Seriennummer;
    }

}
