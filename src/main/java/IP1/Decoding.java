package IP1;

public class Decoding {public static  Encoding encoding = new Encoding();
    private String plaintext = "";

    public void decrypt(String plaintext) {
        this.plaintext= encoding.getPlaintext();
        System.out.println("Your decrypted phrase is: "+plaintext);
    }
//    return this.getPlainText;
}
