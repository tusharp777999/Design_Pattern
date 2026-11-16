package com.tushar.creational.pattern.singleton;

public class Program04_Solution03_SingletonPattern {
    private static Program04_Solution03_SingletonPattern INSTANCE;

    private Program04_Solution03_SingletonPattern(){
        System.out.println("0 parameter constructor.");
    }

    public static Program04_Solution03_SingletonPattern getInstance(){
        if(INSTANCE == null) {
            synchronized (Program04_Solution03_SingletonPattern.class) {//class level locking (static properties will be locked)
                if (INSTANCE == null) {
                    INSTANCE = new Program04_Solution03_SingletonPattern();
                }
            }
        }
        return INSTANCE;
    }

    public void printMessage(){
        System.out.println("Instance method called.");
    }
}
