package com.hackerrank.string;

//Given two strings of lowercase English letters,  and , perform the following operations:
//        Sum the lengths of  and .
//        Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
//        Capitalize the first letter and print them on a single line, separated by a space.

public class Lex {
    public static void main(String args[]){
        String name ="jitendra";
        String petName ="jittu";

           if (name.compareTo(petName)>0){
               System.out.println("greater");
           }else{
               System.out.println("smaller");
           }

           String first = name.substring(0, 1).toUpperCase()+name.substring(1);
           String second  = petName.substring(0,1).toUpperCase()+ petName.substring(1);
            System.out.println(first);
            System.out.println(second);
    }
}
