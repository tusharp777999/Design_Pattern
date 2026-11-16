package com.tushar.creational.pattern.singleton;

public class Program08_Serialization_DeSerialization_Use_In_SingletonPattern extends Program08_Common_Utils{
    private static Program08_Serialization_DeSerialization_Use_In_SingletonPattern INSTANCE;

    private Program08_Serialization_DeSerialization_Use_In_SingletonPattern(){
        System.out.println("0 parameter constructor.");
    }

    public static Program08_Serialization_DeSerialization_Use_In_SingletonPattern getInstance(){
        synchronized (Program08_Serialization_DeSerialization_Use_In_SingletonPattern.class) {//class level locking (static properties will be locked)
            if (INSTANCE == null) {
                INSTANCE = new Program08_Serialization_DeSerialization_Use_In_SingletonPattern();
            }
        }
        return INSTANCE;
    }
    //Solution 1: Throw exception.
//    public Object readResolve(){
//        throw new IllegalArgumentException("Deserialization not supported.");
//    }

    //Solution 2: Return same instance.(Best Solution)
    private Object readResolve(){
        return INSTANCE;
    }

    public void printMessage(){
        System.out.println("Instance method called.");
    }
}
