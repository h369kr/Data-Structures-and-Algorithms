package com.company;
import java.util.Scanner;

public class CWH_TakingInput {


    static int sum(int ...arr){
        int result = 0;
        for(int a : arr){
            result+=a;
        }
        return result;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(a);
//        float b = sc.nextFloat();
//        System.out.println(b);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
//        String str = sc.next();    only for one word
//        System.out.println(str);
//        String s = sc.nextLine();
//        System.out.println(s);
//        String name = new String("" + "HARSH KUMAR");
//        System.out.println(name);

        System.out.println(sum());
    }
}
