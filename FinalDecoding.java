//Ruide Xie

import java.util.Arrays;

//FinalDecoding class
public class FinalDecoding {
    public static void main(String[] args) {
        String[] encoded = {
                "jjdtdbsxy zjyjbw.kwzfjd  hzqdma  qsy tn!dzxj nx  fjy hzw m wq zwsq ywin dlwl,yj yxfxrq fywt tps yz tr wus-fp msnbq fjahtd fm fm fawgi fy twq m ti tysyq,nfyfq fjfuf ti y t j,kwynma tfvnjyjlnqhwjydxtj sr ffj msn'  nujryj kmtnln uy dutfjys.yj  nqma nyw!m fm fm!",
                "ufjtjt m qsn ji.yjlnqn ywin dlwl,gyna j s kn' zwx htws tr stryt dlwl f  rq zswgqy y31f aw tss.yn tqsyg tjxrq.mx s kyjuf xwfd m wq xxtj sr ffj z 'jrytjt yxlfi.fhinly dnkwfnsr ffjmxfxfqaqjfnndf :2rjjdrwnl mxhzi' jrw nuj",
                "ufjtjbs k nmz  nh.ufjytn ji tglsmx s jytkbytyfmym mx b xwfdy jn.",
                "ufjytn was tjyr txrs msjuhj.yjutfjys jqdijsybs tbw nmyn wq.yn nqyp tjyr.kwzfjdyjsnmtmt wj tx' sbnrmw j.x tlf mdisypt,na t njmx b xutnlrw njhsznlyf cjyi m wus-fpwfq tx' fyy tpby mxlnq mxbq fjxr nj tysyq m jlgwtitiwijsypt ' jjdy tqs xyj t' sb 'jlyyr."

        };
        // Your job is to decode this text... What we know:
        //  * First, a series of words has been replaced
        //     * "world" -> "neighborhood"
        //     * "enigma device" -> "grill"
        //     * "fort knox" -> "my garage"
        //     * "omni-matrix" -> "propane-tank"
        //     * "fort knox" -> "my garage"
        //  * Then an even - odd cipher is used
        //  * Finally, a ceaser cipher is used with key 5.
        // In this file, your job will be to
        //  * Make a series of Cipher objects
        //  * Pack them into an appropriate SuperCipher
        //  * Use the SuperCipher object to decode this secret message.

        BaseCipher[] cipherChain = { new CaesarCipher(5), new EvenOddCipher(),
                new WordReplacementCipher("fort knox","my garage"), new WordReplacementCipher("omni-matrix","propane-tank"),
                new WordReplacementCipher("enigma device","grill"), new WordReplacementCipher("world","neighborhood")
                // Todo: fill me.
        };

        SuperCipher superCipher = new SuperCipher(cipherChain);
        String[] decoded = EncryptUtils.decryptMany(superCipher, encoded);
        for (int i = 0; i < decoded.length; i++) {
            System.out.println(decoded[i]);
        }
    }
}
