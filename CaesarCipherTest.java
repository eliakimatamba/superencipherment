public class CaesarCipherTest {
    public static void main(String[] args) {
        // HOW TO USE THESE TESTS:
        // PLEASE UNCOMMENT AS YOU COMPLETE CODE
        // YOU WILL BE UNABLE TO RUN ANY CODE IF YOU UNCOMMENT A CALL TO A FUNCTION YOU HAVE YET TO WRITE

        CaesarCipher cipher = new CaesarCipher(0);
        System.out.println(cipher.isValid()); // False
        System.out.println(cipher.toString()); // Caesar(0)

        cipher = new CaesarCipher(26);
        System.out.println(cipher.isValid()); // False
        System.out.println(cipher.toString()); // Caesar(26)

        cipher = new CaesarCipher(13);
        System.out.println(cipher.isValid()); // True
        System.out.println(cipher.toString()); // Caesar(13)

        // Caesar(13) has a neat property
        String plaintext = "tacos taste so good!";
        String encrypt = cipher.encrypt(plaintext);
        System.out.println("gnpbf gnfgr fb tbbq!".equals(encrypt)); //True
        System.out.println(encrypt); // gnpbf gnfgr fb tbbq!

        String doubleEncrypt = cipher.encrypt(encrypt);
        System.out.println(doubleEncrypt.equals(plaintext)); //True (this is a property of Caesar(13) only)
        System.out.println(doubleEncrypt); //tacos taste so good!

        cipher = new CaesarCipher(6);
        System.out.println(cipher.isValid()); // True
        System.out.println(cipher.toString()); // Caesar(6)

        // your code should work on empty strings
        System.out.println(cipher.encrypt("").length()); // 0 (as an empty string should have been returned.)

        plaintext = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        encrypt = cipher.encrypt(plaintext);
        System.out.println("ghijklmnopqrstuvwxyzabcdef ghijklmnopqrstuvwxyzabcdef".equals(encrypt)); // true
        System.out.println(encrypt);// ghijklmnopqrstuvwxyzabcdef ghijklmnopqrstuvwxyzabcdef

        String decrypt = cipher.decrypt(encrypt);
        System.out.println("abcdefghijklmnopqrstuvwxyz abcdefghijklmnopqrstuvwxyz".equals(decrypt)); // true
        System.out.println(decrypt); // abcdefghijklmnopqrstuvwxyz abcdefghijklmnopqrstuvwxyz

    }

}
