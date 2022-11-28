public class WordReplacementCipherTest {
    public static void main(String[] args) {
        // HOW TO USE THESE TESTS:
        // PLEASE UNCOMMENT AS YOU COMPLETE CODE
        // YOU WILL BE UNABLE TO RUN ANY CODE IF YOU UNCOMMENT A CALL TO A FUNCTION YOU HAVE YET TO WRITE

        // tests for constructor isValid, toString, and equals
        WordReplacementCipher wrc1 = new WordReplacementCipher("al", "be");
        WordReplacementCipher wrc2 = new WordReplacementCipher("al", "be");
        WordReplacementCipher wrc3 = new WordReplacementCipher("al", "ga");
        WordReplacementCipher wrc4 = new WordReplacementCipher("ga", "be");
        WordReplacementCipher wrc5 = new WordReplacementCipher("ga", "be");

        System.out.println(wrc1.toString()); // WordReplacementCipher(al, be)
        System.out.println(wrc3.toString()); // WordReplacementCipher(al, ga)
        System.out.println(wrc4.toString()); // WordReplacementCipher(ga, be)

        System.out.println(wrc1.equals(wrc2)); // true
        System.out.println(wrc1.equals(wrc3)); // false
        System.out.println(wrc1.equals(wrc4)); // false
        System.out.println(wrc3.equals(wrc4)); // false
        System.out.println(wrc4.equals(wrc5)); // true

        // tests for encrypt and decrypt
        String test = "";
        String encrypt = wrc1.encrypt(test);
        String decrypt = wrc1.decrypt(test);
        System.out.println(encrypt.length()); // 0 (empty string return expected)
        System.out.println(decrypt.length()); // 0 (empty string return expected)

        test = "taco";
        encrypt = wrc1.encrypt(test);
        decrypt = wrc1.decrypt("taco");
        System.out.println(encrypt); // taco
        System.out.println(decrypt); // taco

        test = "alphabet";
        encrypt = wrc1.encrypt(test);
        decrypt = wrc1.decrypt("bephabet");
        System.out.println(encrypt); // bephabet
        System.out.println(decrypt); // alphaalt (word replacements are not always reversible...)

        test = "alphabet";
        encrypt = wrc3.encrypt(test);
        decrypt = wrc3.decrypt("gaphabet");
        System.out.println(encrypt); // gaphabet
        System.out.println(decrypt); // alphabet

        test = "gara";
        encrypt = wrc5.encrypt(test);
        decrypt = wrc5.decrypt("bera");
        System.out.println(encrypt); // bera
        System.out.println(decrypt); // gara

        // Tests that make sure the inheritance structure is as expected.
        System.out.println(wrc1 instanceof BaseCipher); // true
        // the following code should compile and run correctly.
        BaseCipher bc = wrc1;
        System.out.println(bc.encrypt("alba")); // beba
    }
}
/* correct output:

WordReplacementCipher(al, be)
WordReplacementCipher(al, ga)
WordReplacementCipher(ga, be)
true
false
false
false
true
0
0
taco
taco
bephabet
alphaalt
gaphabet
alphabet
bera
gara
true
beba

 */


