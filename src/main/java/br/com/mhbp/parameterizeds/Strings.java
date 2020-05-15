package br.com.mhbp.parameterizeds;

public class Strings {


    public boolean isPalindrome(String string) {
        int length = string.length();

        boolean isPalindrome = true;

        for(int beginIndex = 0; beginIndex < length; beginIndex++) {
            if(string.charAt(beginIndex) != string.charAt(length-1-beginIndex)) {
                System.out.println("String is not a palindrome.");
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}
