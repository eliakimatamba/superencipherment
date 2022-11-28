//Ruide Xie

//EvenOddCipher class
public class EvenOddCipher extends BaseCipher {

    /**
     * constructor
     */
    public EvenOddCipher() {
        super("EvenOddCipher");
    }

    /**
     * changing string to even at front odd at last
     */
    public String encrypt(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i += 2) {
            result += input.charAt(i);
        }
        for (int i = 1; i < input.length(); i += 2) {
            result += input.charAt(i);
        }
        return result;
    }

    /**
     * changing encrypted string back to normal
     */
    public String decrypt(String input) {
        int position = (int) Math.ceil(input.length() / 2.0);
        String result = "";
        int position1 = position;
        for (int i = 0; i < position && position1 <= input.length(); i++) {
            result += input.charAt(i);
            if (result.length() == input.length()) {
                break;
            }
            result += input.charAt(position1);
            position1++;
        }
        return result;
    }

    /**
     * to print out in main
     */
    public String toString() {
        return this.getCipherName();
    }

    /**
     * checking equals
     */
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if(other == null) {
            return false;
        }else if(this.getClass()==other.getClass()){
            return true;
        }else {
            return false;
        }
    }
}
