package com.PBEwithMD5andDES;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;


public class Main {

	public static void main(String[] args) {
		EncryptDecryptEngine obj=new EncryptDecryptEngine();
		String originalPassword = "mahesh";
        System.out.println("Original password: " + originalPassword);
        String encryptedPassword=null;
        String decryptedPassword=null;
        try {
			encryptedPassword = obj.encrypt(originalPassword);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Encrypted password: " + encryptedPassword);
        
		try {
			decryptedPassword = obj.decrypt(encryptedPassword);
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Decrypted password: " + decryptedPassword);
	}

}
