//Ruide Xie

//WordReplacementCipher class
public class WordReplacementCipher extends BaseCipher{
    private String from, to;

    /**
     * constructor
     */
    public WordReplacementCipher(String from, String to) {
        super("WordReplacementCipher");
        this.from = from;
        this.to = to;
    }

    /**
     * encrypt replacing key words
     */
    public String encrypt(String input){
        return input.replace(this.from, this.to);
    }

    /**
     * decrypt replacing key words
     */
    public String decrypt(String input){
        return input.replace(this.to, this.from);
    }

    /**
     * to print out name from main
     */
    public String toString() {
        return this.getCipherName() +"(" + from + ", " + to + ")";
    }

    /**
     * checking equals
     */
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other == null) {
            return false;
        } else if (other instanceof WordReplacementCipher) {
            WordReplacementCipher point = (WordReplacementCipher) other;
            return this.from == point.from && this.to == point.to;
        } else {
            return false;
        }
    }
}
