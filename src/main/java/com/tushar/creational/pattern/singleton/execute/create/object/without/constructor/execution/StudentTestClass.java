package com.tushar.creational.pattern.singleton.execute.create.object.without.constructor.execution;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTestClass {

    public static void main(String[] args) throws Exception {

        // STEP 1: Create object normally
        Student s1 = new Student();

        s1.id = 101;
        s1.name = "Rahul";

        // STEP 2: Serialization
        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("student.txt"));

        out.writeObject(s1);
        out.close();

        System.out.println("Serialization completed!");

        // STEP 3: Deserialization
        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("student.txt"));

        Student s2 = (Student) in.readObject();

        in.close();

        System.out.println("Deserialization completed!");

        // STEP 4: Print object data
        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}
