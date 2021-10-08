package com.cipher;

public class CipherFactory {
    public Cipher getCipher(String ciperType) {
        if(ciperType.equalsIgnoreCase("ROT13CIPHER")){
            return new Rot13Cipher();
        }
        else if(ciperType.equalsIgnoreCase("RAILFENCE")){
            return new RailFence();
        }
        else if(ciperType.equalsIgnoreCase("MORSECODE")){
            return new MorseCode();
        }
        else return null;
    }
}
