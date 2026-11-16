package com.tushar.creational.pattern.singleton;

public class Program01_SingletonPattern {
    private static Program01_SingletonPattern INSTANCE;

    private Program01_SingletonPattern(){
        System.out.println("0 parameter constructor.");
    }

    public static Program01_SingletonPattern getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Program01_SingletonPattern();
        }
        return INSTANCE;
    }

    public void printMessage(){
        System.out.println("Instance method called.");
    }
}
