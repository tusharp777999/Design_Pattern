package com.tushar.creational.pattern.singleton;

public class Program02_Solution01_Multithreading {
    public static void main(String[] args) throws Exception {

        Runnable task = () -> {
            Program02_Solution01_SingletonPattern obj =
                    Program02_Solution01_SingletonPattern.getInstance();

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
