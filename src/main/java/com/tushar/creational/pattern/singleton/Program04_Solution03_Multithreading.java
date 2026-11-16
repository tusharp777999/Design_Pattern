package com.tushar.creational.pattern.singleton;

public class Program04_Solution03_Multithreading {
    public static void main(String[] args) throws Exception {

        Runnable task = () -> {
            Program04_Solution03_SingletonPattern obj =
                    Program04_Solution03_SingletonPattern.getInstance();

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
