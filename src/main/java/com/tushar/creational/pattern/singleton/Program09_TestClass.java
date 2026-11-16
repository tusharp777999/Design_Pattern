package com.tushar.creational.pattern.singleton;

import java.lang.reflect.Constructor;

public class Program09_TestClass {
    static void main() {
        try {
            Class classs = Class.forName("com.tushar.creational.pattern.singleton.Program09_Reflection_API_SingletonPattern");
            //or Class classs = Program09_Reflection_API_SingletonPattern.class;

            Constructor[] constructor = classs.getDeclaredConstructors();

            //Access to the private constructor.
            constructor[0].setAccessible(true);

            Program09_Reflection_API_SingletonPattern p1 = Program09_Reflection_API_SingletonPattern.getInstance();
            //Creating objects using constructor.
            Program09_Reflection_API_SingletonPattern p2 = (Program09_Reflection_API_SingletonPattern) constructor[0].newInstance();
            Program09_Reflection_API_SingletonPattern p3 = (Program09_Reflection_API_SingletonPattern) constructor[0].newInstance();

            System.out.println("p1 hashCode: " + p1.hashCode());
            System.out.println("p2 hashCode: " + p2.hashCode());
            System.out.println("p3 hashCode: " + p3.hashCode());
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
