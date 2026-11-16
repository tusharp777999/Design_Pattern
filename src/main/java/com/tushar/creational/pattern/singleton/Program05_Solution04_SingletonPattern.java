package com.tushar.creational.pattern.singleton;

public class Program05_Solution04_SingletonPattern {
    //Here we create the object initially.
    private static Program05_Solution04_SingletonPattern INSTANCE = new Program05_Solution04_SingletonPattern();

    private Program05_Solution04_SingletonPattern(){
        System.out.println("0 parameter constructor.");
    }

    //No need to check null or synchronized as we already created the object only returning it.
    //Issue with this even if we dont want to use object still at the time of class loading it will create object.
    //Class.forName("fully qualified class name") even if you do this it will create the object.
    public static Program05_Solution04_SingletonPattern getInstance(){
        return INSTANCE;
    }

    public void printMessage(){
        System.out.println("Instance method called.");
    }
}
