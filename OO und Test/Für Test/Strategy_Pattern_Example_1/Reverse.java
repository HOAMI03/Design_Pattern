package Strategy_Pattern_Example_1;

public class Reverse implements Encrypter {

    @Override
    public String encrypt(String toEncrypt) {
        String Encrypted = "Reverse: " + toEncrypt;
        return(Encrypted);
    }
}
