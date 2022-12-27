package com.hackerrank.string;

import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First String");
        String str1 = scanner.nextLine();
        System.out.println("Enter Second String");
        String str2 = scanner.nextLine();

        int length  = str1.length() + str2.length();
        System.out.println("the sum of their lengths is "+ length);
        int i = str1.compareTo(str2);
        String status;
        if (i > 0){
            status = "Yes";
        }else{
            status ="No";
        }

        String finalStr = str1.substring(0,1).toUpperCase()+str1.substring(1) + " " + str2.substring(0,1).toUpperCase()+str2.substring(1);
        System.out.println(finalStr);


    }
}
