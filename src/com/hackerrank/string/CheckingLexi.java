package com.hackerrank.string;

import java.util.Arrays;

public class CheckingLexi {
    public static void main(String[] args) {
        String[] str = {"jittu", "pooja","neetu","ratna","sahebrao"};
        System.out.println(str.length);

        checkingLexi(str);
    }

    private static void checkingLexi(String[] str) {
        for (int i = 0; i < str.length; i++) {
           int status = str[i].compareTo(str[i+1]);
           if (status>0){

           }else {
               return;
           }
        }
    }
}
