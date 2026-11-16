package com.tushar.creational.pattern.singleton;

public class Program02_Solution01_SingletonPattern {
    private static Program02_Solution01_SingletonPattern INSTANCE;

    private Program02_Solution01_SingletonPattern(){
        System.out.println("0 parameter constructor.");
    }

    //It solves the problem of in multithreading environment using synchronization method.
    //Note: It is good practice instead of blocking whole method synchronize the particular logic using static block
    public synchronized static Program02_Solution01_SingletonPattern getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Program02_Solution01_SingletonPattern();
        }
        return INSTANCE;
    }

    public void printMessage(){
        System.out.println("Instance method called.");
    }
}
