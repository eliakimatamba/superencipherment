//Ruide Xie
// This class is provided AS-IS, and is correct for the minimum requirements of project 2.

public class BaseCipher {
    private String cipherName;

    public BaseCipher(String cipherName) {
        this.cipherName = cipherName;
    }

    public String getCipherName() {
        return cipherName;
    }

    public boolean isValid() {
        return true;
    }

    public String encrypt(String input) {
        return input.toLowerCase();
    }

    public String decrypt(String input) {
        return input.toUpperCase();
    }

    @Override
    public String toString() {
        return cipherName;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        } else if (other == null) {
            return false;
        } else if (other instanceof BaseCipher) {
            BaseCipher cipher = (BaseCipher) other;
            return cipher.cipherName.equals(this.cipherName);
        } else {
            return false;
        }
    }
}
