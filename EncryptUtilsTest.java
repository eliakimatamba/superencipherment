import java.util.Arrays;

public class EncryptUtilsTest {
    public static void main(String[] args) {
        // HOW TO USE THESE TESTS:
        // PLEASE UNCOMMENT AS YOU COMPLETE CODE
        // YOU WILL BE UNABLE TO RUN ANY CODE IF YOU UNCOMMENT A CALL TO A FUNCTION YOU HAVE YET TO WRITE

        // Note, this test focuses on EncryptUtils, but does use code from other ciphers, don't expect it to work if
        // the individual cipher tests fail.

        CaesarCipher caesarCipher = new CaesarCipher(1);
        EvenOddCipher evenOddCipher = new EvenOddCipher();
        WordReplacementCipher wordReplacementCipher = new WordReplacementCipher("al", "be");

        String[] base = {"alphabet", "tornado", "tomatoes", "dog"};
        String[] encoded = EncryptUtils.encryptMany(caesarCipher, base);
        String[] decoded = EncryptUtils.decryptMany(caesarCipher, encoded);
        System.out.println(Arrays.toString(encoded)); // [bmqibcfu, upsobep, upnbupft, eph]
        System.out.println(Arrays.toString(decoded)); // [alphabet, tornado, tomatoes, dog]
//
        encoded = EncryptUtils.encryptMany(evenOddCipher, base);
        decoded = EncryptUtils.decryptMany(evenOddCipher, encoded);
        System.out.println(Arrays.toString(encoded)); // [apaelhbt, traoond, tmteoaos, dgo]
        System.out.println(Arrays.toString(decoded)); // [alphabet, tornado, tomatoes, dog]
//
        encoded = EncryptUtils.encryptMany(wordReplacementCipher, base);
        decoded = EncryptUtils.decryptMany(wordReplacementCipher, encoded);
        System.out.println(Arrays.toString(encoded)); // [bephabet, tornado, tomatoes, dog]
        System.out.println(Arrays.toString(decoded)); // [alphaalt, tornado, tomatoes, dog]
    }
}
/* correct output:

[bmqibcfu, upsobep, upnbupft, eph]
[alphabet, tornado, tomatoes, dog]
[apaelhbt, traoond, tmteoaos, dgo]
[alphabet, tornado, tomatoes, dog]
[bephabet, tornado, tomatoes, dog]
[alphaalt, tornado, tomatoes, dog]

 */

