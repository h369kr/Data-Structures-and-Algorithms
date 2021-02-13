package com.company;
import java.util.Scanner;

public class Febonacci {

    static int feb(int x){

        if(x <= 1){
            return x;
        }
        else{
            return feb(x-2)+feb(x-1);
        }

    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(feb(n));


    }
}
