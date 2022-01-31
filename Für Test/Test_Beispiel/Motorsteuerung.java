package Test_Beispiel;

import java.util.ArrayList;

public class Motorsteuerung implements Observer {

    private int speed = 0;
    private Algorythm algorythm;

    public Motorsteuerung(Algorythm algorythm){
        this.speed = speed;
        this.algorythm = algorythm;

    }

    public void useAlgorythm(){
        System.out.println(algorythm.useAlgo());
    }

    public void changeAlgorythm(Algorythm algorythm){
        this.algorythm = algorythm;
    }

    public void accelerate(int ispeed){
        this.speed = speed + ispeed;
    }

    @Override
    public void Notify(int speed) {
        changeAlgorythm(chooseAlgorythm(speed));
        System.out.println(speed + " kmh erreicht mit dem Algorythmus: " + algorythm.useAlgo());
    }

    public Algorythm chooseAlgorythm(int speed) {

        if (speed < 50){
            return new Economy();
        }
        else if(speed < 101){
            return new TopSpeed();
        }
        else{
            return new SuperSpar();
        }

    }

}
