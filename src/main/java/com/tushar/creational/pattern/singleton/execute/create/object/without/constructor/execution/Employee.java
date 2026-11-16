package com.tushar.creational.pattern.singleton.execute.create.object.without.constructor.execution;

class Employee implements Cloneable {

    int id;
    String name;

    Employee() {
        System.out.println("Employee Constructor Executed!");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
