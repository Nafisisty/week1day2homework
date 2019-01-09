package com.example.mac.week1day2homework;

import java.util.Scanner;

public class Problem2Solution {

    public static void main(String[] args) {

        String givenString;

        System.out.println("Give your input");

        givenString = new Scanner(System.in).nextLine();

        Boolean isPalindrome = checkPalindrome(givenString);

        if(isPalindrome)
            System.out.println("Palindrome!!!");
        else
            System.out.println("Not Palindrome!!!");


    }

    public static boolean checkPalindrome(String word) {

        String reversedWord = "";
        int length;

        word = word.toLowerCase();
        length = word.length();

        for ( int i = length - 1; i >= 0; i-- )
            reversedWord = reversedWord + word.charAt(i);

        if (word.equals(reversedWord))
            return true;

        return false;
    }
}
