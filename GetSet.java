package com.company;

class GetterSetter{
    private String name;
    public void getName(String word){
        name = word;
    }
    public void setName(){
        System.out.println(name);
    }
}

public class GetSet {
    public static void main(String[]args){
        GetterSetter gs = new GetterSetter();
        gs.getName("Harsh");
        gs.setName();
    }

}
