package DSA_basic;

import java.util.Scanner;

public class PaternZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Matrix having M * N");
        System.out.println("Enter value of M");
        int m = scanner.nextInt();
        System.out.println("Enter value of N");
        int n = scanner.nextInt();

        int input[][]= new int[m][n];
        for (int i=0;i< m;i++){
            for (int j=0;j< n ;j++){
                if (i+j==4){
                    System.out.print("*");
                }
                if (i==0){
                    System.out.print("*");
                }
                if (j==(n-1)){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
