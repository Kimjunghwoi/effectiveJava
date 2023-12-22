package prac.effectivejava.etc.jasypt;


import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;


public class EncDecJASYPT {

    private static String mpCryptoPassword = "password";

    public static void main(String[] args) {
        String value = "Original Text: Eclipse";

//        System.out.println("Original Value : "+value);
//        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
//        encryptor.setPassword(mpCryptoPassword);
//        String encryptedPassword = encryptor.encrypt(value);
//        System.out.println(encryptedPassword);

        StandardPBEStringEncryptor decrypt = new StandardPBEStringEncryptor();
        decrypt.setPassword(mpCryptoPassword);
        decrypt.setProvider(new BouncyCastleProvider());
        decrypt.setAlgorithm("PBEWITHSHA256AND128BITAES-CBC-BC");
        System.out.println(decrypt.decrypt("/AD1ohyRADh69+1wUBW5mQvGKtbfTUon2Mee9CqMPXw="));
    }
}
