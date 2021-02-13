package com.company;

class Base{

//    Base(){
//        System.out.println("This one is Base");
//    }
    Base(int n){
        System.out.println("This is a base overloaded constructor having value : "+n);
    }
}
class Derived extends Base{
//    Derived(){
//        super(5);
//        System.out.println("This one is derived");
//    }
    Derived(int n,int y){
        super(n);
        System.out.println("This is a derived overloaded constructor having value : "+y);
    }
}
class Bd extends Derived{
    Bd(int n,int y,int z){
        super(n,y);
        System.out.println("This is a bd overloaded constructor having value : "+z);
        System.out.println("Sum : " + (n+y+z));
    }
}

public class InheritanceConstructor {
    public static void main(String[]args) {
        /* Base b =new Base(); */
        Bd bd = new Bd(14,15+5,16);

    }
}
