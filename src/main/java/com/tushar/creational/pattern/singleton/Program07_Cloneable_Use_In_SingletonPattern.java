package com.tushar.creational.pattern.singleton;

public class Program07_Cloneable_Use_In_SingletonPattern extends Program07_Common_Utils{
    private static Program07_Cloneable_Use_In_SingletonPattern INSTANCE;

    private Program07_Cloneable_Use_In_SingletonPattern(){
        System.out.println("0 parameter constructor.");
    }

    public static Program07_Cloneable_Use_In_SingletonPattern getInstance(){
        synchronized (Program07_Cloneable_Use_In_SingletonPattern.class) {//class level locking (static properties will be locked)
            if (INSTANCE == null) {
                INSTANCE = new Program07_Cloneable_Use_In_SingletonPattern();
            }
        }
        return INSTANCE;
    }

//    Solutions on cloning the object.
//    1.Return same object whatever we are creating.
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return INSTANCE;
//    }

//    2.Raise the exception that cloning is not supported.(Best Solution)
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        throw new CloneNotSupportedException("This is singleton class which not supports cloning.");
//    }

    public void printMessage(){
        System.out.println("Instance method called.");
    }
}
