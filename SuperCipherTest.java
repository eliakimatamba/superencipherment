public class SuperCipherTest {
    public static void main(String[] args) {
        // Note, this test focuses on EncryptUtils, but does use code from other ciphers, don't expect it to work if
        // the individual cipher tests fail.

        // setup
        CaesarCipher cg = new CaesarCipher(1);
        CaesarCipher cb = new CaesarCipher(100);
        EvenOddCipher eoc = new EvenOddCipher();
        WordReplacementCipher wr = new WordReplacementCipher("al", "be");
//
        // tests for constructor and isValid and toString
        BaseCipher[] ciphers = new BaseCipher[]{cg};
        SuperCipher sup = new SuperCipher(ciphers);
        System.out.println(sup.isValid()); // true
        System.out.println(sup.toString()); // SuperCipher(Caesar(1))
//
        ciphers = new BaseCipher[]{cb};
        sup = new SuperCipher(ciphers);
        System.out.println(sup.isValid()); // false
        System.out.println(sup.toString()); // SuperCipher(Caesar(100))

        ciphers = new BaseCipher[]{cg, cb, eoc};
        sup = new SuperCipher(ciphers);
        System.out.println(sup.isValid()); // false
        System.out.println(sup.toString()); // SuperCipher(Caesar(1) | Caesar(100) | EvenOddCipher)
//
        ciphers = new BaseCipher[]{cg, wr, eoc};
        sup = new SuperCipher(ciphers);
        System.out.println(sup.isValid()); // true
        System.out.println(sup.toString()); // SuperCipher(Caesar(1) | WordReplacementCipher(al, be) | EvenOddCipher)
//
//        // tests for equals
        BaseCipher[] ciphers1 = new BaseCipher[]{cg, wr, eoc};
        SuperCipher sup1 = new SuperCipher(ciphers1);

        BaseCipher[] ciphers2 = new BaseCipher[]{new CaesarCipher(1), wr, new EvenOddCipher()};
        SuperCipher sup2 = new SuperCipher(ciphers2);
        System.out.println(sup1.equals(sup2)); // true
//
        ciphers2 = new BaseCipher[]{wr, cg, eoc};
        sup2 = new SuperCipher(ciphers2);
        System.out.println(sup1.equals(sup2)); // false

        ciphers2 = new BaseCipher[]{cg, wr};
        sup2 = new SuperCipher(ciphers2);
        System.out.println(sup1.equals(sup2)); // false
//
//        // tests for encrypt and decrypt
        String test = "";
        String encrypt = sup.encrypt(test);
        String decrypt = sup.decrypt(test);
        System.out.println(encrypt.length()); // 0 (empty string return expected)
        System.out.println(decrypt.length()); // 0 (empty string return expected)
//
        test = "abcdefgh";
        encrypt = sup.encrypt(test);
        decrypt = sup.decrypt("bdfhcegi");
        System.out.println(encrypt); // bdfhcegi
        System.out.println(decrypt); // abcdefgh

        test = "abcdefg";
        encrypt = sup.encrypt(test);
        decrypt = sup.decrypt("bdfhceg");
        System.out.println(encrypt); // bdfhceg
        System.out.println(decrypt); // abcdefg

        // Tests that make sure the inheritance structure is as expected.
        System.out.println(sup instanceof BaseCipher); // true
        // the following code should compile and run correctly.
        BaseCipher bc = sup;
        System.out.println(bc.encrypt("abc-xyz")); // bdyac-z
    }
}
/* correct output:

true
SuperCipher(Caesar(1))
false
SuperCipher(Caesar(100))
false
SuperCipher(Caesar(1) | Caesar(100) | EvenOddCipher)
true
SuperCipher(Caesar(1) | WordReplacementCipher(al, be) | EvenOddCipher)
true
false
false
0
0
bdfhcegi
abcdefgh
bdfhceg
abcdefg
true
bdyac-z

 */


