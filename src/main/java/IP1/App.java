package IP1;

public class App {
    public  static  Encoding  encoding =new Encoding();
    public  static  Decoding  decoding =new Decoding();

    public static void main(String[] args) {
        encoding.userInput();
        System.out.println("Your cipher text is" + "" + encoding.cipher());

        decoding.decyrpt(encoding.getPlaintext());
        System.out.println("Your decrypted phrase is: " + encoding.cipher());
    }
}
