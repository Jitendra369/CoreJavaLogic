package com.hackerrank.string;

//A palindrome is a word, phrase, number, or other sequence of characters which reads
// the same backward or forward.
//Given a string , print Yes if it is a palindrome, print No otherwise.
//Constraints will consist at most  lower case english letters.

public class Palidrom {
    public static void main(String[] args) {

//        boolean flag=false;
//        int end=A.length()-1;
//        for(int start=0;start<=A.length()/2;start++){
//            if(A.charAt(start)==(A.charAt(end))){ flag=true; end--;
//            }else{
//                flag=false; break; }
//        } if(flag==true)
//            System.out.println("Yes");
//        else System.out.println("No");
//

        String pali = "java";
//        for (int i=0;i< pali.length();i++){
//            System.out.println(pali.charAt(i));
//        }

//        StringBuffer buffer = new StringBuffer(pali);
//        String buffer1 =  buffer.reverse().toString();
//        if (pali.equals(buffer1)){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }

        String str ="tenet";
        boolean flag = false;
        int len = str.length()/2;
        int end  = str.length()-1;
        for (int i=0; i < str.length();i++){
            if (str.charAt(i) == str.charAt(end)){
                flag = true;
            }else{
                flag = false;
            }
        }
        if (flag){
            System.out.println("palidrom");
        }else{
            System.out.println("not palidrom");
        }

        System.out.println(len+" End is  "+ end);


    }
}
