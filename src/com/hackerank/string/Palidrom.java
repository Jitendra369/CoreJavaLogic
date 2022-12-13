package com.hackerank.string;

public class Palidrom {
    public static void main(String[] args) {
        String strOdd = "maadam";
        String strEven ="naam";

        boolean result  = checkPalidriom(strOdd);
        if (result == true){
            System.out.println("String is palidrom");
        }else{
            System.out.println("String is not a palidrom");
        }
    }

    private static boolean checkPalidriom(String strOdd) {

        boolean result = false;
        int length = strOdd.length();  // 5
        int middlePointer = length/2;  // 5/2 = 2

        for (int i=0;i< middlePointer;i++){
            for (int j=length-1; j> middlePointer;j--){
                if (strOdd.charAt(i)== strOdd.charAt(j)){
                    result = true;
                }else{
                    result = false;
                }
            }
        }
        return result;
    }
}
