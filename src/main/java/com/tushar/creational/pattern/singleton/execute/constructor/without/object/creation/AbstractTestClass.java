package com.tushar.creational.pattern.singleton.execute.constructor.without.object.creation;

public class AbstractTestClass extends AbstractDemo {
    private String address;

    public AbstractTestClass(int id, String name, String address) {
        super(id, name);
        this.address = address;
    }

    public void printData(){
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("address: " + address);
    }

    static void main() {
        AbstractTestClass abstractTestClass = new AbstractTestClass(11, "Tushar", "Pune");
        abstractTestClass.printData();
    }
}
