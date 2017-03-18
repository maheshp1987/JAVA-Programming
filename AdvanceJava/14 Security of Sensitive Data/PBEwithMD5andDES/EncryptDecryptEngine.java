package com.PBEwithMD5andDES;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import Decoder.BASE64Decoder;
import Decoder.BASE64Encoder;

public class EncryptDecryptEngine {

    private static final char[] PASSWORD = "secret".toCharArray();
    private static final byte[] SALT = { (byte) 0xde, (byte) 0x33, (byte) 0x10, (byte) 0x12, (byte) 0xde, (byte) 0x33,
            (byte) 0x10, (byte) 0x12, };

 public String encrypt(String property) throws GeneralSecurityException,UnsupportedEncodingException {
    	 SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
	     SecretKey key = keyFactory.generateSecret(new PBEKeySpec(PASSWORD));
         Cipher pbeCipher = Cipher.getInstance("PBEWithMD5AndDES");
         pbeCipher.init(Cipher.ENCRYPT_MODE, key, new PBEParameterSpec(SALT, 20));
         return base64Encode(pbeCipher.doFinal(property.getBytes("UTF-8")));
     }

  public String base64Encode(byte[] bytes) {
          return new BASE64Encoder().encode(bytes);
    }

    public String decrypt(String property) throws GeneralSecurityException, IOException {
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
        SecretKey key = keyFactory.generateSecret(new PBEKeySpec(PASSWORD));
        Cipher pbeCipher = Cipher.getInstance("PBEWithMD5AndDES");
        pbeCipher.init(Cipher.DECRYPT_MODE, key, new PBEParameterSpec(SALT, 20));
        return new String(pbeCipher.doFinal(base64Decode(property)), "UTF-8");
    }

    public byte[] base64Decode(String property) throws IOException {
          return new BASE64Decoder().decodeBuffer(property);
    }

}