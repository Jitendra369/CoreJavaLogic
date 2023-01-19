package com.hackerank.string;

public class Palidrom {
    public static void main(String[] args) {
        String str = "madam";
//        String str = "java";

//        boolean result  = checkPalidriom(strOdd);
//        if (result == true){
//            System.out.println("String is palidrom");
//        }else{
//            System.out.println("String is not a palidrom");
//        }

          String isPalidrom =getReverseUsingSringBuilder(str);
//        System.out.println(isPalidrom);

        String result  = reverseString(str);
        System.out.println(result);
    }

    private static String reverseString(String str) {

        String rev ="";
        for (int i= str.length()-1;i>=0;i--){
            rev = rev + String.valueOf(str.charAt(i));
        }
        if (str.equalsIgnoreCase(rev.trim())){
            return "Yes";
        }
        return "No";
    }

    private static String getReverseUsingSringBuilder(String str) {
        if (str.equals(new StringBuilder(str).reverse().toString())){
            return "Yes";
        }
        return "No";
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
