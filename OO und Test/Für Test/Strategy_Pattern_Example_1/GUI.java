package Strategy_Pattern_Example_1;

public class GUI {

    private String text = "";
    private Encrypter encrypter;

    public GUI(Encrypter encrypter, String text){
        this.text = text;
        this.encrypter = encrypter;
    }

    public void Encript(){
        System.out.println(encrypter.encrypt(text));
    }

}
