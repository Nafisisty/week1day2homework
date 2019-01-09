package com.example.mac.week1day2homework;

import java.util.ArrayList;

public class Problem1Solution {

    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("father");
        stringArrayList.add("mother");
        stringArrayList.add("brother");
        stringArrayList.add("sister");
        stringArrayList.add("father");
        stringArrayList.add("wife");
        stringArrayList.add("father");
        stringArrayList.add("father");
        stringArrayList.add("sister");

        findDuplicates(stringArrayList);

    }

    public static void findDuplicates(ArrayList<String> strings){

        ArrayList<String> checkedStrings = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {

            if(checkedStrings.contains(strings.get(i)) == false) {

                for (int j = i + 1; j < strings.size(); j++) {


                    String str1 = strings.get(i);
                    String str2 = strings.get(j);

                    if (str1.equals(str2)) {
                        checkedStrings.add(str1);
                        System.out.println(str1);
                    }
                }
            }
        }

    }

}
