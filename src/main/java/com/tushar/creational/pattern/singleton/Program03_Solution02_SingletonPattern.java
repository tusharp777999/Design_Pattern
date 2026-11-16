package com.tushar.creational.pattern.singleton;

public class Program03_Solution02_SingletonPattern {
    private static Program03_Solution02_SingletonPattern INSTANCE;

    private Program03_Solution02_SingletonPattern(){
        System.out.println("0 parameter constructor.");
    }

    public static Program03_Solution02_SingletonPattern getInstance(){
        synchronized (Program03_Solution02_SingletonPattern.class) {//class level locking (static properties will be locked)
            if (INSTANCE == null) {
                INSTANCE = new Program03_Solution02_SingletonPattern();
            }
        }
        return INSTANCE;
    }

    public void printMessage(){
        System.out.println("Instance method called.");
    }
}
