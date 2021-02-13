package com.company;
import java.util.Scanner;

public class Recursion {

    static  int fact(int x){
        if(x==0 || x==1){
            return 1;
        }
        else{
            return x * fact(x-1);
        }
    }
    static  int iter_fact(int x){
        if(x==0 || x==1){
            return 1;
        }
        else{
            int product = 1;
            for(int i=1;i<=x;i++){
                product*=i;
            }
            return product;
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Recursive factorial of number "+n+" is : "+fact(n));
        System.out.print("Iterative factorial of number "+n+" is : "+iter_fact(n));
    }
}
