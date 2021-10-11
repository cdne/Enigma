package com.cipher;

import java.util.HashMap;
import java.util.Map;

public class MorseCode implements Cipher {
    private Map<Character, String> morseCodeMap;

    public MorseCode() {
        this.morseCodeMap = new HashMap<>();
        initializeMorseCodeMap();
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
     * Encode the text in morse code
     * @param text provided code to encode in morse code
     * @return text in morse code
     */
    public String encode(String text) {
        String encrypted = "";
        for(int i = 0; i < text.length(); i++){
            if(Character.isLetter(text.charAt(i)))
                encrypted += morseCodeMap.get((text.toUpperCase().charAt(i))) + " ";
            else if(text.charAt(i) == ' ')
                encrypted += "/ ";

        }
        return encrypted;
    }

    /**
     * Decode the morse code text in human readable text
     * @param text provided string
     * @return decrypted text from morse code to uppercase words
     */
    public String decode(String text) {
        String[] textArray = text.split("\\s+");
        String decrypted = "";
        boolean characterIsFound = false;

        for(int i = 0; i < textArray.length;i++) {
            characterIsFound = false;
            for(Map.Entry<Character, String> entry : morseCodeMap.entrySet()){
                if(textArray[i].equalsIgnoreCase(entry.getValue())) {
                    decrypted += entry.getKey();
                }
                else if(textArray[i].equals("/") && !characterIsFound){
                    decrypted += " ";
                    characterIsFound = true;
                }
            }
        }

        return decrypted;
    }

    /**
     * For each letter and number add the morse code equivalent
     */
    private void initializeMorseCodeMap(){
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");
        morseCodeMap.put('1', ".----");
        morseCodeMap.put('2', "..---");
        morseCodeMap.put('3', "...--");
        morseCodeMap.put('4', "....-");
        morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "-....");
        morseCodeMap.put('7', "--...");
        morseCodeMap.put('8', "---..");
        morseCodeMap.put('9', "----.");
        morseCodeMap.put('0', "-----");
    }

}
