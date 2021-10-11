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

    /**
     * Encrypt text with rail fence cipher
     * @param text text to be encrypted
     * @return encrypted text
     */
    public String encrypt(String text) {
        String encryptedText = "";
        boolean check = false;
        int j = 0;
        int row = 3;
        int col = text.length();
        char[][] railFenceArray = new char[row][col];

        for(int i = 0; i < col; i++) {
            if(j == 0 || j == 3 -1)
                check = !check;

            railFenceArray[j][i] = text.charAt(i);

            if(check)
                j++;
            else
                j--;
        }

        for(int i = 0; i < railFenceArray.length; i++){
            for(int k = 0;k < railFenceArray[i].length; k++){
               if(railFenceArray[i][k] != 0)
                   encryptedText += railFenceArray[i][k];
            }
        }

        return encryptedText;
    }

    /**
     * Decrypt text encrypted with rail fence cipher
     * @param text text to be decrypted
     * @return decrypted text
     */
    public String decrypt(String text) {
        String decryptedText = "";
        boolean check = false;
        int j = 0;
        int row = 3;
        int col = text.length();
        char[][] railsFenceArray = new char[row][col];

        for(int i = 0; i < col; i++) {
            if(j == 0 || j == 3 - 1)
                check = !check;

            railsFenceArray[j][i] = '*';

            if(check)
                j++;
            else
                j--;
        }

        int index = 0;

        for(int i = 0; i < row; i++){
            for(int k = 0; k < col; k++){
                if(railsFenceArray[i][k] == '*' && index < col) {
                    railsFenceArray[i][k] = text.charAt(index++);
                }
            }

        }

        for(int i = 0; i < col; i++) {
            if(j == 0 || j == 3 - 1)
                check = !check;

            decryptedText += railsFenceArray[j][i];

            if(check)
                j++;
            else
                j--;
        }
        return decryptedText;
    }
}
