package com.cipher;

import java.util.HashMap;
import java.util.Map;

public class Rot13Cipher implements Cipher {
    private Map<Character, Character> map;

    public Rot13Cipher(){
        map = new HashMap<>();
        initializeMap();
    }

    @Override
    public boolean isCipherAvailable() {
        return false;
    }

    @Override
    public Cipher getCipherArgs() {
        return null;
    }

    /**
     * Encrypt each letter to rot13 alphabet
     * When an alphabet letter is provided the function returns map value based on key
     * @param character each character from a string
     * @return encrypted character
     */
    private char encryptLetter(char character) {
        return map.get(character);
    }

    /**
     * Decrypt encrypted letter to alphabet letter
     * When the encrypted character is provided function returns the key based on value
     * @param character each character from a string
     * @return decrypted character
     */
    private char decryptLetter(char character) {
        for(Map.Entry<Character, Character> entry : map.entrySet()){
            if(character == entry.getValue()) {
                return entry.getKey();
            }
        }
        return ' ';
    }

    /**
     * Encrypt string
     * When a string is provided the function returns the encrypted version
     * @param text provided string
     * @return encrypted string
     */
    public String encrypt(String text) {
        String encrypted = "";
       for(int i = 0; i < text.length(); i++){
           if(Character.isLetter(text.charAt(i)))
               encrypted += String.valueOf(encryptLetter(text.toLowerCase().charAt(i)));
           else
               encrypted += text.charAt(i);
       }
       return encrypted;
    }

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
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase();
        String rot13Alphabet = "NOPQRSTUVWXYZABCDEFGHIJKLM".toLowerCase();
        for(int i = 0; i < alphabet.length();i++) {
            map.put(alphabet.charAt(i), rot13Alphabet.charAt(i));
        }
    }

}
