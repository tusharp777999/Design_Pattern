package com.tushar.creational.pattern.singleton;

public class Program06_Solution05_SingletonPattern {
    private Program06_Solution05_SingletonPattern(){
        System.out.println("0 parameter constructor.");
    }

    //This is inner class which is static and create the outer class object.
    //The outer class is normal class and this class will not load at the time of class loading.
    private static class Program06_Solution05_SingletonPattern_InnerClass{
        private static Program06_Solution05_SingletonPattern INSTANCE = new Program06_Solution05_SingletonPattern();
    }

    //When we call this method then the inner static class will load and the object will get created.
    public static Program06_Solution05_SingletonPattern getInstance(){
        //It returns the outer class object.
        return Program06_Solution05_SingletonPattern_InnerClass.INSTANCE;
    }

    public void printMessage(){
        System.out.println("Instance method called.");
    }
}
