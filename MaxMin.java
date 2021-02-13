package com.company;
import java.util.Scanner;

public class MaxMin extends Object{

    public static void maMin(int arr[],int n){
        int max = -987654321;
        int min = 987654321;

        for(int i=0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max : "+ max);

        for(int i=0;i<n;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min : "+ min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        maMin(arr, n);
    }
}

