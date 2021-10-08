package com.cipher;public class Rot13Cipher {
    /**
     * Initialize map for rot13cipher
     * For each key add alphabet letter and for value add rot 13 equivalent letter
     */
    private void initializeMap(){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase(Locale.ROOT);
        String rot13Alphabet = "NOPQRSTUVWXYZABCDEFGHIJKLM".toLowerCase(Locale.ROOT);
        for(int i = 0; i < alphabet.length();i++) {
            map.put(alphabet.charAt(i), rot13Alphabet.charAt(i));
        }
    }

}
