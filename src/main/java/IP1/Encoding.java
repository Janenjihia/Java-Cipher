package IP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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

    public String userInput() {
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
        public String cipher(){
            String[] alphabets = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
            List<String> myList = new ArrayList(List.of(alphabets));
            this.setPlaintext(this.plaintext);

            for(int i = 0; i < this.getPlaintext().length(); ++i) {
                Character myletter = this.getPlaintext().charAt(i);
                Integer currentIndex = myList.indexOf(myletter.toString());
                String cipherLetter = "";
                if (myletter > 'A' && myletter < 'z') {
                    myletter = (char)(myletter + this.cipherKey);
                } else if (myletter > 'Z') {
                    myletter = (char)(myletter + 'A' - 'Z' - 1);
                    Integer cipherKey = currentIndex + this.cipherKey;
                    cipherLetter = (String)myList.get(cipherKey);
                    this.cipherText = this.cipherText + cipherLetter;
                }

                System.out.println(cipherLetter);
            }

            return this.cipherText;
        }

    }






}
