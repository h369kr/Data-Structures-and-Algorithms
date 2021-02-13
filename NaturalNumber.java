package com.company;
import java.util.Scanner;

public class NaturalNumber {
    static int sum(int n) {
        if(n==0||n==1){
            return n;
        }
        else{
            return n+sum(n-1);
        }
    }
    static void pattern(){
        int v = 4;
        for(int i=0;i<v;i++){
            for(int j=0;j<v-i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //System.out.println(sum(n));
        pattern();
    }
}
