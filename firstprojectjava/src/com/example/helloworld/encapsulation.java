package com.example.helloworld;

public class encapsulation {
    private String name;

    //getter
    public String getName(){
        return name;
    }
    public void setName(String newValue)
    {
        this.name = newValue;
        //
    }
    public static void main(String[] args) {
        encapsulation obj = new encapsulation();
        obj.name ="John";
        System.out.println(obj.name);

    }
}
