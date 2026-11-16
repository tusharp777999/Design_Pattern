package com.tushar.creational.pattern.singleton;

public class Program05_Solution04_Multithreading {
    public static void main(String[] args) throws Exception {

        Runnable task = () -> {
            Program05_Solution04_SingletonPattern obj =
                    Program05_Solution04_SingletonPattern.getInstance();

            System.out.println(
                    Thread.currentThread().getName()
                            + " : "
                            + System.identityHashCode(obj)
            );
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
