package com.tushar.creational.pattern.singleton;

public class Program06_Solution05_Multithreading {
    public static void main(String[] args) throws Exception {

        Runnable task = () -> {
            Program06_Solution05_SingletonPattern obj =
                    Program06_Solution05_SingletonPattern.getInstance();

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
