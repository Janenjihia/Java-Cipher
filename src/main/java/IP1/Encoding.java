package IP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Encoding {

//    public int encodeKey(int cipherKey){
//        if (cipherKey < 0  ){
//            throw new IllegalArgumentException("Enter encryption key between 0 - 25");
//        } else if (cipherKey> 25) {
//            throw new IllegalArgumentException("Enter encryption key between 0 - 25");
//        } else {
//            return cipherKey;
//        }
//    }
    private String plaintext = "";
    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext.toUpperCase();
    }
    public String getPlaintext() {
        return this.plaintext;
    }
    public Integer cipherKey;
    public String cipherText = "";

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
//            return "";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String cipher() {
        String[] alphabets = {
                "A", "B", "C", "D", "E", "F", "G",
                "H", "I", "J", "K", "L", "M", "N",
                "O", "P", "Q", "R", "S", "T", "U",
                "V", "W", "X", "Y", "Z"
        };
        List<String> myList = new ArrayList<String>(List.of(alphabets));
        this.setPlaintext(plaintext);

        for (int i = 0; i < this.getPlaintext().length(); i++) {
            Character myletter;
            myletter = this.getPlaintext().charAt(i);
            Integer currentIndex = myList.indexOf(myletter.toString());
            String cipherLetter = "";
            if (myletter > 'A' && myletter < 'z') {
                myletter = (char) (myletter + cipherKey);
            } else if (myletter > 'Z') {
                myletter = (char) (myletter + 'A' - 'Z' - 1);
//            Integer currentIndex = myList.indexOf(myletter.toString());
                Integer cipherKey = currentIndex + this.cipherKey;
                cipherLetter = myList.get(cipherKey);
                this.cipherText = this.cipherText + "" + cipherLetter;
            }
            System.out.println(cipherLetter);
        }

//        System.out.println(this.cipherKey);
        return this.cipherText;

    }

}
