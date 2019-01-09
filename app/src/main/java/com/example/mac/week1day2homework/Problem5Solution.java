package com.example.mac.week1day2homework;

public class Problem5Solution {

    public static void main(String[] args) {

        printTables();

    }

    public static void printTables() {

        int[][] array = new int[10][10];

        for (int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                array[i-1][j-1] = i*j;
                System.out.print("" + array[i-1][j-1] + " ");
            }
            System.out.println();
        }
    }
}
