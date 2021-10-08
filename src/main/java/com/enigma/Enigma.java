package com.enigma;

import com.cipher.Cipher;
import com.cipher.CipherFactory;
import com.cipher.Rot13Cipher;

public class Enigma {
    public static void main(String[] args) {
        System.out.println("Test");

        Rot13Cipher cipher = new Rot13Cipher();
        System.out.println(cipher.decrypt("qrsraqgurrnfgjnyybsgurpnfgyr"));


    }
}
