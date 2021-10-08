package com.cipher;public class Rot13Cipher {
    /**
     * Decrypt string
     * When an encrypted text is provided the function returns the decrypted string
     * @param text encrypted string
     * @return decrypted string
     */
    public String decrypt(String text) {
        String decrypted = "";
        for(int i = 0; i < text.length(); i++) {
            if(Character.isLetter(text.charAt(i)))
                decrypted += String.valueOf(decryptLetter(text.toLowerCase().charAt(i)));
            else
                decrypted += text.charAt(i);
        }
        return decrypted;
    }

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
