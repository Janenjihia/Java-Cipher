package IP1;

public class Encoding {

    private String plaintext = "";
    public Integer cipherKey;
    public String cipherText = "";

    public Encoding() {
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext.toUpperCase();
    }

    public String getPlaintext() {
        return this.plaintext;
    }

    public void userInput() {
        try {
            System.out.print("Enter Plaintext: ");
            InputStreamReader streamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(streamReader);
            String plaintext = bufferedReader.readLine();
            System.out.print("Enter your Key: ");
            String cipherKey = bufferedReader.readLine();
            this.cipherKey = Integer.parseInt(cipherKey);
            this.setPlaintext(plaintext);
        } catch (Exception var5) {
            var5.printStackTrace();
        }

    }






}
