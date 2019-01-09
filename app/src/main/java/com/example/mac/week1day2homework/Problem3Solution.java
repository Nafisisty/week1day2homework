package com.example.mac.week1day2homework;

public class Problem3Solution {

    public static void main(String[] args){

        for(int i = 0; i <= 20; i++){

            fizzBuzz(i);

        }

    }

    public static void fizzBuzz(int count){

        if(count%3 == 0 && count%5 == 0)
            System.out.println("fizzbuzz");
        else if(count%3 == 0)
            System.out.println("fizz");
        else if(count%5 == 0)
            System.out.println("buzz");
        else
            System.out.println("" + count);

    }
}
