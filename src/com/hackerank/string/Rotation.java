package com.hackerank.string;

public class Rotation {
    public static void main(String[] args) {
        String str1 = "android";
        String strrev = "";
        StringBuilder stringBuilder = new StringBuilder("android");
        System.out.println(stringBuilder);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);


        char[] chars = str1.toCharArray();
        System.out.println(chars.length);


        for (int i= chars.length-1;i>=0;i--){
            System.out.print(chars[i]);

        }

    }
}
