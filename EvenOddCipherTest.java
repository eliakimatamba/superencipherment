public class EvenOddCipherTest {
    public static void main(String[] args) {
        // HOW TO USE THESE TESTS:
        // PLEASE UNCOMMENT AS YOU COMPLETE CODE
        // YOU WILL BE UNABLE TO RUN ANY CODE IF YOU UNCOMMENT A CALL TO A FUNCTION YOU HAVE YET TO WRITE

        // tests for constructor isValid, toString, and equals
        EvenOddCipher eoc1 = new EvenOddCipher();
        EvenOddCipher eoc2 = new EvenOddCipher();

        System.out.println(eoc1.toString()); // EvenOddCipher
        System.out.println(eoc2.toString()); // EvenOddCipher
//
        System.out.println(eoc1.equals(eoc2)); // true

        // tests for encrypt and decrypt
        String test = "";
        String encrypt = eoc1.encrypt(test);
        String decrypt = eoc1.decrypt(test);
        System.out.println(encrypt.length()); // 0 (empty string return expected)
        System.out.println(decrypt.length()); // 0 (empty string return expected)

        test = "abcdefgh";
        encrypt = eoc1.encrypt(test);
        decrypt = eoc1.decrypt("acegbdfh");
        System.out.println(encrypt); // acegbdfh
        System.out.println(decrypt); // abcdefgh

        test = "abcdefg";
        encrypt = eoc1.encrypt(test);
        decrypt = eoc1.decrypt("acegbdf");
        System.out.println(encrypt); // acegbdf
        System.out.println(decrypt); // abcdefg

        // Tests that make sure the inheritance structure is as expected.
        System.out.println(eoc1 instanceof BaseCipher); // true
        // the following code should compile and run correctly.
        BaseCipher bc = eoc1;
        System.out.println(bc.encrypt("abc-xyz")); // acxzb-y
    }
}
/* correct output:

EvenOddCipher
EvenOddCipher
true
0
0
acegbdfh
abcdefgh
acegbdf
abcdefg
true
acxzb-y

 */


