package com.tushar.creational.pattern.singleton.execute.create.object.without.constructor.execution;

import java.io.Serializable;

class Student implements Serializable {

    int id;
    String name;

    Student() {
        System.out.println("Student Constructor Executed!");
    }
}
