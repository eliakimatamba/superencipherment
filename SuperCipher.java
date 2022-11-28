//Ruide Xie

//SuperCipher class
public class SuperCipher extends BaseCipher{
    private BaseCipher[] baseCipher;

    /**
     * constructor
     */
    public SuperCipher(BaseCipher[] arr){
        super("SuperCipher");
        this.baseCipher = arr;
    }

    /**
     * checking if every element in the array is true
     */
    public boolean isValid(){
        boolean a = true;
        for(int i = 0; i<this.baseCipher.length; i++){
            a = baseCipher[i].isValid();
            if(!a){
                return false;
            }
        }
        return true;
    }

    /**
     * encrypting the string with the order in the array
     */
    public String encrypt(String input){
        String cipher = input;
        for(int i=0; i<this.baseCipher.length; i++){
            cipher = this.baseCipher[i].encrypt(cipher);
        }
        return cipher;
    }

    /**
     * decrypting the string with the order in the array
     */
    public String decrypt(String input){
        String cipher = input;
        for(int i=0; i<this.baseCipher.length; i++){
                cipher = this.baseCipher[i].decrypt(cipher);
            }
            return cipher;
    }

    /**
     * to print out name from main
     */
    public String toString(){
        String statement = "(";
        for(int i = 0; i<this.baseCipher.length; i++){
            statement += this.baseCipher[i];
            if(this.baseCipher.length - 1 == i){
                break;
            }
            statement += " | ";
        }
        return this.getCipherName() + statement + ")";
    }

    /**
     * checking equals
     */
    public boolean equals(Object other){
        //having names exactly equal is equivalent to having sizes and elements the same
        if(other.toString().equals(this.toString())){
            return true;
        }else {
            return false;
        }
    }
}


