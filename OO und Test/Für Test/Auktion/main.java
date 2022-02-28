package Auktion;



public class main {

    public static void main(String[] args) {

      Person P1 = new Person();
      Person P2 = new Person();
      Auction A1 = new Auction();
      A1.addObserver(P1);
      A1.addObserver(P2);
      A1.placeBid();

    }

}
