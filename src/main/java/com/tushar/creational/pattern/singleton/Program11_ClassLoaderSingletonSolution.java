package com.tushar.creational.pattern.singleton;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class Program11_ClassLoaderSingletonSolution {
    static void main() {
        try {
            System.out.println("===Using Applicatin ClassLoader.===");
            Program02_Solution01_SingletonPattern program02_Solution01_SingletonPattern = Program02_Solution01_SingletonPattern.getInstance();
            System.out.println(program02_Solution01_SingletonPattern.getClass().getClassLoader());

            System.out.println("===Using URLClassLoader(Readymade Custom ClassLoader.)===");
            File jarFile = new File(
                    "/Users/tushar/Projects/Design_Pattern/src/main/java/com/tushar/creational/pattern/singleton/Design_Pattern-1.0-SNAPSHOT.jar"
            );

            URL[] urls = {jarFile.toURI().toURL()};

            //Solution:
            //But this solution not inside Singleton class it is from who is using in that it is so not the proper solution for this.
            URLClassLoader urlClassLoader = new URLClassLoader(urls, program02_Solution01_SingletonPattern.getClass().getClassLoader());//Providing the same class Loader which it is using.
            Class<?> clazz = urlClassLoader.loadClass("com.tushar.creational.pattern.singleton.Program02_Solution01_SingletonPattern");
            Method method = clazz.getMethod("getInstance", new Class[]{});//No arguments to the method hence empty class array.
            Object object = method.invoke(null);//invoking the method without parameter hence it is null.
            System.out.println("Object hashCode: " + object.hashCode());
            System.out.println("program02_Solution01_SingletonPattern hashCode: " + program02_Solution01_SingletonPattern.hashCode());
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}
