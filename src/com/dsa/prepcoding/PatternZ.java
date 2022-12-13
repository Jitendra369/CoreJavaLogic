package com.dsa.prepcoding;

public class PatternZ {
    public static void main(String[] args) {
        int size =5;
        for (int i=1;i<=size;i++){
            for (int j=1;j<=size;j++){
                if ((i+j)==size){
                    System.out.print("*");
//                    System.out.println( "value of i & j is :" + i+" "+j+" "+"*");
                }else{
                    System.out.println(" ");
                }
            }
        }
    }
}
