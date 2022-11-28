/**
 * This class tests the equals function in more depth. Current equality tests didn't go across multiple classes.
 */
public class ExtendedEqualityTests {

    public static void main(String[] args) {

        // setup objects, For each type of object I have one "matching" and one "not matching" where possible.
        // additionally, I'm making baseciphers with the same name as other not-base ciphers.
        // note, in inheritance situations like this sometimes equality becomes non-symetric, which is tricky. It's hard
        // to fix this without more work than I wanted us to deal with right now.

        BaseCipher bc1 = new BaseCipher("bc1");
        BaseCipher bc2 = new BaseCipher("bc2");
        BaseCipher bc3 = new BaseCipher("bc1");

        CaesarCipher cc1 = new CaesarCipher(1);
        CaesarCipher cc2 = new CaesarCipher(2);
        CaesarCipher cc3 = new CaesarCipher(1);
        BaseCipher bc4 = new BaseCipher(cc1.getCipherName());

        EvenOddCipher eoc1 = new EvenOddCipher();
        EvenOddCipher eoc2 = new EvenOddCipher();
        BaseCipher bc5 = new BaseCipher(eoc1.getCipherName());

        WordReplacementCipher wrc1 = new WordReplacementCipher("word", "replace");
        WordReplacementCipher wrc2 = new WordReplacementCipher("word", "nacho");
        WordReplacementCipher wrc3 = new WordReplacementCipher("taco", "replace");
        WordReplacementCipher wrc4 = new WordReplacementCipher("taco", "nacho");
        WordReplacementCipher wrc5 = new WordReplacementCipher("word", "replace");
        BaseCipher bc6 = new BaseCipher(wrc1.getCipherName());

        // tests within ciphers
        System.out.println(bc1.equals(bc2));   // false
        System.out.println(bc1.equals(bc3));   // true
        System.out.println(cc1.equals(cc2));   // false
        System.out.println(cc1.equals(cc3));   // true
        System.out.println(eoc1.equals(eoc2)); // true
        System.out.println(wrc1.equals(wrc2)); // false
        System.out.println(wrc1.equals(wrc3)); // false
        System.out.println(wrc1.equals(wrc4)); // false
        System.out.println(wrc1.equals(wrc5)); // true
        System.out.println("==");
        // tests between ciphers
        System.out.println(cc1.equals(bc1));    // false
        System.out.println(cc1.equals(bc4));    // false
        System.out.println(cc1.equals(eoc1));   // false
        System.out.println(cc1.equals(wrc1));   // false
        System.out.println(eoc1.equals(bc1));   // false
        System.out.println(eoc1.equals(bc5));   // false
        System.out.println(eoc1.equals(cc1));   // false
        System.out.println(eoc1.equals(wrc1));  // false
        System.out.println(wrc1.equals(bc1));   // false
        System.out.println(wrc1.equals(bc6));   // false
        System.out.println(wrc1.equals(cc1));   // false
        System.out.println(wrc1.equals(eoc1));  // false
        System.out.println("==");
        // and finally, no one should choke on null. null variables exist, and we don't want to go nuts on them.
        System.out.println(bc1.equals(null));   // false
        System.out.println(cc1.equals(null));   // false
        System.out.println(eoc1.equals(null));   // false
        System.out.println(wrc1.equals(null));   // false

    }
}
