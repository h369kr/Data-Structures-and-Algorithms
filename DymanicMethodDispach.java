package com.company;


class Phone{
    public void greet(){
        System.out.println("Good morning");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }

}
class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("You're welcome");
    }
    @Override
    public void on(){
        System.out.println("Turning on SmartPhone");
    }
}

public class DymanicMethodDispach {
    public static void main(String[] args) {
        //Phone obj = new Phone();//Allowed
        //SmartPhone smobi = new SmartPhone();//Allowed
        //obj.name();
        Phone obj = new SmartPhone();//Allowed (Because Refernce of from superclass and obj is from subclass)
        //SmartPhone new1 = new Phone(); //Not allowed (Because refrence is of sub class and object is from super class)
        //obj.greet();
        obj.on();
        //obj.swagat();//Not allowed
    }

}
