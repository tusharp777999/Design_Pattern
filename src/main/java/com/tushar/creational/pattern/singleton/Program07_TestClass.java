package com.tushar.creational.pattern.singleton;

public class Program07_TestClass {
    static void main() throws CloneNotSupportedException {
        Program07_Cloneable_Use_In_SingletonPattern p1 = Program07_Cloneable_Use_In_SingletonPattern.getInstance();
        Program07_Cloneable_Use_In_SingletonPattern p2 = (Program07_Cloneable_Use_In_SingletonPattern)p1.clone();
        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());
        System.out.println("p1 == p2: " + (p1 == p2));
    }
}
