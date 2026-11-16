package com.tushar.creational.pattern.singleton;

public class Program01_TestClass {
    static void main() {
        Program01_SingletonPattern program01SingletonPattern = Program01_SingletonPattern.getInstance();
        Program01_SingletonPattern program01SingletonPattern1 = Program01_SingletonPattern.getInstance();

        System.out.println("Hash code for program01SingletonPattern: " + program01SingletonPattern.hashCode());
        System.out.println("Hash code for program01SingletonPattern1: " + program01SingletonPattern1.hashCode());
        System.out.println("=====Compare hash code=====");
        System.out.println(program01SingletonPattern == program01SingletonPattern1);
    }
}
