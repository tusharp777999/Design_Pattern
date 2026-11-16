package com.tushar.creational.pattern.singleton.execute.create.object.without.constructor.execution;

public class EmployeeCloning {
    public static void main(String[] args) throws Exception {

        // Original object
        Employee e1 = new Employee();

        e1.id = 101;
        e1.name = "Rahul";

        // Cloning
        Employee s2 = (Employee) e1.clone();

        System.out.println("Cloning completed!");

        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}
