import java.io.*;
import java.util.Scanner;


public class Neg{

    static void checkNeg(int arr[],int n){
        int j=0;
        int temp;
        for(int i=0;i<n;i++){
            if(arr[i] < 0 ){
                if(i!=j){           
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;     //Here when the element is negative then only we are incrementing "j"
            }
        }
    }

    static void printArr(int arr[],int n){
        for(int item : arr){
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        checkNeg(arr,n);
        printArr(arr,n);
        
    }
}