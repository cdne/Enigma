package com.cipher;

public class RailFence implements Cipher {
    @Override
    public boolean isCipherAvailable() {
        return false;
    }

    @Override
    public Cipher getCipherArgs() {
        return null;
    }
}
