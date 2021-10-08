package com.cipher;

public class MorseCode implements Cipher{
    @Override
    public boolean isCipherAvailable() {
        return false;
    }

    @Override
    public Cipher getCipherArgs() {
        return null;
    }
}
