//Ruide Xie

//EncryptUtils class
public class EncryptUtils {
    /**
     *encrypt every element in array using declared method
     */
    public static String[] encryptMany(BaseCipher baseCipher, String[] arr){
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = baseCipher.encrypt(arr[i]);
        }
        return arr1;
    }

    /**
     *decrypt every element in array using declared method
     */
    public static String[] decryptMany(BaseCipher baseCipher, String[] arr){
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = baseCipher.decrypt(arr[i]);
        }
        return arr1;
    }
}
