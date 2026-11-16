package com.tushar.creational.pattern.singleton;

public class Program09_Reflection_API_SingletonPattern {
    private static Program09_Reflection_API_SingletonPattern INSTANCE;

    //Solution 2:
    private static boolean isInstantiated = false;

    private Program09_Reflection_API_SingletonPattern(){
        //Solution 1: It works when we first create object using getInstance() if we firstly create object
        //using Reflection API it will not work as expected. Because INSTANCE initialized by getInstance() method
        //only. If we create first objects using reflection the INSTANCE never get initialized. hence it is not a
        //good solution
//        if(INSTANCE != null) {
//            throw new RuntimeException("Object already created.");
//        }

        //Solution 2: It works in any condition even if you create firstly using Reflection API or getInstance().
        if(isInstantiated){
            throw new RuntimeException("Object already created.");
        } else {
            isInstantiated = true;
        }
        System.out.println("0 parameter constructor.");
    }

    public static Program09_Reflection_API_SingletonPattern getInstance(){
        if (INSTANCE == null) {
            synchronized (Program09_Reflection_API_SingletonPattern.class) {//class level locking (static properties will be locked)
                if (INSTANCE == null) {
                    INSTANCE = new Program09_Reflection_API_SingletonPattern();
                }
            }
        }
        return INSTANCE;
    }
}
