package com.example.mac.week1day2homework;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4Solution {

    public static void main(String[] args){

        String givenString1, givenString2;

        System.out.println("Please Enter 1st Word");
        givenString1 = new Scanner(System.in).nextLine();
        givenString1 = givenString1.toLowerCase();

        System.out.println("Please Enter 2nd Word");
        givenString2 = new Scanner(System.in).nextLine();
        givenString2 = givenString2.toLowerCase();

        Boolean isAnagram = checkAnagrams(givenString1, givenString2);

        if(isAnagram)
            System.out.println("Anagram!!!");
        else
            System.out.println("Not Anagram!!!");

    }

    public static boolean checkAnagrams(String word1, String word2) {

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        if(arr1.length != arr2.length)
            return false;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++){

            if(arr1[i] != arr2[i])
                return false;
        }

        return true;
    }
}
