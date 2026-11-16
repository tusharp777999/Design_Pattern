package com.tushar.creational.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Program08_TestClass {

    public static void doSerialization(Program08_Serialization_DeSerialization_Use_In_SingletonPattern p1){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
            objectOutputStream.writeObject(p1);
            objectOutputStream.flush();
        } catch (Exception exception){
            exception.printStackTrace();
        }
        System.out.println("Object serialization is done...");
    }

    public static Program08_Serialization_DeSerialization_Use_In_SingletonPattern doDeserialization(){
        Program08_Serialization_DeSerialization_Use_In_SingletonPattern program08_Serialization_DeSerialization_Use_In_SingletonPattern = null;
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("data.ser"))) {
            program08_Serialization_DeSerialization_Use_In_SingletonPattern = (Program08_Serialization_DeSerialization_Use_In_SingletonPattern)objectInputStream.readObject();
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return program08_Serialization_DeSerialization_Use_In_SingletonPattern;
    }

    static void main() throws CloneNotSupportedException {
        Program08_Serialization_DeSerialization_Use_In_SingletonPattern p1 = Program08_Serialization_DeSerialization_Use_In_SingletonPattern.getInstance();
        doSerialization(p1);
        System.out.println("Object deserialization started...");
        Program08_Serialization_DeSerialization_Use_In_SingletonPattern p2 = doDeserialization();
        System.out.println("Object deserialization done...");
        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());
    }
}
