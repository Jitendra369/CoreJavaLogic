package com.hackerank.string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringToken {
    public static void main(String args[]) {
        String str = "this is jitendra ! ?kadu";
        String arr[] = str.trim().split("[!,,?,.,',@,+]");
        System.out.println("length is " + arr.length);
        StringTokenizer stc = new StringTokenizer(str, "[ !,?._'@]+");
        while (stc.hasMoreTokens()) {
            System.out.println(stc.nextToken());
        }

        int pos = str.lastIndexOf(str);
        System.out.println(pos);
    }
}

