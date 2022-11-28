//Ruide Xie

//CaesarCipher class
public class CaesarCipher extends BaseCipher{
    private int key;

    /**
     * constructor
     */
    public CaesarCipher(int key){
        super("Caesar");
        this.key = key;
    }

    /**
     * checking validity
     */
    public boolean isValid() {
        if (key <= 0 || key >= 26) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * encrypting text
     */
    public String encrypt(String text){
        String text1 = super.encrypt(text);
        String output = "";
        for(int i = 0; i<text1.length(); i++){
            if(Character.isAlphabetic(text1.charAt(i))) {
                int j = (int) (text1.charAt(i) + key);
                if (j > 122) {
                    j -= 26;
                    char c = (char) j;
                    output += c;
                } else {
                    char c = (char) (text1.charAt(i) + key);
                    output += c;
                }
            }
            else{
                output += text1.charAt(i);
            }
        }
        return output;
    }

    /**
     * decrypting text back to before
     */
    public String decrypt(String text){
        String text1 = super.encrypt(text);
        String output = "";
        for(int i = 0; i<text1.length(); i++){
            if(Character.isAlphabetic(text1.charAt(i))) {
                int j = (int) (text1.charAt(i) - key);
                if (j < 97) {
                    j += 26;
                    char c = (char) j;
                    output += c;
                } else {
                    char c = (char) (text1.charAt(i) - key);
                    output += c;
                }
            }
            else{
                output += text1.charAt(i);
            }
        }
        return output;
    }

    /**
     * to print out in main
     */
    public  String toString() {
        return this.getCipherName() + "(" + key+ ")";
    }

    /**
     * checking equals
     */
    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }else if(other == null) {
            return false;
        }else if(other instanceof CaesarCipher) {
            CaesarCipher point = (CaesarCipher) other;
            return this.key == point.key;
        }else{
            return false;
        }
    }
}

