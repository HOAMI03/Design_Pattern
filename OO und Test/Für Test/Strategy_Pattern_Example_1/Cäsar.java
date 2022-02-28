package Strategy_Pattern_Example_1;

public class Cäsar implements Encrypter {

    @Override
    public String encrypt(String toEncrypt) {
        String Encrypted = "Caesar: " + toEncrypt;
        return(Encrypted);
    }
}
