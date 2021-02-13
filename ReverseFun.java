package com.company;
import java.util.Scanner;

class StringFormatter {
    public static void reverseString(String str, int start, int end, int n){
        char ch[]=str.toCharArray();
        char temp;
        while(start < end) {
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        printArr(ch,n);
    }
    public static void printArr(char ch[], int n){
        for(int i=0;i<n;i++){
            System.out.print(ch[i]);
        }
    }
}

public class ReverseFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        StringFormatter.reverseString(str,0,n-1,n);
    }
}